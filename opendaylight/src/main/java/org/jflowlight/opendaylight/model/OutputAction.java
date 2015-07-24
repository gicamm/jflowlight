
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
@Generated("org.jflowlight")
public class OutputAction {

    @SerializedName("max-length")
    @Expose
    private Long maxLength;
    @SerializedName("output-node-connector")
    @Expose
    private String outputNodeConnector;

    /**
     * 
     * @return
     *     The maxLength
     */
    public Long getMaxLength() {
        return maxLength;
    }

    /**
     * 
     * @param maxLength
     *     The max-length
     */
    public void setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * 
     * @return
     *     The outputNodeConnector
     */
    public String getOutputNodeConnector() {
        return outputNodeConnector;
    }

    /**
     * 
     * @param outputNodeConnector
     *     The output-node-connector
     */
    public void setOutputNodeConnector(String outputNodeConnector) {
        this.outputNodeConnector = outputNodeConnector;
    }

}
