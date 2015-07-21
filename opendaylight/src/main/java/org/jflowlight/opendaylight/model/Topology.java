
package org.jflowlight.opendaylight.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jflowlight")
public class Topology {

    @SerializedName("topology-id")
    @Expose
    private String topologyId;
    @Expose
    private List<Node> node = new ArrayList<Node>();
    @Expose
    private List<Link> link = new ArrayList<Link>();

    /**
     * 
     * @return
     *     The topologyId
     */
    public String getTopologyId() {
        return topologyId;
    }

    /**
     * 
     * @param topologyId
     *     The topology-id
     */
    public void setTopologyId(String topologyId) {
        this.topologyId = topologyId;
    }

    public Topology withTopologyId(String topologyId) {
        this.topologyId = topologyId;
        return this;
    }

    /**
     * 
     * @return
     *     The node
     */
    public List<Node> getNode() {
        return node;
    }

    /**
     * 
     * @param node
     *     The node
     */
    public void setNode(List<Node> node) {
        this.node = node;
    }

    public Topology withNode(List<Node> node) {
        this.node = node;
        return this;
    }

    /**
     * 
     * @return
     *     The link
     */
    public List<Link> getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(List<Link> link) {
        this.link = link;
    }

    public Topology withLink(List<Link> link) {
        this.link = link;
        return this;
    }

}
