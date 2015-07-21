
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jflowlight")
public class TerminationPoint {

    @SerializedName("tp-id")
    @Expose
    private String tpId;

    /**
     * 
     * @return
     *     The tpId
     */
    public String getTpId() {
        return tpId;
    }

    /**
     * 
     * @param tpId
     *     The tp-id
     */
    public void setTpId(String tpId) {
        this.tpId = tpId;
    }

    public TerminationPoint withTpId(String tpId) {
        this.tpId = tpId;
        return this;
    }

}
