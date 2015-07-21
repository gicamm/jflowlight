
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

@Generated("org.jflowlight")
public class Flow {

    @Expose
    private String id;
    @Expose
    private Instructions instructions;
    @SerializedName("hard-timeout")
    @Expose
    private Long hardTimeout;
    @SerializedName("idle-timeout")
    @Expose
    private Long idleTimeout;
    @Expose
    private Map<String,Object> match;
    @SerializedName("opendaylight-flow-statistics:flow-statistics")
    @Expose
    private OpendaylightFlowStatisticsFlowStatistics opendaylightFlowStatisticsFlowStatistics;
    @SerializedName("table_id")
    @Expose
    private Long tableId;
    @Expose
    private Long priority;
    @Expose
    private String flags;
    @Expose
    private Long cookie;


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

    /**
     * 
     * @return
     *     The instructions
     */
    public Instructions getInstructions() {
        return instructions;
    }

    /**
     * 
     * @param instructions
     *     The instructions
     */
    public void setInstructions(Instructions instructions) {
        this.instructions = instructions;
    }

    /**
     * 
     * @return
     *     The hardTimeout
     */
    public Long getHardTimeout() {
        return hardTimeout;
    }

    /**
     * 
     * @param hardTimeout
     *     The hard-timeout
     */
    public void setHardTimeout(Long hardTimeout) {
        this.hardTimeout = hardTimeout;
    }

    /**
     * 
     * @return
     *     The idleTimeout
     */
    public Long getIdleTimeout() {
        return idleTimeout;
    }

    /**
     * 
     * @param idleTimeout
     *     The idle-timeout
     */
    public void setIdleTimeout(Long idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    /**
     * 
     * @return
     *     The match
     */
    public Map<String, Object> getMatch() {
        return match;
    }

    /**
     * 
     * @param match
     *     The match
     */
    public void setMatch(final Map<String, Object> match) {
        this.match = match;
    }

    /**
     * 
     * @return
     *     The opendaylightFlowStatisticsFlowStatistics
     */
    public OpendaylightFlowStatisticsFlowStatistics getOpendaylightFlowStatisticsFlowStatistics() {
        return opendaylightFlowStatisticsFlowStatistics;
    }

    /**
     * 
     * @param opendaylightFlowStatisticsFlowStatistics
     *     The opendaylight-flow-statistics:flow-statistics
     */
    public void setOpendaylightFlowStatisticsFlowStatistics(OpendaylightFlowStatisticsFlowStatistics opendaylightFlowStatisticsFlowStatistics) {
        this.opendaylightFlowStatisticsFlowStatistics = opendaylightFlowStatisticsFlowStatistics;
    }

    /**
     * 
     * @return
     *     The tableId
     */
    public Long getTableId() {
        return tableId;
    }

    /**
     * 
     * @param tableId
     *     The table_id
     */
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    /**
     * 
     * @return
     *     The priority
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * 
     * @param priority
     *     The priority
     */
    public void setPriority(Long priority) {
        this.priority = priority;
    }

    /**
     * 
     * @return
     *     The flags
     */
    public String getFlags() {
        return flags;
    }

    /**
     * 
     * @param flags
     *     The flags
     */
    public void setFlags(String flags) {
        this.flags = flags;
    }

    /**
     * 
     * @return
     *     The cookie
     */
    public Long getCookie() {
        return cookie;
    }

    /**
     * 
     * @param cookie
     *     The cookie
     */
    public void setCookie(Long cookie) {
        this.cookie = cookie;
    }

    @Override
    public String toString() {
        return "Flow{" +
                "id='" + id + '\'' +
                ", instructions=" + instructions +
                ", hardTimeout=" + hardTimeout +
                ", idleTimeout=" + idleTimeout +
                ", match=" + match +
                ", opendaylightFlowStatisticsFlowStatistics=" + opendaylightFlowStatisticsFlowStatistics +
                ", tableId=" + tableId +
                ", priority=" + priority +
                ", flags='" + flags + '\'' +
                ", cookie=" + cookie +
                '}';
    }

}
