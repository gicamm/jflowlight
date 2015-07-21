package org.jflowlight.model;

import org.jflowlight.model.flow.Flow;
import java.util.Collection;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class Flows {
    private Collection<Flow> flows;

    public Collection<Flow> getFlows() {
        return flows;
    }

    public void setFlows(Collection<Flow> flows) {
        this.flows = flows;
    }
}
