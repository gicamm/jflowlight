
package org.jflowlight.opendaylight.wrapper.topology;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.jflowlight.opendaylight.model.NetworkTopology;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class NetworkTopologyWrapper {

    @SerializedName("network-topology")
    @Expose
    private NetworkTopology networkTopology;

    /**
     * 
     * @return
     *     The networkTopology
     */
    public NetworkTopology getNetworkTopology() {
        return networkTopology;
    }

    /**
     * 
     * @param networkTopology
     *     The network-topology
     */
    public void setNetworkTopology(NetworkTopology networkTopology) {
        this.networkTopology = networkTopology;
    }

    public NetworkTopologyWrapper withNetworkTopology(NetworkTopology networkTopology) {
        this.networkTopology = networkTopology;
        return this;
    }

}
