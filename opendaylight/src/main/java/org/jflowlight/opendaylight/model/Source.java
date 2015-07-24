
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
@Generated("org.jflowlight")
public class Source {

    @SerializedName("source-node")
    @Expose
    private String sourceNode;
    @SerializedName("source-tp")
    @Expose
    private String sourceTp;

    /**
     * 
     * @return
     *     The sourceNode
     */
    public String getSourceNode() {
        return sourceNode;
    }

    /**
     * 
     * @param sourceNode
     *     The source-node
     */
    public void setSourceNode(String sourceNode) {
        this.sourceNode = sourceNode;
    }

    public Source withSourceNode(String sourceNode) {
        this.sourceNode = sourceNode;
        return this;
    }

    /**
     * 
     * @return
     *     The sourceTp
     */
    public String getSourceTp() {
        return sourceTp;
    }

    /**
     * 
     * @param sourceTp
     *     The source-tp
     */
    public void setSourceTp(String sourceTp) {
        this.sourceTp = sourceTp;
    }

    public Source withSourceTp(String sourceTp) {
        this.sourceTp = sourceTp;
        return this;
    }

}
