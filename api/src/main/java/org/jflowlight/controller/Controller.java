package org.jflowlight.controller;

import org.jflowlight.JolException;
import org.jflowlight.model.OpenflowNode;
import org.jflowlight.model.flow.FlowModel;
import org.jflowlight.model.node.NodeConnectorModel;
import java.util.Collection;
import java.util.Map;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public interface Controller {

    /**
     * Gets all hosts
     *
     * @return a Map of all hosts
     * @throws JolException
     */
    Map<String,OpenflowNode> getHosts() throws JolException;

    /**
     * Gets all switches
     *
     * @return @return a Map of all nodes ( hosts + switches )
     * @throws JolException
     */
    Map<String, OpenflowNode> getAllNode() throws JolException;

    /**
     * Gets connection ling
     *
     * @param switchID the switch Id
     * @param port the switch's port
     * @return all connection info
     * @throws JolException
     */
    NodeConnectorModel getNodeConnection(final String switchID, final Integer port) throws JolException;

    /**
     * Get flow entries
     *
     * @param switchID the switch ID
     * @param tableID the flow table ID
     * @return a map of all flows
     * @throws JolException
     */
    Map<String, FlowModel> getFlow(final String switchID, final Integer tableID) throws JolException;

    /**
     * Gets a flow entry
     *
     * @param switchID whe swtich ID
     * @param tableID the flow table ID
     * @param entryID the flow entry ID
     * @return a flow
     * @throws JolException
     */
    FlowModel getFlow(final String switchID, final Integer tableID, final Integer entryID) throws JolException;

    /**
     * Adds a flow entry
     *
     * @param flowname
     * @param switchID
     * @param priority
     * @param tableID
     * @param entryID
     * @param ipv4Srcs
     * @param ipv4Dsts
     * @param ipBit
     * @param macSrcs
     * @param macDsts
     * @param outputPort
     * @throws JolException
     */
    void addFlowEntry(final String flowname, final String switchID, final Integer priority, final Integer tableID, final Integer entryID, final Collection<String> ipv4Srcs, final Collection<String> ipv4Dsts, final int ipBit, final Collection<String> macSrcs,final Collection<String> macDsts,final Integer outputPort) throws JolException;

    /**
     * Deletes a flow entry
     *
     * @param switchID
     * @param tableID
     * @param entryID
     * @throws JolException
     */
    void deleteFlowEntry(final String switchID, final Integer tableID, final Integer entryID) throws JolException;

}
