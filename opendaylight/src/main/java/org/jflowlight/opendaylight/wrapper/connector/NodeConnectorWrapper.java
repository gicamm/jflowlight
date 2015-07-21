package org.jflowlight.opendaylight.wrapper.connector;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.jflowlight.opendaylight.model.NodeConnector;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Generated("org.jsonschema2pojo")
public class NodeConnectorWrapper implements Serializable {

    private static final long serialVersionUID = 3961108805587589959L;

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

    public NodeConnectorWrapper withNodeConnector(final List<NodeConnector> nodeConnector) {
        this.nodeConnector = nodeConnector;
        return this;
    }


}

