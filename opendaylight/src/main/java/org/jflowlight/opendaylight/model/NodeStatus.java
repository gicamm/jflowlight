
package org.jflowlight.opendaylight.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jflowlight")
public class NodeStatus implements Serializable{

    private static final long serialVersionUID = 4406672852987756580L;

    @SerializedName("id")
    private String ID;

    @SerializedName("node-connector")
    @Expose
    private List<NodeConnector> nodeConnector = new ArrayList<>();

    /**
     * 
     * @return
     *     The nodeConnector
     */
    public List<NodeConnector> getNodeConnector() {
        return nodeConnector;
    }

    /**
     * 
     * @param nodeConnector
     *     The node-connector
     */
    public void setNodeConnector(final List<NodeConnector> nodeConnector) {
        this.nodeConnector = nodeConnector;
    }

    public NodeStatus withNodeConnector(final List<NodeConnector> nodeConnector) {
        this.nodeConnector = nodeConnector;
        return this;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public NodeStatus withID(final String ID) {
        this.ID = ID;
        return this;
    }

}
