
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
@Generated("org.jflowlight")
public class OpendaylightFlowTableStatisticsFlowTableStatistics {

    @SerializedName("packets-looked-up")
    @Expose
    private Long packetsLookedUp;
    @SerializedName("active-flows")
    @Expose
    private Long activeFlows;
    @SerializedName("packets-matched")
    @Expose
    private Long packetsMatched;

    /**
     * 
     * @return
     *     The packetsLookedUp
     */
    public Long getPacketsLookedUp() {
        return packetsLookedUp;
    }

    /**
     * 
     * @param packetsLookedUp
     *     The packets-looked-up
     */
    public void setPacketsLookedUp(Long packetsLookedUp) {
        this.packetsLookedUp = packetsLookedUp;
    }

    /**
     * 
     * @return
     *     The activeFlows
     */
    public Long getActiveFlows() {
        return activeFlows;
    }

    /**
     * 
     * @param activeFlows
     *     The active-flows
     */
    public void setActiveFlows(Long activeFlows) {
        this.activeFlows = activeFlows;
    }

    /**
     * 
     * @return
     *     The packetsMatched
     */
    public Long getPacketsMatched() {
        return packetsMatched;
    }

    /**
     * 
     * @param packetsMatched
     *     The packets-matched
     */
    public void setPacketsMatched(Long packetsMatched) {
        this.packetsMatched = packetsMatched;
    }

}
