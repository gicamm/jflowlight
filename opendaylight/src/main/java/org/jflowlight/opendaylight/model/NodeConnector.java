
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
public class NodeConnector {

    @Expose
    private String id;
    @SerializedName("opendaylight-port-statistics:flow-capable-node-connector-statistics")
    @Expose
    private OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics portStatistics;
    @SerializedName("flow-node-inventory:configuration")
    @Expose
    private String flowNodeInventoryConfiguration;
    @SerializedName("flow-node-inventory:peer-features")
    @Expose
    private String flowNodeInventoryPeerFeatures;
    @SerializedName("flow-node-inventory:name")
    @Expose
    private String flowNodeInventoryName;
    @SerializedName("flow-node-inventory:current-feature")
    @Expose
    private String flowNodeInventoryCurrentFeature;
    @SerializedName("flow-node-inventory:supported")
    @Expose
    private String flowNodeInventorySupported;
    @SerializedName("flow-node-inventory:maximum-speed")
    @Expose
    private Long flowNodeInventoryMaximumSpeed;
    @SerializedName("flow-node-inventory:current-speed")
    @Expose
    private Long flowNodeInventoryCurrentSpeed;
    @SerializedName("flow-node-inventory:port-number")
    @Expose
    private String flowNodeInventoryPortNumber;
    @SerializedName("flow-node-inventory:hardware-address")
    @Expose
    private String flowNodeInventoryHardwareAddress;
    @SerializedName("flow-node-inventory:advertised-features")
    @Expose
    private String flowNodeInventoryAdvertisedFeatures;
    @SerializedName("flow-node-inventory:state")
    @Expose
    private FlowNodeInventoryState flowNodeInventoryState;
    @SerializedName("address-tracker:addresses")
    @Expose
    private List<AddressTrackerAddress> addressTrackerAddresses = new ArrayList<AddressTrackerAddress>();
    @SerializedName("stp-status-aware-node-connector:status")
    @Expose
    private String stpStatusAwareNodeConnectorStatus;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public NodeConnector withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The portStatistics
     */
    public OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics getPortStatistics() {
        return portStatistics;
    }

    /**
     * 
     * @param portStatistics
     *     The opendaylight-port-statistics:flow-capable-node-connector-statistics
     */
    public void setPortStatistics(OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics portStatistics) {
        this.portStatistics = portStatistics;
    }

    public NodeConnector withOpendaylightPortStatisticsFlowCapableNodeConnectorStatistics(OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics opendaylightPortStatisticsFlowCapableNodeConnectorStatistics) {
        this.portStatistics = opendaylightPortStatisticsFlowCapableNodeConnectorStatistics;
        return this;
    }

    /**
     * 
     * @return
     *     The flowNodeInventoryConfiguration
     */
    public String getFlowNodeInventoryConfiguration() {
        return flowNodeInventoryConfiguration;
    }

    /**
     * 
     * @param flowNodeInventoryConfiguration
     *     The flow-node-inventory:configuration
     */
    public void setFlowNodeInventoryConfiguration(String flowNodeInventoryConfiguration) {
        this.flowNodeInventoryConfiguration = flowNodeInventoryConfiguration;
    }

    public NodeConnector withFlowNodeInventoryConfiguration(String flowNodeInventoryConfiguration) {
        this.flowNodeInventoryConfiguration = flowNodeInventoryConfiguration;
        return this;
    }

    /**
     * 
     * @return
     *     The flowNodeInventoryPeerFeatures
     */
    public String getFlowNodeInventoryPeerFeatures() {
        return flowNodeInventoryPeerFeatures;
    }

    /**
     * 
     * @param flowNodeInventoryPeerFeatures
     *     The flow-node-inventory:peer-features
     */
    public void setFlowNodeInventoryPeerFeatures(String flowNodeInventoryPeerFeatures) {
        this.flowNodeInventoryPeerFeatures = flowNodeInventoryPeerFeatures;
    }

    public NodeConnector withFlowNodeInventoryPeerFeatures(String flowNodeInventoryPeerFeatures) {
        this.flowNodeInventoryPeerFeatures = flowNodeInventoryPeerFeatures;
        return this;
    }

    /**
     * 
     * @return
     *     The flowNodeInventoryName
     */
    public String getFlowNodeInventoryName() {
        return flowNodeInventoryName;
    }

    /**
     * 
     * @param flowNodeInventoryName
     *     The flow-node-inventory:name
     */
    public void setFlowNodeInventoryName(String flowNodeInventoryName) {
        this.flowNodeInventoryName = flowNodeInventoryName;
    }

    public NodeConnector withFlowNodeInventoryName(String flowNodeInventoryName) {
        this.flowNodeInventoryName = flowNodeInventoryName;
        return this;
    }

    /**
     * 
     * @return
     *     The flowNodeInventoryCurrentFeature
     */
    public String getFlowNodeInventoryCurrentFeature() {
        return flowNodeInventoryCurrentFeature;
    }

    /**
     * 
     * @param flowNodeInventoryCurrentFeature
     *     The flow-node-inventory:current-feature
     */
    public void setFlowNodeInventoryCurrentFeature(String flowNodeInventoryCurrentFeature) {
        this.flowNodeInventoryCurrentFeature = flowNodeInventoryCurrentFeature;
    }

    public NodeConnector withFlowNodeInventoryCurrentFeature(String flowNodeInventoryCurrentFeature) {
        this.flowNodeInventoryCurrentFeature = flowNodeInventoryCurrentFeature;
        return this;
    }

    /**
     * 
     * @return
     *     The flowNodeInventorySupported
     */
    public String getFlowNodeInventorySupported() {
        return flowNodeInventorySupported;
    }

    /**
     * 
     * @param flowNodeInventorySupported
     *     The flow-node-inventory:supported
     */
    public void setFlowNodeInventorySupported(String flowNodeInventorySupported) {
        this.flowNodeInventorySupported = flowNodeInventorySupported;
    }

    public NodeConnector withFlowNodeInventorySupported(String flowNodeInventorySupported) {
        this.flowNodeInventorySupported = flowNodeInventorySupported;
        return this;
    }

    /**
     * 
     * @return
     *     The flowNodeInventoryMaximumSpeed
     */
    public Long getFlowNodeInventoryMaximumSpeed() {
        return flowNodeInventoryMaximumSpeed;
    }

    /**
     * 
     * @param flowNodeInventoryMaximumSpeed
     *     The flow-node-inventory:maximum-speed
     */
    public void setFlowNodeInventoryMaximumSpeed(Long flowNodeInventoryMaximumSpeed) {
        this.flowNodeInventoryMaximumSpeed = flowNodeInventoryMaximumSpeed;
    }

    public NodeConnector withFlowNodeInventoryMaximumSpeed(Long flowNodeInventoryMaximumSpeed) {
        this.flowNodeInventoryMaximumSpeed = flowNodeInventoryMaximumSpeed;
        return this;
    }

    /**
     * 
     * @return
     *     The flowNodeInventoryCurrentSpeed
     */
    public Long getFlowNodeInventoryCurrentSpeed() {
        return flowNodeInventoryCurrentSpeed;
    }

    /**
     * 
     * @param flowNodeInventoryCurrentSpeed
     *     The flow-node-inventory:current-speed
     */
    public void setFlowNodeInventoryCurrentSpeed(Long flowNodeInventoryCurrentSpeed) {
        this.flowNodeInventoryCurrentSpeed = flowNodeInventoryCurrentSpeed;
    }

    public NodeConnector withFlowNodeInventoryCurrentSpeed(Long flowNodeInventoryCurrentSpeed) {
        this.flowNodeInventoryCurrentSpeed = flowNodeInventoryCurrentSpeed;
        return this;
    }

    /**
     * 
     * @return
     *     The flowNodeInventoryPortNumber
     */
    public String getFlowNodeInventoryPortNumber() {
        return flowNodeInventoryPortNumber;
    }

    /**
     * 
     * @param flowNodeInventoryPortNumber
     *     The flow-node-inventory:port-number
     */
    public void setFlowNodeInventoryPortNumber(String flowNodeInventoryPortNumber) {
        this.flowNodeInventoryPortNumber = flowNodeInventoryPortNumber;
    }

    public NodeConnector withFlowNodeInventoryPortNumber(String flowNodeInventoryPortNumber) {
        this.flowNodeInventoryPortNumber = flowNodeInventoryPortNumber;
        return this;
    }

    /**
     * 
     * @return
     *     The flowNodeInventoryHardwareAddress
     */
    public String getFlowNodeInventoryHardwareAddress() {
        return flowNodeInventoryHardwareAddress;
    }

    /**
     * 
     * @param flowNodeInventoryHardwareAddress
     *     The flow-node-inventory:hardware-address
     */
    public void setFlowNodeInventoryHardwareAddress(String flowNodeInventoryHardwareAddress) {
        this.flowNodeInventoryHardwareAddress = flowNodeInventoryHardwareAddress;
    }

    public NodeConnector withFlowNodeInventoryHardwareAddress(String flowNodeInventoryHardwareAddress) {
        this.flowNodeInventoryHardwareAddress = flowNodeInventoryHardwareAddress;
        return this;
    }

    /**
     * 
     * @return
     *     The flowNodeInventoryAdvertisedFeatures
     */
    public String getFlowNodeInventoryAdvertisedFeatures() {
        return flowNodeInventoryAdvertisedFeatures;
    }

    /**
     * 
     * @param flowNodeInventoryAdvertisedFeatures
     *     The flow-node-inventory:advertised-features
     */
    public void setFlowNodeInventoryAdvertisedFeatures(String flowNodeInventoryAdvertisedFeatures) {
        this.flowNodeInventoryAdvertisedFeatures = flowNodeInventoryAdvertisedFeatures;
    }

    public NodeConnector withFlowNodeInventoryAdvertisedFeatures(String flowNodeInventoryAdvertisedFeatures) {
        this.flowNodeInventoryAdvertisedFeatures = flowNodeInventoryAdvertisedFeatures;
        return this;
    }

    /**
     * 
     * @return
     *     The flowNodeInventoryState
     */
    public FlowNodeInventoryState getFlowNodeInventoryState() {
        return flowNodeInventoryState;
    }

    /**
     * 
     * @param flowNodeInventoryState
     *     The flow-node-inventory:state
     */
    public void setFlowNodeInventoryState(FlowNodeInventoryState flowNodeInventoryState) {
        this.flowNodeInventoryState = flowNodeInventoryState;
    }

    public NodeConnector withFlowNodeInventoryState(FlowNodeInventoryState flowNodeInventoryState) {
        this.flowNodeInventoryState = flowNodeInventoryState;
        return this;
    }

    /**
     * 
     * @return
     *     The addressTrackerAddresses
     */
    public List<AddressTrackerAddress> getAddressTrackerAddresses() {
        return addressTrackerAddresses;
    }

    /**
     * 
     * @param addressTrackerAddresses
     *     The address-tracker:addresses
     */
    public void setAddressTrackerAddresses(List<AddressTrackerAddress> addressTrackerAddresses) {
        this.addressTrackerAddresses = addressTrackerAddresses;
    }

    public NodeConnector withAddressTrackerAddresses(List<AddressTrackerAddress> addressTrackerAddresses) {
        this.addressTrackerAddresses = addressTrackerAddresses;
        return this;
    }

    /**
     * 
     * @return
     *     The stpStatusAwareNodeConnectorStatus
     */
    public String getStpStatusAwareNodeConnectorStatus() {
        return stpStatusAwareNodeConnectorStatus;
    }

    /**
     * 
     * @param stpStatusAwareNodeConnectorStatus
     *     The stp-status-aware-node-connector:status
     */
    public void setStpStatusAwareNodeConnectorStatus(String stpStatusAwareNodeConnectorStatus) {
        this.stpStatusAwareNodeConnectorStatus = stpStatusAwareNodeConnectorStatus;
    }

    public NodeConnector withStpStatusAwareNodeConnectorStatus(String stpStatusAwareNodeConnectorStatus) {
        this.stpStatusAwareNodeConnectorStatus = stpStatusAwareNodeConnectorStatus;
        return this;
    }

    @Override
    public String toString() {
        return "NodeConnector{" +
                "id='" + id + '\'' +
                ", portStatistics=" + portStatistics +
                ", flowNodeInventoryConfiguration='" + flowNodeInventoryConfiguration + '\'' +
                ", flowNodeInventoryPeerFeatures='" + flowNodeInventoryPeerFeatures + '\'' +
                ", flowNodeInventoryName='" + flowNodeInventoryName + '\'' +
                ", flowNodeInventoryCurrentFeature='" + flowNodeInventoryCurrentFeature + '\'' +
                ", flowNodeInventorySupported='" + flowNodeInventorySupported + '\'' +
                ", flowNodeInventoryMaximumSpeed=" + flowNodeInventoryMaximumSpeed +
                ", flowNodeInventoryCurrentSpeed=" + flowNodeInventoryCurrentSpeed +
                ", flowNodeInventoryPortNumber='" + flowNodeInventoryPortNumber + '\'' +
                ", flowNodeInventoryHardwareAddress='" + flowNodeInventoryHardwareAddress + '\'' +
                ", flowNodeInventoryAdvertisedFeatures='" + flowNodeInventoryAdvertisedFeatures + '\'' +
                ", flowNodeInventoryState=" + flowNodeInventoryState +
                ", addressTrackerAddresses=" + addressTrackerAddresses +
                ", stpStatusAwareNodeConnectorStatus='" + stpStatusAwareNodeConnectorStatus + '\'' +
                '}';
    }

}
