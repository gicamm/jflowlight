package org.jflowlight.model.flow;

import org.jflowlight.model.BaseModel;

import java.util.List;
import java.util.Map;

/**
 * @author Giovanni Cammarata
 */
public class FlowModel extends BaseModel<FlowModel>{

    private static final long serialVersionUID = -6705303732259299873L;

    private Long hardTimeout;
    private Long idleTimeout;
    private Integer tableId;
    private Long priority;
    private String flags;
    private Long cookie;
    private Map<String,Object> match;
    private List<InstructionModel> instructions;

    public Long getHardTimeout() {
        return hardTimeout;
    }

    public FlowModel setHardTimeout(Long hardTimeout) {
        this.hardTimeout = hardTimeout;
        return this;
    }

    public Long getIdleTimeout() {
        return idleTimeout;
    }

    public FlowModel setIdleTimeout(Long idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }

    public Integer getTableId() {
        return tableId;
    }

    public FlowModel setTableId(final Integer tableId) {
        this.tableId = tableId;
        return this;
    }

    public Long getPriority() {
        return priority;
    }

    public FlowModel setPriority(Long priority) {
        this.priority = priority;
        return this;
    }

    public String getFlags() {
        return flags;
    }

    public FlowModel setFlags(String flags) {
        this.flags = flags;
        return this;
    }

    public Long getCookie() {
        return cookie;
    }

    public FlowModel setCookie(Long cookie) {
        this.cookie = cookie;
        return this;
    }

    public Map<String, Object> getMatch() {
        return match;
    }

    public FlowModel setMatch(Map<String, Object> match) {
        this.match = match;
        return this;
    }

    public List<InstructionModel> getInstructions() {
        return instructions;
    }

    public FlowModel setInstructions(List<InstructionModel> instructions) {
        this.instructions = instructions;
        return this;
    }

}
