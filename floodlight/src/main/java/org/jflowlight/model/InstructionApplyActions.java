
package org.jflowlight.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "output"
})

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class InstructionApplyActions {

    @JsonProperty("output")
    private String output;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The output
     */
    @JsonProperty("output")
    public String getOutput() {
        return output;
    }

    /**
     * 
     * @param output
     *     The output
     */
    @JsonProperty("output")
    public void setOutput(String output) {
        this.output = output;
    }

    public InstructionApplyActions withOutput(String output) {
        this.output = output;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public InstructionApplyActions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(output).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstructionApplyActions) == false) {
            return false;
        }
        InstructionApplyActions rhs = ((InstructionApplyActions) other);
        return new EqualsBuilder().append(output, rhs.output).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
