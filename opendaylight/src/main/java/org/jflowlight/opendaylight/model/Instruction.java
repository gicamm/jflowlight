
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
@Generated("org.jflowlight")
public class Instruction {

    @Expose
    private Long order;
    @SerializedName("apply-actions")
    @Expose
    private ApplyActions applyActions;

    /**
     * 
     * @return
     *     The order
     */
    public Long getOrder() {
        return order;
    }

    /**
     * 
     * @param order
     *     The order
     */
    public void setOrder(Long order) {
        this.order = order;
    }

    /**
     * 
     * @return
     *     The applyActions
     */
    public ApplyActions getApplyActions() {
        return applyActions;
    }

    /**
     * 
     * @param applyActions
     *     The apply-actions
     */
    public void setApplyActions(ApplyActions applyActions) {
        this.applyActions = applyActions;
    }

}
