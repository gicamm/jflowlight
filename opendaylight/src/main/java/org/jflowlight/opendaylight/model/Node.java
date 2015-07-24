
package org.jflowlight.opendaylight.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
@Generated("org.jflowlight")
public class Node {

    @SerializedName("node-id")
    @Expose
    private String nodeId;
    @SerializedName("opendaylight-topology-inventory:inventory-node-ref")
    @Expose
    private String opendaylightTopologyInventoryInventoryNodeRef;
    @SerializedName("termination-point")
    @Expose
    private List<TerminationPoint> terminationPoint = new ArrayList<TerminationPoint>();
    @SerializedName("host-tracker-service:id")
    @Expose
    private String hostTrackerServiceId;
    @SerializedName("host-tracker-service:attachment-points")
    @Expose
    private List<HostTrackerServiceAttachmentPoint> hostTrackerServiceAttachmentPoints = new ArrayList<HostTrackerServiceAttachmentPoint>();
    @SerializedName("host-tracker-service:addresses")
    @Expose
    private List<HostTrackerServiceAddress> hostTrackerServiceAddresses = new ArrayList<HostTrackerServiceAddress>();

    /**
     * 
     * @return
     *     The nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * 
     * @param nodeId
     *     The node-id
     */
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Node withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 
     * @return
     *     The opendaylightTopologyInventoryInventoryNodeRef
     */
    public String getOpendaylightTopologyInventoryInventoryNodeRef() {
        return opendaylightTopologyInventoryInventoryNodeRef;
    }

    /**
     * 
     * @param opendaylightTopologyInventoryInventoryNodeRef
     *     The opendaylight-topology-inventory:inventory-node-ref
     */
    public void setOpendaylightTopologyInventoryInventoryNodeRef(String opendaylightTopologyInventoryInventoryNodeRef) {
        this.opendaylightTopologyInventoryInventoryNodeRef = opendaylightTopologyInventoryInventoryNodeRef;
    }

    public Node withOpendaylightTopologyInventoryInventoryNodeRef(String opendaylightTopologyInventoryInventoryNodeRef) {
        this.opendaylightTopologyInventoryInventoryNodeRef = opendaylightTopologyInventoryInventoryNodeRef;
        return this;
    }

    /**
     * 
     * @return
     *     The terminationPoint
     */
    public List<TerminationPoint> getTerminationPoint() {
        return terminationPoint;
    }

    /**
     * 
     * @param terminationPoint
     *     The termination-point
     */
    public void setTerminationPoint(List<TerminationPoint> terminationPoint) {
        this.terminationPoint = terminationPoint;
    }

    public Node withTerminationPoint(List<TerminationPoint> terminationPoint) {
        this.terminationPoint = terminationPoint;
        return this;
    }

    /**
     * 
     * @return
     *     The hostTrackerServiceId
     */
    public String getHostTrackerServiceId() {
        return hostTrackerServiceId;
    }

    /**
     * 
     * @param hostTrackerServiceId
     *     The host-tracker-service:id
     */
    public void setHostTrackerServiceId(String hostTrackerServiceId) {
        this.hostTrackerServiceId = hostTrackerServiceId;
    }

    public Node withHostTrackerServiceId(String hostTrackerServiceId) {
        this.hostTrackerServiceId = hostTrackerServiceId;
        return this;
    }

    /**
     * 
     * @return
     *     The hostTrackerServiceAttachmentPoints
     */
    public List<HostTrackerServiceAttachmentPoint> getHostTrackerServiceAttachmentPoints() {
        return hostTrackerServiceAttachmentPoints;
    }

    /**
     * 
     * @param hostTrackerServiceAttachmentPoints
     *     The host-tracker-service:attachment-points
     */
    public void setHostTrackerServiceAttachmentPoints(List<HostTrackerServiceAttachmentPoint> hostTrackerServiceAttachmentPoints) {
        this.hostTrackerServiceAttachmentPoints = hostTrackerServiceAttachmentPoints;
    }

    public Node withHostTrackerServiceAttachmentPoints(List<HostTrackerServiceAttachmentPoint> hostTrackerServiceAttachmentPoints) {
        this.hostTrackerServiceAttachmentPoints = hostTrackerServiceAttachmentPoints;
        return this;
    }

    /**
     * 
     * @return
     *     The hostTrackerServiceAddresses
     */
    public List<HostTrackerServiceAddress> getHostTrackerServiceAddresses() {
        return hostTrackerServiceAddresses;
    }

    /**
     * 
     * @param hostTrackerServiceAddresses
     *     The host-tracker-service:addresses
     */
    public void setHostTrackerServiceAddresses(List<HostTrackerServiceAddress> hostTrackerServiceAddresses) {
        this.hostTrackerServiceAddresses = hostTrackerServiceAddresses;
    }

    public Node withHostTrackerServiceAddresses(List<HostTrackerServiceAddress> hostTrackerServiceAddresses) {
        this.hostTrackerServiceAddresses = hostTrackerServiceAddresses;
        return this;
    }

}
