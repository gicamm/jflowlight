
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jflowlight")
public class OpendaylightFlowStatisticsFlowStatistics {

    @SerializedName("byte-count")
    @Expose
    private Long byteCount;
    @Expose
    private Duration duration;
    @SerializedName("packet-count")
    @Expose
    private Long packetCount;

    /**
     * 
     * @return
     *     The byteCount
     */
    public Long getByteCount() {
        return byteCount;
    }

    /**
     * 
     * @param byteCount
     *     The byte-count
     */
    public void setByteCount(Long byteCount) {
        this.byteCount = byteCount;
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
    public OpendaylightFlowStatisticsFlowStatistics setDuration(Duration duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 
     * @return
     *     The packetCount
     */
    public Long getPacketCount() {
        return packetCount;
    }

    /**
     * 
     * @param packetCount
     *     The packet-count
     */
    public void setPacketCount(Long packetCount) {
        this.packetCount = packetCount;
    }

}
