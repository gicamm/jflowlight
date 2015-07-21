package org.jflowlight.model.node;

import org.jflowlight.model.BaseModel;
import org.jflowlight.model.address.AddressTracker;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Giovanni Cammarata
 */
public class NodeConnectorModel extends BaseModel<NodeConnectorModel>{

    private static final long serialVersionUID = 1325285428940788277L;

    private Long collisionCount;
    private Long transmitErrors;
    private Long receiveFrameError;
    private Long receiveOverRunError;
    private Long receiveErrors;
    private Long bytesReceived;
    private Long bytesTransmitted;
    private Long transmitDrops;
    private Long receiveCrcError;
    private Long packetsReceived;
    private Long packetsTransmitted;
    private Long receiveDrops;
    private String flowNodeInventoryConfiguration;
    private String flowNodeInventoryPeerFeatures;
    private String flowNodeInventoryName;
    private String flowNodeInventoryCurrentFeature;
    private String flowNodeInventorySupported;
    private Long flowNodeInventoryMaximumSpeed;
    private Long flowNodeInventoryCurrentSpeed;
    private String flowNodeInventoryPortNumber;
    private String flowNodeInventoryHardwareAddress;
    private String flowNodeInventoryAdvertisedFeatures;

    private Boolean linkDown;
    private Boolean live;
    private Boolean blocked;

    private List<AddressTracker> addressTrackerAddresses = new ArrayList<AddressTracker>();
    private String stpStatusAwareNodeConnectorStatus;

    public Long getCollisionCount() {
        return collisionCount;
    }

    public NodeConnectorModel setCollisionCount(Long collisionCount) {
        this.collisionCount = collisionCount;
        return this;
    }

    public Long getTransmitErrors() {
        return transmitErrors;
    }

    public NodeConnectorModel setTransmitErrors(final Long transmitErrors) {
        this.transmitErrors = transmitErrors;
        return this;
    }

    public Long getReceiveFrameError() {
        return receiveFrameError;
    }

    public NodeConnectorModel setReceiveFrameError(final Long receiveFrameError) {
        this.receiveFrameError = receiveFrameError;
        return this;
    }

    public Long getReceiveOverRunError() {
        return receiveOverRunError;
    }

    public NodeConnectorModel setReceiveOverRunError(final Long receiveOverRunError) {
        this.receiveOverRunError = receiveOverRunError;
        return this;
    }

    public Long getReceiveErrors() {
        return receiveErrors;
    }

    public NodeConnectorModel setReceiveErrors(final Long receiveErrors) {
        this.receiveErrors = receiveErrors;
        return this;
    }

    public Long getBytesReceived() {
        return bytesReceived;
    }

    public NodeConnectorModel setBytesReceived(final Long bytesReceived) {
        this.bytesReceived = bytesReceived;
        return this;
    }

    public Long getBytesTransmitted() {
        return bytesTransmitted;
    }

    public NodeConnectorModel setBytesTransmitted(final Long bytesTransmitted) {
        this.bytesTransmitted = bytesTransmitted;
        return this;
    }

    public Long getTransmitDrops() {
        return transmitDrops;
    }

    public NodeConnectorModel setTransmitDrops(final Long transmitDrops) {
        this.transmitDrops = transmitDrops;
        return this;
    }

    public Long getReceiveCrcError() {
        return receiveCrcError;
    }

    public NodeConnectorModel setReceiveCrcError(final Long receiveCrcError) {
        this.receiveCrcError = receiveCrcError;
        return this;
    }

    public Long getPacketsReceived() {
        return packetsReceived;
    }

    public NodeConnectorModel setPacketsReceived(final Long packetsReceived) {
        this.packetsReceived = packetsReceived;
        return this;
    }

    public Long getPacketsTransmitted() {
        return packetsTransmitted;
    }

    public NodeConnectorModel setPacketsTransmitted(final Long packetsTransmitted) {
        this.packetsTransmitted = packetsTransmitted;
        return this;
    }

    public Long getReceiveDrops() {
        return receiveDrops;
    }

    public NodeConnectorModel setReceiveDrops(final Long receiveDrops) {
        this.receiveDrops = receiveDrops;
        return this;
    }

    public String getFlowNodeInventoryConfiguration() {
        return flowNodeInventoryConfiguration;
    }

    public NodeConnectorModel setFlowNodeInventoryConfiguration(final String flowNodeInventoryConfiguration) {
        this.flowNodeInventoryConfiguration = flowNodeInventoryConfiguration;
        return this;
    }

    public String getFlowNodeInventoryPeerFeatures() {
        return flowNodeInventoryPeerFeatures;
    }

    public NodeConnectorModel setFlowNodeInventoryPeerFeatures(final String flowNodeInventoryPeerFeatures) {
        this.flowNodeInventoryPeerFeatures = flowNodeInventoryPeerFeatures;
        return this;
    }

    public String getFlowNodeInventoryName() {
        return flowNodeInventoryName;
    }

    public NodeConnectorModel setFlowNodeInventoryName(final String flowNodeInventoryName) {
        this.flowNodeInventoryName = flowNodeInventoryName;
        return this;
    }

    public String getFlowNodeInventoryCurrentFeature() {
        return flowNodeInventoryCurrentFeature;
    }

    public NodeConnectorModel setFlowNodeInventoryCurrentFeature(final String flowNodeInventoryCurrentFeature) {
        this.flowNodeInventoryCurrentFeature = flowNodeInventoryCurrentFeature;
        return this;
    }

    public String getFlowNodeInventorySupported() {
        return flowNodeInventorySupported;
    }

    public NodeConnectorModel setFlowNodeInventorySupported(final String flowNodeInventorySupported) {
        this.flowNodeInventorySupported = flowNodeInventorySupported;
        return this;
    }

    public Long getFlowNodeInventoryMaximumSpeed() {
        return flowNodeInventoryMaximumSpeed;
    }

    public NodeConnectorModel setFlowNodeInventoryMaximumSpeed(final Long flowNodeInventoryMaximumSpeed) {
        this.flowNodeInventoryMaximumSpeed = flowNodeInventoryMaximumSpeed;
        return this;
    }

    public Long getFlowNodeInventoryCurrentSpeed() {
        return flowNodeInventoryCurrentSpeed;
    }

    public NodeConnectorModel setFlowNodeInventoryCurrentSpeed(final Long flowNodeInventoryCurrentSpeed) {
        this.flowNodeInventoryCurrentSpeed = flowNodeInventoryCurrentSpeed;
        return this;
    }

    public String getFlowNodeInventoryPortNumber() {
        return flowNodeInventoryPortNumber;
    }

    public NodeConnectorModel setFlowNodeInventoryPortNumber(final String flowNodeInventoryPortNumber) {
        this.flowNodeInventoryPortNumber = flowNodeInventoryPortNumber;
        return this;
    }

    public String getFlowNodeInventoryHardwareAddress() {
        return flowNodeInventoryHardwareAddress;
    }

    public NodeConnectorModel setFlowNodeInventoryHardwareAddress(final String flowNodeInventoryHardwareAddress) {
        this.flowNodeInventoryHardwareAddress = flowNodeInventoryHardwareAddress;
        return this;
    }

    public String getFlowNodeInventoryAdvertisedFeatures() {
        return flowNodeInventoryAdvertisedFeatures;
    }

    public NodeConnectorModel setFlowNodeInventoryAdvertisedFeatures(final String flowNodeInventoryAdvertisedFeatures) {
        this.flowNodeInventoryAdvertisedFeatures = flowNodeInventoryAdvertisedFeatures;
        return this;
    }

    public Boolean getLinkDown() {
        return linkDown;
    }

    public NodeConnectorModel setLinkDown(final Boolean linkDown) {
        this.linkDown = linkDown;
        return this;
    }

    public Boolean getLive() {
        return live;
    }

    public NodeConnectorModel setLive(final Boolean live) {
        this.live = live;
        return this;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public NodeConnectorModel setBlocked(final Boolean blocked) {
        this.blocked = blocked;
        return this;
    }

    public List<AddressTracker> getAddressTrackerAddresses() {
        return addressTrackerAddresses;
    }

    public NodeConnectorModel setAddressTrackerAddresses(final List<AddressTracker> addressTrackerAddresses) {
        this.addressTrackerAddresses = addressTrackerAddresses;
        return this;
    }

    public String getStpStatusAwareNodeConnectorStatus() {
        return stpStatusAwareNodeConnectorStatus;
    }

    public NodeConnectorModel setStpStatusAwareNodeConnectorStatus(final String stpStatusAwareNodeConnectorStatus) {
        this.stpStatusAwareNodeConnectorStatus = stpStatusAwareNodeConnectorStatus;
        return this;
    }

}
