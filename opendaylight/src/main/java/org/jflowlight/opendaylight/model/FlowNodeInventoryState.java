
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jflowlight")
public class FlowNodeInventoryState {

    @SerializedName("link-down")
    @Expose
    private Boolean linkDown;
    @Expose
    private Boolean live;
    @Expose
    private Boolean blocked;

    /**
     * 
     * @return
     *     The linkDown
     */
    public Boolean getLinkDown() {
        return linkDown;
    }

    /**
     * 
     * @param linkDown
     *     The link-down
     */
    public void setLinkDown(Boolean linkDown) {
        this.linkDown = linkDown;
    }

    public FlowNodeInventoryState withLinkDown(Boolean linkDown) {
        this.linkDown = linkDown;
        return this;
    }

    /**
     * 
     * @return
     *     The live
     */
    public Boolean getLive() {
        return live;
    }

    /**
     * 
     * @param live
     *     The live
     */
    public void setLive(Boolean live) {
        this.live = live;
    }

    public FlowNodeInventoryState withLive(Boolean live) {
        this.live = live;
        return this;
    }

    /**
     * 
     * @return
     *     The blocked
     */
    public Boolean getBlocked() {
        return blocked;
    }

    /**
     * 
     * @param blocked
     *     The blocked
     */
    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public FlowNodeInventoryState withBlocked(Boolean blocked) {
        this.blocked = blocked;
        return this;
    }

}
