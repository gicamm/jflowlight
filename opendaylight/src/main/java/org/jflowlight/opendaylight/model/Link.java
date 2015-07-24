
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
@Generated("org.jflowlight")
public class Link {

    @SerializedName("link-id")
    @Expose
    private String linkId;
    @Expose
    private Destination destination;
    @Expose
    private Source source;

    /**
     * 
     * @return
     *     The linkId
     */
    public String getLinkId() {
        return linkId;
    }

    /**
     * 
     * @param linkId
     *     The link-id
     */
    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public Link withLinkId(String linkId) {
        this.linkId = linkId;
        return this;
    }

    /**
     * 
     * @return
     *     The destination
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * 
     * @param destination
     *     The destination
     */
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Link withDestination(Destination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 
     * @return
     *     The source
     */
    public Source getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    public void setSource(Source source) {
        this.source = source;
    }

    public Link withSource(Source source) {
        this.source = source;
        return this;
    }

}
