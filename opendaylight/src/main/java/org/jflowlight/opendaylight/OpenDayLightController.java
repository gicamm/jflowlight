package org.jflowlight.opendaylight;

import org.jflowlight.controller.Controller;
import org.jflowlight.model.flow.FlowModel;
import org.jflowlight.model.flow.InstructionModel;
import org.jflowlight.model.node.NodeConnectorModel;
import org.jflowlight.opendaylight.model.Instruction;
import org.jflowlight.opendaylight.wrapper.connector.NodeConnectorWrapper;
import org.jflowlight.opendaylight.wrapper.status.NodeStatusWrapper;
import org.jflowlight.opendaylight.wrapper.status.NodesStatusWrapper;
import org.jflowlight.opendaylight.wrapper.topology.NetworkTopologyWrapper;
import org.jflowlight.utils.rest.RestClient;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.jflowlight.JolException;
import org.jflowlight.model.Address;
import org.jflowlight.model.LinkModel;
import org.jflowlight.model.OpenflowNode;
import org.jflowlight.opendaylight.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.ws.rs.core.Response;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class OpenDayLightController implements Controller,
        AutoCloseable{

    protected final static Logger LOGGER = LoggerFactory.getLogger(OpenDayLightController.class);

    public static final Pattern tpIdPattern = Pattern.compile("openflow:((\\d)+):((\\d)+)");
    public static final Pattern tpIdHostPattern = Pattern.compile("host:(.*):openflow:((\\d)+):((\\d)+)");
    public static final Pattern hostIdPattern = Pattern.compile("host:(.*)");


    private final RestClient client;

    public OpenDayLightController(final String address, final int port, final String user, final String password) {
        client = new RestClient(address,port,user,password);
    }

    private String getNodeLabel(final Integer node){
        return  OpenDayLightConstants.OPENFLOW+OpenDayLightConstants.SEPARATOR+node;
    }

    private void throwIfNull(final Object obj,final String message) throws JolException {
        if(obj == null)
            throw new JolException(message);
    }

    private void throwIfEmpty(final Collection coll,final String message) throws JolException {
        throwIfNull(coll, message);
        if(coll.isEmpty())
            throw new JolException(message);
    }

    private void throwIfEmpty(final Map map,final String message) throws JolException {
        throwIfNull(map, message);
        if(map.isEmpty())
            throw new JolException(message);
    }

    /**
     *
     * @param list
     * @param message
     * @param <T>
     * @return the first element
     * @throws JolException
     */
    private <T>T returnFirstAndThrowIfEmpty(final Collection<T> list, final String message) throws JolException {
        if(list == null || list.isEmpty())
            throw new JolException(message);

        return list.iterator().next();
    }


    /**
     *
     * @return all hosts
     */
    @Override
    public Map<String,OpenflowNode> getHosts(){
        final Map<String,OpenflowNode> toReturn = new HashMap<>();
        for(final OpenflowNode node : getAllNode().values()){
            if(node.isLeaf())
                toReturn.put(node.getID(),node);
        }
        return toReturn;
    }


    private Pair<Pair<String,String>,Integer> buildTerminationPoint(final String tpId,final boolean src){
        if(StringUtils.isNotBlank(tpId)){
            Matcher matcher = tpIdPattern.matcher(tpId);

            if(matcher.matches()){
                return new ImmutablePair<Pair<String,String>,Integer>(new ImmutablePair<>(OpenDayLightConstants.OPENFLOW + OpenDayLightConstants.SEPARATOR + matcher.group(1),matcher.group(3)),Integer.valueOf(matcher.group(3)));
            }else if(src){
                matcher = tpIdHostPattern.matcher(tpId);
                if (matcher.matches()){
                    return new ImmutablePair<Pair<String,String>,Integer>(new ImmutablePair<>(OpenDayLightConstants.OPENFLOW + OpenDayLightConstants.SEPARATOR + matcher.group(2),matcher.group(1)),Integer.valueOf(matcher.group(4)));
                }
            }
        }

        return null;
    }

    /**
     *
     * @param ipv4
     * @return
     * @throws JolException
     */
    private Node getNode(final String ipv4) throws JolException{
        return getNode(ipv4, getTopology());
    }

    /**
     *
     * @param ipv4
     * @param topology
     * @return
     * @throws JolException
     */
    public Node getNode(final String ipv4, final List<Topology> topology) throws JolException{
        for(final Topology topo : topology){
            for(final Node node : topo.getNode()){
                if(containsAddress(ipv4, node))
                    return node;
            }
        }

        throw new JolException(MessageFormat.format("Unable to get node for [{0}]",ipv4));
    }

    private boolean containsAddress(final String ipv4, final Node node){
        final List<HostTrackerServiceAddress> hostTrackerServiceAddresses = node.getHostTrackerServiceAddresses();
        if(hostTrackerServiceAddresses != null) {

            for (final HostTrackerServiceAddress htsa : hostTrackerServiceAddresses) {
                if (StringUtils.equals(htsa.getIp(), ipv4))
                    return true;
            }
        }
        return false;
    }

    public Map<String, OpenflowNode> getAllNode(){
        final Map<String,OpenflowNode> toReturn = new HashMap<>();
        Matcher matcher;
        final List<Topology> topology = getTopology();
        final Collection<Node> allNode = getAllNode(topology);
        Address address;
        String nodeId;
        String switchID;
        Map<String, LinkModel> links;
        HostTrackerServiceAddress htsa;
        for(final Node node : allNode){
            address = null;
            nodeId = node.getNodeId();
            matcher = hostIdPattern.matcher(nodeId);
            if(matcher.find()){
                nodeId = matcher.group(1);
                links = getLinks(nodeId, topology, node);
                switchID = links.values().iterator().next().getDstID();
                if(!node.getHostTrackerServiceAddresses().isEmpty()){
                    htsa = node.getHostTrackerServiceAddresses().iterator().next();
                    address = new Address(htsa.getIp(),htsa.getMac());
                }
            }else {
                switchID = null;
                links = getLinks(nodeId, topology, node);
            }

            toReturn.put(nodeId, new OpenflowNode(nodeId, switchID).
                            addLink(links).
                            setAddresses(address)

            );

        }

        return toReturn;
    }

    /**
     *
     * @param srcID
     * @param topologies
     * @param node
     * @return all device's links
     */
    public Map<String, LinkModel> getLinks(final String srcID, final List<Topology> topologies, final Node node){

        final Map<String,LinkModel> toReturn = new HashMap<>();
        String src,dst;
        Pair<Pair<String, String>, Integer> srcPair;
        Pair<Pair<String, String>, Integer> dstPair;
        LinkModel.LinkType linkType;
        String dest;
        for (final Topology topology : topologies) {
            for (final Link link : topology.getLink()) {
                src = link.getSource().getSourceTp();
                dst = link.getDestination().getDestTp();

                srcPair = buildTerminationPoint(src, true);
                if(srcPair != null && StringUtils.equals(srcPair.getLeft().getLeft(),srcID) && (dstPair = buildTerminationPoint(dst,false)) != null){
                    if(StringUtils.equals(dstPair.getLeft().getLeft(),srcID)){
                        linkType = LinkModel.LinkType.SWITCH_LEAF;
                        dest = srcPair.getLeft().getRight();
                    }else {
                        linkType = LinkModel.LinkType.SWITCH_SWITCH;
                        dest = dstPair.getLeft().getLeft();
                    }

                    addPair(toReturn, srcPair.getLeft().getLeft(),srcPair.getRight(), dest,dstPair.getRight(), linkType);
                }

            }
        }

        String tpId;
        for(final HostTrackerServiceAttachmentPoint htsap : node.getHostTrackerServiceAttachmentPoints()){
            tpId = htsap.getTpId();
            if(StringUtils.isNotBlank(tpId)){
                dstPair = buildTerminationPoint(tpId, false);
                addPair(toReturn, null ,null,dstPair.getLeft().getLeft(),dstPair.getRight(),LinkModel.LinkType.SWITCH_LEAF);
            }
        }

        return toReturn;
    }

    private void addPair(final Map<String,LinkModel> toReturn, final String srcID, Integer srcPort, final String dstID, final Integer dstPort, LinkModel.LinkType linkType){
        if(StringUtils.isBlank(dstID))
            return;

        toReturn.put(dstID, new LinkModel(dstID, dstPort, srcPort != null ? srcPort : null, linkType));
    }

    public Collection<Node> getAllNode(final Collection<Topology> topologies){
        final Collection<Node> toReturn = new ArrayList<>();
        for(final Topology topology : topologies){
            toReturn.addAll(topology.getNode());
        }

        return toReturn;
    }

    /**
     *
     * @return
     */
    @Override
    public NodeConnectorModel getNodeConnection(final String switchID, final Integer port) throws JolException {
        final NodeConnectorWrapper nodeConnectorWrapper = client.get(NodeConnectorWrapper.class,
                OpenDayLightConstants.RESTCONF,
                OpenDayLightConstants.OPERATIONAL,
                OpenDayLightConstants.OPENDAYLIGHT_INVENTORY_NODES,
                OpenDayLightConstants.NODE,
                switchID,
                OpenDayLightConstants.NODE_CONNECTOR,
                switchID+OpenDayLightConstants.SEPARATOR+port);

        throwIfNull(nodeConnectorWrapper,"Unable to get connector");
        final List<NodeConnector> nodeConnector = nodeConnectorWrapper.getNodeConnector();

        if(nodeConnector.isEmpty())
            throw new JolException();

        final NodeConnector next = nodeConnector.iterator().next();

        final OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics portStatistics = next.getPortStatistics();

        final NodeConnectorModel toReturn = new NodeConnectorModel().
                setId(next.getId()).
                setBytesReceived(portStatistics.getBytes().getReceived()).
                setBytesTransmitted(portStatistics.getBytes().getTransmitted()).
                setPacketsReceived(portStatistics.getPackets().getReceived()).
                setPacketsTransmitted(portStatistics.getPackets().getTransmitted()).
                setDurationInSecond(portStatistics.getDuration().getSecond()).
                setDurationInNanosecond(portStatistics.getDuration().getNanosecond()).
                setTransmitErrors(portStatistics.getTransmitErrors()).
                setReceiveCrcError(portStatistics.getReceiveCrcError()).
                setReceiveErrors(portStatistics.getReceiveErrors()).
                setReceiveDrops(portStatistics.getReceiveDrops()).
                setTransmitDrops(portStatistics.getTransmitDrops()).
                setCollisionCount(portStatistics.getCollisionCount()).
                setFlowNodeInventoryConfiguration(next.getFlowNodeInventoryConfiguration()).
                setFlowNodeInventoryAdvertisedFeatures(next.getFlowNodeInventoryAdvertisedFeatures()).
                setFlowNodeInventoryPeerFeatures(next.getFlowNodeInventoryPeerFeatures()).
                setFlowNodeInventoryName(next.getFlowNodeInventoryName()).
                setFlowNodeInventoryCurrentFeature(next.getFlowNodeInventoryCurrentFeature()).
                setFlowNodeInventorySupported(next.getFlowNodeInventorySupported()).
                setFlowNodeInventoryMaximumSpeed(next.getFlowNodeInventoryMaximumSpeed()).
                setFlowNodeInventoryCurrentSpeed(next.getFlowNodeInventoryCurrentSpeed()).
                setFlowNodeInventoryPortNumber(next.getFlowNodeInventoryPortNumber()).
                setFlowNodeInventoryHardwareAddress(next.getFlowNodeInventoryHardwareAddress()).
                setLinkDown(next.getFlowNodeInventoryState().getLinkDown()).
                setLive(next.getFlowNodeInventoryState().getLive()).
                setBlocked(next.getFlowNodeInventoryState().getBlocked()).
                setStpStatusAwareNodeConnectorStatus(next.getStpStatusAwareNodeConnectorStatus());

        return toReturn;
    }



    /**
     *
     * @return
     */
    public List<Topology> getTopology(){
        final NetworkTopologyWrapper networkTopologyWrapper = client.get(NetworkTopologyWrapper.class,
                OpenDayLightConstants.RESTCONF,
                OpenDayLightConstants.OPERATIONAL,
                OpenDayLightConstants.NETWORK_TOPOLOGY_NETWORK_TOPOLOGY
        );

        return networkTopologyWrapper.getNetworkTopology().getTopology();
    }

    /**
     *
     * @return
     */
    public Map<String, NodeStatus> getNodeStatus() throws JolException {
        final NodesStatusWrapper nodesStatus = client.get(NodesStatusWrapper.class,
                OpenDayLightConstants.RESTCONF,
                OpenDayLightConstants.OPERATIONAL,
                OpenDayLightConstants.OPENDAYLIGHT_INVENTORY_NODES);

        final NodeStatusWrapper nodes = nodesStatus.getNodes();

        throwIfNull(nodes,"Unable to gen nodes");
        final Map<String,NodeStatus> toReturn = new HashMap<>();

        for(final NodeStatus ns : nodes.getNodes())
            toReturn.put(ns.getID(),ns);

        return toReturn;
    }

    /**
     *
     * @return
     */
    public NodeStatus getNodeStatus(final Integer id) throws JolException {
        return getNodeStatus(getNodeLabel(id));
    }

    /**
     *
     * @return
     */
    public NodeStatus getNodeStatus(final String id) throws JolException{
        final NodeStatusWrapper nodesStatus = client.get(NodeStatusWrapper.class,
                OpenDayLightConstants.RESTCONF,
                OpenDayLightConstants.OPERATIONAL,
                OpenDayLightConstants.OPENDAYLIGHT_INVENTORY_NODES,
                OpenDayLightConstants.NODE,
                id);

        return returnFirstAndThrowIfEmpty(nodesStatus.getNodes(), "Switch does not exist");
    }

    /**
     *
     * @return
     */
    @Override
    public Map<String, FlowModel> getFlow(final String switchID, final Integer tableID){
        final FlowsOpendaylight flowsOpendaylight = client.get(FlowsOpendaylight.class, OpenDayLightConstants.RESTCONF,
                OpenDayLightConstants.OPERATIONAL,
                OpenDayLightConstants.OPENDAYLIGHT_INVENTORY_NODES,
                OpenDayLightConstants.NODE,
                switchID,
                OpenDayLightConstants.TABLE,
                String.valueOf(tableID));

        final Map<String,FlowModel> toReturn = new ConcurrentHashMap<>();

        Map<String, FlowModel> map;
        for(final FlowNodeInventoryTable fit : flowsOpendaylight.getFlowNodeInventoryTable() ){
            map = buildFlowModel(fit, tableID);
            toReturn.putAll(map);
        }

        return toReturn;
    }


    /**
     *
     * @return
     */
    @Override
    public FlowModel getFlow(final String switchID, final Integer tableID, final Integer entryID) throws JolException{

        final FlowOpendaylight flowNodeInventoryTable = client.get(FlowOpendaylight.class, OpenDayLightConstants.RESTCONF,
                OpenDayLightConstants.OPERATIONAL,
                OpenDayLightConstants.OPENDAYLIGHT_INVENTORY_NODES,
                OpenDayLightConstants.NODE,
                switchID,
                OpenDayLightConstants.TABLE,
                String.valueOf(tableID),
                OpenDayLightConstants.FLOW,
                String.valueOf(entryID));

        final Map<String, FlowModel> map = buildFlowModel(flowNodeInventoryTable, tableID);
        if(map.isEmpty())
            throw new JolException(MessageFormat.format("The flow [{0}] [{1}:{2}] does not exist",switchID,tableID,entryID));

        return map.values().iterator().next();
    }

    private Map<String, FlowModel> buildFlowModel(final FlowOpendaylight flow, final Integer tableID){
        return buildFlowModel(flow.getFlows(),tableID);
    }

    private Map<String, FlowModel> buildFlowModel(final FlowNodeInventoryTable fit, final Integer tableID){
        final Map<String,FlowModel> toReturn = new ConcurrentHashMap<>();
        FlowModel flow;

        for(final Flow sourceFlow : fit.getFlow() ) {
            flow = buildFlowModel(sourceFlow,tableID);
            toReturn.put(flow.getId(), flow);
        }

        return toReturn;
    }

    /**
     *
     * @param flows
     * @param tableID
     * @return
     */
    private Map<String, FlowModel> buildFlowModel(final Collection<Flow> flows, final Integer tableID){
        FlowModel flow;
        final Map<String,FlowModel> toReturn = new ConcurrentHashMap<>();
        for(final Flow sourceFlow : flows ) {
            flow = buildFlowModel(sourceFlow,tableID);
            toReturn.put(flow.getId(), flow);
        }

        return toReturn;
    }


    /**
     *
     * @param sourceFlow
     * @param tableID
     * @return
     */
    private FlowModel buildFlowModel(final Flow sourceFlow,final Integer tableID){
        final FlowModel flow = new FlowModel();
        flow.setTableId(tableID);
        flow.setId(sourceFlow.getId());
        flow.setPriority(sourceFlow.getPriority());
        flow.setCookie(sourceFlow.getCookie());
        flow.setHardTimeout(sourceFlow.getHardTimeout());
        flow.setIdleTimeout(sourceFlow.getIdleTimeout());
        flow.setByteCount(sourceFlow.getOpendaylightFlowStatisticsFlowStatistics().getByteCount());
        flow.setPacketCount(sourceFlow.getOpendaylightFlowStatisticsFlowStatistics().getPacketCount());
        flow.setMatch(sourceFlow.getMatch());
        final Instructions instructions = sourceFlow.getInstructions();
        if(instructions != null) {
            InstructionModel instructionModel;
            final List<InstructionModel> instructionModels = new ArrayList<>();
            for(final  Instruction instruction : instructions.getInstruction()) {
                instructionModel = new InstructionModel().
                        setOrder(instruction.getOrder());

                instructionModels.add(instructionModel);
            }
            flow.setInstructions(instructionModels);
        }

        return flow;
    }

    /**
     *
     * @param flowname
     * @param switchID
     * @param priority
     * @param tableID
     * @param entryID
     * @param ipv4Srcs
     * @param ipv4Dsts
     * @param outputPort
     * @throws JolException
     */
    public void addFlowEntry(final String flowname, final String switchID, final Integer priority, final Integer tableID, final Integer entryID, final Collection<String> ipv4Srcs, final Collection<String> ipv4Dsts, final Collection<String> macSrcs, final Collection<String> macDsts, final Integer outputPort) throws JolException {
        addFlowEntry(flowname, switchID, priority, tableID, entryID, ipv4Srcs, ipv4Dsts, 32, macSrcs,macDsts, outputPort);
    }

    /**
     *
     * @param flowname
     * @param switchID
     * @param priority
     * @param tableID
     * @param entryID
     * @param ipv4Srcs
     * @param ipv4Dsts
     * @param ipBit
     * @param outputPort
     * @throws JolException
     */
    @Override
    public void addFlowEntry(final String flowname, final String switchID, final Integer priority, final Integer tableID, final Integer entryID, final Collection<String> ipv4Srcs, final Collection<String> ipv4Dsts, final int ipBit, final Collection<String> macSrcs,final Collection<String> macDsts,final Integer outputPort) throws JolException {
        String entry = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<flow xmlns=\"urn:opendaylight:flow:inventory\">\n" +
                "   <strict>true</strict>\n" +
                "   <instructions>\n" +
                "      <instruction>\n" +
                "         <order>0</order>\n" +
                "         <apply-actions>\n" +
                "            <action>\n" +
                "               <order>0</order>\n" +
                "               <output-action>\n";
        if(outputPort != null)
            entry = entry + "                  <output-node-connector>"+outputPort+"</output-node-connector>\n";
        entry = entry + "               </output-action>\n" +
                "            </action>\n" +
                "         </apply-actions>\n" +
                "      </instruction>\n" +
                "   </instructions>\n" +
                "   <table_id>"+tableID+"</table_id>\n" +
                "   <id>"+entryID+"</id>\n" +
                "   <cookie_mask>255</cookie_mask>\n" +
                "   <match>\n" +
                "      <ethernet-match>\n" +
                "         <ethernet-type>\n" +
                "            <type>2048</type>\n" +
                "         </ethernet-type>\n";

        if(macSrcs != null){
            for(final String src : new HashSet<>(macSrcs)) {
                if(src == null)
                    continue;
                entry = entry + "<ethernet-source><address>"+src+"</address></ethernet-source>\n";
            }
        }

        if(macDsts != null){
            for(final String src : new HashSet<>(macDsts)) {
                if(src == null)
                    continue;
                entry = entry + "<ethernet-destination><address>"+src+"</address></ethernet-destination>\n";
            }
        }

        entry = entry + "      </ethernet-match>\n";
        if(ipv4Srcs != null){
            for(final String ipv4Src : new HashSet<>(ipv4Srcs)) {
                if(ipv4Src == null)
                    continue;
                entry = entry + "       <ipv4-source>" + ipv4Src + "/" + ipBit + "</ipv4-source>\n";
            }
        }
        if(ipv4Dsts != null){
            for(final String ipv4Dst : new HashSet<>(ipv4Dsts)) {
                if(ipv4Dst == null)
                    continue;
                entry = entry + "       <ipv4-destination>" + ipv4Dst + "/" + ipBit + "</ipv4-destination>\n";
            }
        }
        entry = entry + "   </match>\n" +
                "   <hard-timeout>0</hard-timeout>\n" +
                "   <idle-timeout>0</idle-timeout>\n" +
//                "   <cookie>5</cookie>\n" +
                "   <flow-name>"+flowname+"</flow-name>\n";

        if(priority != null)
            entry = entry + "   <priority>"+priority+"</priority>\n";

        entry = entry + "   <barrier>false</barrier>\n" +
                "</flow>";
        if(LOGGER.isTraceEnabled())
            LOGGER.trace(entry);
        check(client.putXML("/restconf/config/opendaylight-inventory:nodes/node/" + switchID + "/table/" + tableID + "/flow/" + entryID + "/", entry));
    }


    /**
     *
     * @param flowname
     * @param switchID
     * @param priority
     * @param tableID
     * @param entryID
     * @param ipv4Src
     * @param ipv4Dst
     * @param outputPort
     * @throws JolException
     */
    public void addFlowEntry(final String flowname, final String switchID, final Integer priority, final Integer tableID, final Integer entryID, final String ipv4Src, final String ipv4Dst, final Integer outputPort) throws JolException {
        this.addFlowEntry(flowname,switchID,priority,tableID,entryID,ipv4Src,ipv4Dst,32,outputPort);
    }

    /**
     *
     * @param flowname
     * @param switchID
     * @param priority
     * @param tableID
     * @param entryID
     * @param ipv4Src
     * @param ipv4Dst
     * @param ipBit
     * @param outputPort
     * @throws JolException
     */
    public void addFlowEntry(final String flowname, final String switchID, final Integer priority, final Integer tableID, final Integer entryID, final String ipv4Src, final String ipv4Dst, final int ipBit, final Integer outputPort) throws JolException {
        addFlowEntry(flowname, switchID, priority, tableID, entryID, StringUtils.isNotBlank(ipv4Src) ? Arrays.asList(ipv4Src) : null, StringUtils.isNotBlank(ipv4Dst) ? Arrays.asList(ipv4Dst) : null, ipBit, null, null, outputPort);
    }

    private void check(final Response response)throws JolException{
        if(LOGGER.isDebugEnabled())
            LOGGER.debug("[{}]",response);
        //TODO throw if error
    }

    /**
     *
     * @param switchID
     * @param tableID
     * @param entryID
     * @throws JolException
     */
    @Override
    public void deleteFlowEntry(final String switchID, final Integer tableID, final Integer entryID) throws JolException {
        LOGGER.trace("[{}]",client.delete("/restconf/config/opendaylight-inventory:nodes/node/" + switchID + "/table/" + tableID + "/flow/" + entryID + "/"));
    }

    @Override
    public void close(){
        try {
            client.close();
        } catch (final Exception ignored) {}
    }
}