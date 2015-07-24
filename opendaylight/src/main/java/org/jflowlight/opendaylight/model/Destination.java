
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
@Generated("org.jflowlight")
public class Destination {

    @SerializedName("dest-node")
    @Expose
    private String destNode;
    @SerializedName("dest-tp")
    @Expose
    private String destTp;

    /**
     * 
     * @return
     *     The destNode
     */
    public String getDestNode() {
        return destNode;
    }

    /**
     * 
     * @param destNode
     *     The dest-node
     */
    public void setDestNode(String destNode) {
        this.destNode = destNode;
    }

    public Destination withDestNode(String destNode) {
        this.destNode = destNode;
        return this;
    }

    /**
     * 
     * @return
     *     The destTp
     */
    public String getDestTp() {
        return destTp;
    }

    /**
     * 
     * @param destTp
     *     The dest-tp
     */
    public void setDestTp(String destTp) {
        this.destTp = destTp;
    }

    public Destination withDestTp(String destTp) {
        this.destTp = destTp;
        return this;
    }

}
