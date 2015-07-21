package org.jflowlight.opendaylight.wrapper.status;


import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class NodesStatusWrapper implements Serializable {

    @SerializedName("nodes")
    private NodeStatusWrapper nodes;

    public NodeStatusWrapper getNodes() {
        return nodes;
    }

    public void setNodes(NodeStatusWrapper nodes) {
        this.nodes = nodes;
    }

}