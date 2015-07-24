
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
@Generated("org.jflowlight")
public class Action {

    @Expose
    private Long order;
    @SerializedName("output-action")
    @Expose
    private OutputAction outputAction;

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
     *     The outputAction
     */
    public OutputAction getOutputAction() {
        return outputAction;
    }

    /**
     * 
     * @param outputAction
     *     The output-action
     */
    public void setOutputAction(OutputAction outputAction) {
        this.outputAction = outputAction;
    }

}
