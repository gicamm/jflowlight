
package org.jflowlight.opendaylight.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
@Generated("org.jflowlight")
public class NetworkTopology {

    @Expose
    private List<Topology> topology = new ArrayList<Topology>();

    /**
     * 
     * @return
     *     The topology
     */
    public List<Topology> getTopology() {
        return topology;
    }

    /**
     * 
     * @param topology
     *     The topology
     */
    public void setTopology(List<Topology> topology) {
        this.topology = topology;
    }

    public NetworkTopology withTopology(List<Topology> topology) {
        this.topology = topology;
        return this;
    }

}
