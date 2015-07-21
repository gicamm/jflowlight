
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jflowlight")
public class FlowHashIdMap {

    @Expose
    private String hash;
    @SerializedName("flow-id")
    @Expose
    private String flowId;

    /**
     * 
     * @return
     *     The hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * 
     * @param hash
     *     The hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * 
     * @return
     *     The flowId
     */
    public String getFlowId() {
        return flowId;
    }

    /**
     * 
     * @param flowId
     *     The flow-id
     */
    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

}
