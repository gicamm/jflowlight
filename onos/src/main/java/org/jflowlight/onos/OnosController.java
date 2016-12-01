package org.jflowlight.onos;

import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


import org.jflowlight.JolException;
import org.jflowlight.controller.Controller;
import org.jflowlight.model.Address;
import org.jflowlight.model.LinkModel;
import org.jflowlight.model.LinkModel.LinkType;
import org.jflowlight.model.OpenflowNode;
import org.jflowlight.model.flow.ActionModel;
import org.jflowlight.model.flow.FlowModel;
import org.jflowlight.model.flow.InstructionModel;
import org.jflowlight.model.node.NodeConnectorModel;
import org.jflowlight.utils.rest.RestClient;

import com.google.gson.Gson;

import org.jflowlight.onos.model.Criterion;
import org.jflowlight.onos.model.Device;
import org.jflowlight.onos.model.Devices;
import org.jflowlight.onos.model.FlowRule;
import org.jflowlight.onos.model.FlowRules;
import org.jflowlight.onos.model.Host;
import org.jflowlight.onos.model.Hosts;
import org.jflowlight.onos.model.Instruction;
import org.jflowlight.onos.model.Link;
import org.jflowlight.onos.model.Links;
import org.jflowlight.onos.model.Selector;
import org.jflowlight.onos.model.Statistic;
import org.jflowlight.onos.model.Statistics;
import org.jflowlight.onos.model.Treatment;
import org.jflowlight.onos.model.topology.Cluster;
import org.jflowlight.onos.model.topology.Clusters;
import org.jflowlight.onos.model.topology.TopoDevices;
import org.jflowlight.onos.model.topology.Topology;
import org.jflowlight.onos.statistics.DeviceStats;
import org.jflowlight.onos.statistics.TableStats;

/**
 * @author Alessandro Di Stefano
 */
public class OnosController implements Controller {
	private final RestClient client;
	
	public OnosController(final String address, final int port, final String user, final String password) {
	        client = new RestClient(address,port,user,password);
	}
	
	public Map<String, LinkModel> getLinks()
	{
		final Links links = client.get(Links.class, "onos/v1/links");
		final Map<String,LinkModel> toReturn = new ConcurrentHashMap<>();
		for (Link link : links.getLinks())
		{
			LinkModel tmp = new LinkModel(link.getDst().getDevice(),Integer.parseInt(link.getDst().getPort()),
						Integer.parseInt(link.getSrc().getPort()), LinkType.SWITCH_SWITCH);
			toReturn.put(link.getSrc().getDevice() + "::" + link.getSrc().getPort(), tmp);
		}
		return toReturn;
	}
	
	public Statistics getStats()
	{
		Statistics stats = client.get(Statistics.class, "onos/v1/statistics/flows/link");
		Map<String, LinkModel> links = getLinks();
		for (final Statistic stat : stats.getStatistics())
		{
			String url = stat.getLink();
			try
			{
				String query = new URL(url).getQuery();
				String[] pairs = query.split("&");
				Map<String, String> query_pairs = new ConcurrentHashMap<>();
				for (String pair : pairs) {
			        int idx = pair.indexOf("=");
			        query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
			    }
				String deviceId = query_pairs.get("device");
				String port = query_pairs.get("port");
				stat.setTheLink(links.get(deviceId + "::" + port));
				stat.setDevice(deviceId);
				stat.setPort(Integer.parseInt(port));
			} catch (Exception e) {}
			
			
			
		}
		return stats;
	}
	@Override
	public Map<String, OpenflowNode> getHosts() throws JolException {
		final Map<String, OpenflowNode> toReturn = new ConcurrentHashMap<>();
		final Hosts hosts = client.get(Hosts.class, "onos/v1/hosts");
		for (final Host host : hosts.getHosts())
		{
			final OpenflowNode tmp = new OpenflowNode(host.getId(), host.getLocation().getElementId());
			
			tmp.setAddresses(new Address(host.getIpAddresses().get(0), host.getMac()));
			final Map<String, LinkModel> links = new HashMap<>();
			LinkModel link = new LinkModel(host.getLocation().getElementId(), 
					Integer.parseInt(host.getLocation().getPort()), null, LinkType.SWITCH_SWITCH);
			links.put(host.getLocation().getElementId(), link);
			tmp.addLink(links);
			toReturn.put(host.getId(), tmp);
		}
		return toReturn;
	}
	
	
	public Map<String, OpenflowNode> getDevices() throws JolException {
		final Map<String, OpenflowNode> toReturn = new ConcurrentHashMap<>();
		final Devices devices = client.get(Devices.class, "onos/v1/devices");
		for (final Device device : devices.getDevices())
		{
			final OpenflowNode tmp = new OpenflowNode(device.getId(), device.getId());
			tmp.setAddresses(new Address(device.getAnnotations()
					.getManagementAddress(), device.getChassisId()));
			toReturn.put(device.getId(), tmp);
		}
		return toReturn;
	
	}
	
	public Topology getTopology() throws JolException {
		final Topology toReturn = client.get(Topology.class, "onos/v1/topology");
		toReturn.setGraph(client.get(Clusters.class, "onos/v1/topology/clusters"));
		for (final Cluster cluster : toReturn.getGraph().getClusters())
		{
			cluster.setDevices(client.get(TopoDevices.class, "onos/v1/topology/clusters/" + cluster.getId() + "/devices"));
			cluster.setLinks(client.get(Links.class, "onos/v1/topology/clusters/" + cluster.getId() + "/links"));
		}
		
		return toReturn;
	}
	@Override
	public Map<String, OpenflowNode> getAllNode() throws JolException {
		final Map<String, OpenflowNode> toReturn = new ConcurrentHashMap<>();
		toReturn.putAll(getDevices());
		toReturn.putAll(getHosts());
		return toReturn;
	}

	@Override
	public NodeConnectorModel getNodeConnection(String switchID, Integer port)
			throws JolException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, FlowModel> getFlow(String switchID, Integer tableID)
			throws JolException {
		if (switchID == null) switchID = "";
		final FlowRules flows = client.get(FlowRules.class, "onos","v1","flows", switchID);
        final Map<String,FlowModel> toReturn = new ConcurrentHashMap<>();
        FlowModel toMap;
        
        for(final FlowRule flow: flows.getFlows()) {
            toMap = buildFlowModel(flow, null);
            toReturn.put(flow.getId(),toMap);
        }

        return toReturn;
	}

	@Override
	public FlowModel getFlow(String switchID, Integer tableID, Integer entryID)
			throws JolException {
		final FlowRules flows = client.get(FlowRules.class, "onos","v1","flows", switchID, entryID.toString());
        FlowModel toMap;
        FlowRule flow = flows.getFlows().get(0);
        toMap = buildFlowModel(flow, null);
        return toMap;
	}

	
	public Map<String, DeviceStats> getDevicesStatistics()
	{
		final Devices devices = client.get(Devices.class, "onos/v1/devices");
		
		final Map<String, DeviceStats> devicesStats = new ConcurrentHashMap<>();
		for (final Device device : devices.getDevices())
		{
			DeviceStats tmp = getDeviceStatistics(device.getId());
			if (tmp == null)
				continue;
			devicesStats.put(device.getId(), tmp);
		}
		return devicesStats;
	}
	
	public DeviceStats getDeviceStatistics(String deviceId)
	{
//		final Devices devices = client.get(Devices.class, "onos/v1/devices");
//		
//		final List<DeviceStats> devicesStats = new ArrayList<>();
//		for (final Device device : devices.getDevices())
//		{
//			deviceId = device.getId();		
		final DeviceStats deviceStats = new DeviceStats(); // Statistics for the single device
		deviceStats.setDeviceId(deviceId);
		final List<TableStats> tablesStats = new ArrayList<>(); // Statistics for the tables of the device
		deviceStats.setTables(tablesStats);
		final FlowRules flows;
		try
		{
			flows = client.get(FlowRules.class, "onos","v1","flows", deviceId);
		} catch (Exception e)
		{
			return null;
		}
		for (final FlowRule flow: flows.getFlows())
		{
			Integer tableId = Integer.valueOf(flow.getTableId().intValue());
			// Accumulator
			TableStats tableStats = new TableStats();
			tableStats.setBytes(flow.getBytes());
			tableStats.setPackets(flow.getPackets());
			tableStats.setDeviceId(deviceId);
			tableStats.setTableId(tableId);
			try {
				tablesStats.get(tableId).setBytes(tablesStats.get(tableId).getBytes() + tableStats.getBytes());
				tablesStats.get(tableId).setPackets(tablesStats.get(tableId).getPackets() + tableStats.getPackets());
				
			} catch (IndexOutOfBoundsException e) {
				tablesStats.add(tableId, tableStats);
			}
			
		}
//			devicesStats.add(deviceStats);
//		}
		return deviceStats;
	}
	@Override
	public void addFlowEntry(String flowname, String switchID,
			Integer priority, Integer tableID, Integer entryID,
			Collection<String> ipv4Srcs, Collection<String> ipv4Dsts,
			int ipBit, Collection<String> macSrcs, Collection<String> macDsts,
			Integer outputPort) throws JolException {
		
		FlowRule flow = new FlowRule();
		flow.setDeviceId(switchID);
		flow.setPriority(priority.longValue());
		flow.setTimeout(new Long(0));
		
		
		Treatment treatment = new Treatment();
		List<Instruction> instructions = new ArrayList<>();
		Instruction instruction = new Instruction();
		if (outputPort != null)
		{
			if (outputPort == -1)
				instruction.setPort("CONTROLLER");	
			else if (outputPort != null)
				instruction.setPort(outputPort.toString());
		
			instruction.setType("OUTPUT");
		}
		instructions.add(instruction);
		treatment.setInstructions(instructions);
		flow.setTreatment(treatment);
		/* CRITERIA */
		Selector selector = new Selector();
		List<Criterion> criteria = new ArrayList<>();
		if (macSrcs != null) 
		{
			for (String mac : macSrcs)
			{
				Criterion tmp = new Criterion();
				tmp.setType("ETH_SRC");
				tmp.setMac(mac);
				criteria.add(tmp);
			}
		}
		if (macDsts != null)
		{
			for (String mac : macDsts)
			{
				Criterion tmp = new Criterion();
				tmp.setType("ETH_DST");
				tmp.setMac(mac);
				criteria.add(tmp);
			}
		}
		
		if (ipv4Srcs != null)
		{
			for (String ip: ipv4Srcs)
			{
				Criterion tmp = new Criterion();
				tmp.setType("IPV4_SRC");
				tmp.setMac(ip);
				criteria.add(tmp);
			}
		}
		if (ipv4Dsts != null)
		{
			for (String ip: ipv4Dsts)
			{
				Criterion tmp = new Criterion();
				tmp.setType("IPV4_DST");
				tmp.setMac(ip);
				criteria.add(tmp);
			}
		}
		selector.setCriteria(criteria);
		flow.setSelector(selector);
		flow.setIsPermanent(true);
		
		/* END CRITERIA */
		Gson gson = new Gson();
		String json = gson.toJson(flow);
		System.out.println(json);
		client.post("/onos/v1/flows/"+switchID, json);
		
	}

	public void deleteFlowEntry(String switchID, Integer tableID,
			String entryID) throws JolException {
		client.delete("/onos/v1/flows/" + switchID + "/" + entryID);
	}
	
	private FlowModel buildFlowModel(final FlowRule sourceFlow, final Integer tableID)
	{
		final FlowModel flow = new FlowModel();
		flow.setId(sourceFlow.getId());
		flow.setPriority(sourceFlow.getPriority());
		flow.setByteCount(sourceFlow.getBytes());
		flow.setPacketCount(sourceFlow.getPackets());
		
		flow.setMatch(sourceFlow.getMatchs());
		final List<Instruction> instructions = sourceFlow.getTreatment().getInstructions();
		if (instructions != null)
		{
			InstructionModel instructionModel = new InstructionModel();
			final List<ActionModel> actionModel = new ArrayList<>();
			for (final Instruction instruction : instructions)
			{
				if (instruction.getType().contains("OUTPUT"))
				{
					ActionModel action = new ActionModel();
					action.setOutputNodeConnector(
							instruction.getPort());
					actionModel.add(action);
					
				}
				// TODO Others actions
			}
			instructionModel.setActions(actionModel);
			final List<InstructionModel> ret = new ArrayList<>();
			ret.add(instructionModel);
			flow.setInstructions(ret);
		}
		
		return flow;
	
	}

}
