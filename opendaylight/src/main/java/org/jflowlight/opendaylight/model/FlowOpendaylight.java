
package org.jflowlight.opendaylight.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
@Generated("org.jflowlight")
public class FlowOpendaylight {

    @SerializedName("flow-node-inventory:flow")
    @Expose
    private List<Flow> flows = new ArrayList<Flow>();

    /**
     * 
     * @return
     *     The flows
     */
    public List<Flow> getFlows() {
        return flows;
    }

    /**
     * 
     * @param flows
     *     The flow-node-inventory:table
     */
    public void setFlows(List<Flow> flows) {
        this.flows = flows;
    }

    @Override
    public String toString() {
        return "FlowOpendaylight{" +
                "flows=" + flows +
                '}';
    }

}
