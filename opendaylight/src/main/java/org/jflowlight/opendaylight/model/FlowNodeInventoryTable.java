
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
public class FlowNodeInventoryTable {

    @Expose
    private Long id;
    @SerializedName("opendaylight-flow-statistics:aggregate-flow-statistics")
    @Expose
    private OpendaylightFlowStatisticsAggregateFlowStatistics opendaylightFlowStatisticsAggregateFlowStatistics;
    @SerializedName("flow-hash-id-map")
    @Expose
    private List<FlowHashIdMap> flowHashIdMap = new ArrayList<>();
    @SerializedName("opendaylight-flow-table-statistics:flow-table-statistics")
    @Expose
    private OpendaylightFlowTableStatisticsFlowTableStatistics opendaylightFlowTableStatisticsFlowTableStatistics;
    @Expose
    private List<Flow> flow = new ArrayList<>();

    /**
     * 
     * @return
     *     The id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The opendaylightFlowStatisticsAggregateFlowStatistics
     */
    public OpendaylightFlowStatisticsAggregateFlowStatistics getOpendaylightFlowStatisticsAggregateFlowStatistics() {
        return opendaylightFlowStatisticsAggregateFlowStatistics;
    }

    /**
     * 
     * @param opendaylightFlowStatisticsAggregateFlowStatistics
     *     The opendaylight-flow-statistics:aggregate-flow-statistics
     */
    public void setOpendaylightFlowStatisticsAggregateFlowStatistics(OpendaylightFlowStatisticsAggregateFlowStatistics opendaylightFlowStatisticsAggregateFlowStatistics) {
        this.opendaylightFlowStatisticsAggregateFlowStatistics = opendaylightFlowStatisticsAggregateFlowStatistics;
    }

    /**
     * 
     * @return
     *     The flowHashIdMap
     */
    public List<FlowHashIdMap> getFlowHashIdMap() {
        return flowHashIdMap;
    }

    /**
     * 
     * @param flowHashIdMap
     *     The flow-hash-id-map
     */
    public void setFlowHashIdMap(List<FlowHashIdMap> flowHashIdMap) {
        this.flowHashIdMap = flowHashIdMap;
    }

    /**
     * 
     * @return
     *     The opendaylightFlowTableStatisticsFlowTableStatistics
     */
    public OpendaylightFlowTableStatisticsFlowTableStatistics getOpendaylightFlowTableStatisticsFlowTableStatistics() {
        return opendaylightFlowTableStatisticsFlowTableStatistics;
    }

    /**
     * 
     * @param opendaylightFlowTableStatisticsFlowTableStatistics
     *     The opendaylight-flow-table-statistics:flow-table-statistics
     */
    public void setOpendaylightFlowTableStatisticsFlowTableStatistics(OpendaylightFlowTableStatisticsFlowTableStatistics opendaylightFlowTableStatisticsFlowTableStatistics) {
        this.opendaylightFlowTableStatisticsFlowTableStatistics = opendaylightFlowTableStatisticsFlowTableStatistics;
    }

    /**
     * 
     * @return
     *     The flow
     */
    public List<Flow> getFlow() {
        return flow;
    }

    /**
     * 
     * @param flow
     *     The flow
     */
    public void setFlow(List<Flow> flow) {
        this.flow = flow;
    }

}
