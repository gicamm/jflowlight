package org.jflowlight.model.flow;

import java.io.Serializable;

/**
 * @author Giovanni Cammarata
 */
public class ActionModel implements Serializable{
    private Long order;
    private Long maxLength;
    private String outputNodeConnector;

    public Long getOrder() {
        return order;
    }

    public ActionModel setOrder(Long order) {
        this.order = order;
        return this;
    }

    public Long getMaxLength() {
        return maxLength;
    }

    public ActionModel setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    public String getOutputNodeConnector() {
        return outputNodeConnector;
    }

    public ActionModel setOutputNodeConnector(String outputNodeConnector) {
        this.outputNodeConnector = outputNodeConnector;
        return this;
    }

}
