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

    Map<String,OpenflowNode> getHosts() throws JolException;

    Map<String, OpenflowNode> getAllNode() throws JolException;

    NodeConnectorModel getNodeConnection(final String switchID, final Integer port) throws JolException;

    Map<String, FlowModel> getFlow(final String switchID, final Integer tableID) throws JolException;

    FlowModel getFlow(final String switchID, final Integer tableID, final Integer entryID) throws JolException;

    void addFlowEntry(final String flowname, final String switchID, final Integer priority, final Integer tableID, final Integer entryID, final Collection<String> ipv4Srcs, final Collection<String> ipv4Dsts, final int ipBit, final Collection<String> macSrcs,final Collection<String> macDsts,final Integer outputPort) throws JolException;

    void deleteFlowEntry(final String switchID, final Integer tableID, final Integer entryID) throws JolException;

}
