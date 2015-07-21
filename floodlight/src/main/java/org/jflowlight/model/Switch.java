
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
    "inetAddress",
    "connectedSince",
    "switchDPID"
})

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class Switch {

    @JsonProperty("inetAddress")
    private String inetAddress;
    @JsonProperty("connectedSince")
    private Long connectedSince;
    @JsonProperty("switchDPID")
    private String switchDPID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The inetAddress
     */
    @JsonProperty("inetAddress")
    public String getInetAddress() {
        return inetAddress;
    }

    /**
     * 
     * @param inetAddress
     *     The inetAddress
     */
    @JsonProperty("inetAddress")
    public void setInetAddress(String inetAddress) {
        this.inetAddress = inetAddress;
    }

    public Switch withInetAddress(String inetAddress) {
        this.inetAddress = inetAddress;
        return this;
    }

    /**
     * 
     * @return
     *     The connectedSince
     */
    @JsonProperty("connectedSince")
    public Long getConnectedSince() {
        return connectedSince;
    }

    /**
     * 
     * @param connectedSince
     *     The connectedSince
     */
    @JsonProperty("connectedSince")
    public void setConnectedSince(Long connectedSince) {
        this.connectedSince = connectedSince;
    }

    public Switch withConnectedSince(Long connectedSince) {
        this.connectedSince = connectedSince;
        return this;
    }

    /**
     * 
     * @return
     *     The switchDPID
     */
    @JsonProperty("switchDPID")
    public String getSwitchDPID() {
        return switchDPID;
    }

    /**
     * 
     * @param switchDPID
     *     The switchDPID
     */
    @JsonProperty("switchDPID")
    public void setSwitchDPID(String switchDPID) {
        this.switchDPID = switchDPID;
    }

    public Switch withSwitchDPID(String switchDPID) {
        this.switchDPID = switchDPID;
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

    public Switch withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(inetAddress).append(connectedSince).append(switchDPID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Switch) == false) {
            return false;
        }
        Switch rhs = ((Switch) other);
        return new EqualsBuilder().append(inetAddress, rhs.inetAddress).append(connectedSince, rhs.connectedSince).append(switchDPID, rhs.switchDPID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
