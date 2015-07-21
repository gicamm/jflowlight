
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jflowlight")
public class OpendaylightFlowStatisticsAggregateFlowStatistics {

    @SerializedName("flow-count")
    @Expose
    private Long flowCount;
    @SerializedName("byte-count")
    @Expose
    private Long byteCount;
    @SerializedName("packet-count")
    @Expose
    private Long packetCount;

    /**
     * 
     * @return
     *     The flowCount
     */
    public Long getFlowCount() {
        return flowCount;
    }

    /**
     * 
     * @param flowCount
     *     The flow-count
     */
    public void setFlowCount(Long flowCount) {
        this.flowCount = flowCount;
    }

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
