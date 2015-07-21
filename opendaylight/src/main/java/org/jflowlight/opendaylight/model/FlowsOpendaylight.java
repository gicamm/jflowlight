
package org.jflowlight.opendaylight.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jflowlight")
public class FlowsOpendaylight {

    @SerializedName("flow-node-inventory:table")
    @Expose
    private List<FlowNodeInventoryTable> flowNodeInventoryTable = new ArrayList<FlowNodeInventoryTable>();

    /**
     * 
     * @return
     *     The flowNodeInventoryTable
     */
    public List<FlowNodeInventoryTable> getFlowNodeInventoryTable() {
        return flowNodeInventoryTable;
    }

    /**
     * 
     * @param flowNodeInventoryTable
     *     The flow-node-inventory:table
     */
    public void setFlowNodeInventoryTable(final List<FlowNodeInventoryTable> flowNodeInventoryTable) {
        this.flowNodeInventoryTable = flowNodeInventoryTable;
    }

}
