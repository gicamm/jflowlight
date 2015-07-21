package org.jflowlight.opendaylight.wrapper.status;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.jflowlight.opendaylight.model.NodeStatus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class NodeStatusWrapper implements Serializable {

    @SerializedName("node")
    @Expose
    private List<NodeStatus> nodes = new ArrayList<>();

    public List<NodeStatus> getNodes() {
        return nodes;
    }

    public void setNodes(List<NodeStatus> nodes) {
        this.nodes = nodes;
    }

}