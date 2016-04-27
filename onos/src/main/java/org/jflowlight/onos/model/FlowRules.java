package org.jflowlight.onos.model;

import java.util.ArrayList;
import java.util.List;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * @author Alessandro Di Stefano
 */
public class FlowRules {
	@SerializedName("flows")
    @Expose
    private List<FlowRule> flows = new ArrayList<FlowRule>();

    /**
     * @return the flows
     */
    public List<FlowRule> getFlows() {
        return flows;
    }

    /**
     * @param flows the flows to set    
     */
    public void setFlows(final List<FlowRule> flows) {
        this.flows = flows;
    }
}
