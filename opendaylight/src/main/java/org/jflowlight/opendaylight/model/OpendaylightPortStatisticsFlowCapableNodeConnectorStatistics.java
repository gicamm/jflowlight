
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
@Generated("org.jflowlight")
public class OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics {

    @SerializedName("collision-count")
    @Expose
    private Long collisionCount;
    @Expose
    private Duration duration;
    @SerializedName("transmit-errors")
    @Expose
    private Long transmitErrors;
    @SerializedName("receive-frame-error")
    @Expose
    private Long receiveFrameError;
    @SerializedName("receive-over-run-error")
    @Expose
    private Long receiveOverRunError;
    @SerializedName("receive-errors")
    @Expose
    private Long receiveErrors;
    @Expose
    private Bytes bytes;
    @SerializedName("transmit-drops")
    @Expose
    private Long transmitDrops;
    @SerializedName("receive-crc-error")
    @Expose
    private Long receiveCrcError;
    @Expose
    private Packets packets;
    @SerializedName("receive-drops")
    @Expose
    private Long receiveDrops;

    /**
     * 
     * @return
     *     The collisionCount
     */
    public Long getCollisionCount() {
        return collisionCount;
    }

    /**
     * 
     * @param collisionCount
     *     The collision-count
     */
    public void setCollisionCount(Long collisionCount) {
        this.collisionCount = collisionCount;
    }

    public OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics withCollisionCount(Long collisionCount) {
        this.collisionCount = collisionCount;
        return this;
    }

    /**
     * 
     * @return
     *     The duration
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics withDuration(Duration duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 
     * @return
     *     The transmitErrors
     */
    public Long getTransmitErrors() {
        return transmitErrors;
    }

    /**
     * 
     * @param transmitErrors
     *     The transmit-errors
     */
    public void setTransmitErrors(Long transmitErrors) {
        this.transmitErrors = transmitErrors;
    }

    public OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics withTransmitErrors(Long transmitErrors) {
        this.transmitErrors = transmitErrors;
        return this;
    }

    /**
     * 
     * @return
     *     The receiveFrameError
     */
    public Long getReceiveFrameError() {
        return receiveFrameError;
    }

    /**
     * 
     * @param receiveFrameError
     *     The receive-frame-error
     */
    public void setReceiveFrameError(Long receiveFrameError) {
        this.receiveFrameError = receiveFrameError;
    }

    public OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics withReceiveFrameError(Long receiveFrameError) {
        this.receiveFrameError = receiveFrameError;
        return this;
    }

    /**
     * 
     * @return
     *     The receiveOverRunError
     */
    public Long getReceiveOverRunError() {
        return receiveOverRunError;
    }

    /**
     * 
     * @param receiveOverRunError
     *     The receive-over-run-error
     */
    public void setReceiveOverRunError(Long receiveOverRunError) {
        this.receiveOverRunError = receiveOverRunError;
    }

    public OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics withReceiveOverRunError(Long receiveOverRunError) {
        this.receiveOverRunError = receiveOverRunError;
        return this;
    }

    /**
     * 
     * @return
     *     The receiveErrors
     */
    public Long getReceiveErrors() {
        return receiveErrors;
    }

    /**
     * 
     * @param receiveErrors
     *     The receive-errors
     */
    public void setReceiveErrors(Long receiveErrors) {
        this.receiveErrors = receiveErrors;
    }

    public OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics withReceiveErrors(Long receiveErrors) {
        this.receiveErrors = receiveErrors;
        return this;
    }

    /**
     * 
     * @return
     *     The bytes
     */
    public Bytes getBytes() {
        return bytes;
    }

    /**
     * 
     * @param bytes
     *     The bytes
     */
    public void setBytes(Bytes bytes) {
        this.bytes = bytes;
    }

    public OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics withBytes(Bytes bytes) {
        this.bytes = bytes;
        return this;
    }

    /**
     * 
     * @return
     *     The transmitDrops
     */
    public Long getTransmitDrops() {
        return transmitDrops;
    }

    /**
     * 
     * @param transmitDrops
     *     The transmit-drops
     */
    public void setTransmitDrops(Long transmitDrops) {
        this.transmitDrops = transmitDrops;
    }

    public OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics withTransmitDrops(Long transmitDrops) {
        this.transmitDrops = transmitDrops;
        return this;
    }

    /**
     * 
     * @return
     *     The receiveCrcError
     */
    public Long getReceiveCrcError() {
        return receiveCrcError;
    }

    /**
     * 
     * @param receiveCrcError
     *     The receive-crc-error
     */
    public void setReceiveCrcError(Long receiveCrcError) {
        this.receiveCrcError = receiveCrcError;
    }

    public OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics withReceiveCrcError(Long receiveCrcError) {
        this.receiveCrcError = receiveCrcError;
        return this;
    }

    /**
     * 
     * @return
     *     The packets
     */
    public Packets getPackets() {
        return packets;
    }

    /**
     * 
     * @param packets
     *     The packets
     */
    public void setPackets(Packets packets) {
        this.packets = packets;
    }

    public OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics withPackets(Packets packets) {
        this.packets = packets;
        return this;
    }

    /**
     * 
     * @return
     *     The receiveDrops
     */
    public Long getReceiveDrops() {
        return receiveDrops;
    }

    /**
     * 
     * @param receiveDrops
     *     The receive-drops
     */
    public void setReceiveDrops(Long receiveDrops) {
        this.receiveDrops = receiveDrops;
    }

    public OpendaylightPortStatisticsFlowCapableNodeConnectorStatistics withReceiveDrops(Long receiveDrops) {
        this.receiveDrops = receiveDrops;
        return this;
    }

}
