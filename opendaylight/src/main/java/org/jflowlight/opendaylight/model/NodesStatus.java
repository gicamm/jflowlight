package org.jflowlight.opendaylight.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
@Generated("org.jflowlight")
public class NodesStatus implements Serializable{

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
