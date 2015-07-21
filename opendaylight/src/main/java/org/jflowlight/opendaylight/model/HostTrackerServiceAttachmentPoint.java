
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jflowlight")
public class HostTrackerServiceAttachmentPoint {

    @SerializedName("tp-id")
    @Expose
    private String tpId;
    @Expose
    private Boolean active;
    @SerializedName("corresponding-tp")
    @Expose
    private String correspondingTp;

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

    public HostTrackerServiceAttachmentPoint withTpId(String tpId) {
        this.tpId = tpId;
        return this;
    }

    /**
     * 
     * @return
     *     The active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * 
     * @param active
     *     The active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    public HostTrackerServiceAttachmentPoint withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * 
     * @return
     *     The correspondingTp
     */
    public String getCorrespondingTp() {
        return correspondingTp;
    }

    /**
     * 
     * @param correspondingTp
     *     The corresponding-tp
     */
    public void setCorrespondingTp(String correspondingTp) {
        this.correspondingTp = correspondingTp;
    }

    public HostTrackerServiceAttachmentPoint withCorrespondingTp(String correspondingTp) {
        this.correspondingTp = correspondingTp;
        return this;
    }

}
