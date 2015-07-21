package org.jflowlight.model.flow;

import java.io.Serializable;
import java.util.List;

/**
 * @author Giovanni Cammarata
 */
public class InstructionModel implements Serializable {
    private Long order;
    private List<ActionModel> actions;

    public Long getOrder() {
        return order;
    }

    public InstructionModel setOrder(Long order) {
        this.order = order;
        return this;
    }

    public List<ActionModel> getActions() {
        return actions;
    }

    public InstructionModel setActions(List<ActionModel> actions) {
        this.actions = actions;
        return this;
    }

}
