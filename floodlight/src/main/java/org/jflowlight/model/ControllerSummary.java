
package org.jflowlight.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class ControllerSummary implements Serializable{

    private static final long serialVersionUID = 154057047902156754L;

    @SerializedName("# switches")
    private Long switches;
    @SerializedName("# quarantine ports")
    private Long quarantinePorts;
    @SerializedName("# inter-switch links")
    private Long interSwitchLinks;
    @SerializedName("# hosts")
    private Long hosts;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The switches
     */
    public Long getSwitches() {
        return switches;
    }

    /**
     * 
     * @param Switches
     *     The # switches
     */
    public void setSwitches(Long Switches) {
        this.switches = Switches;
    }

    /**
     * 
     * @return
     *     The quarantinePorts
     */
    public Long getQuarantinePorts() {
        return quarantinePorts;
    }

    /**
     *
     * @param QuarantinePorts
     *     The # quarantine ports
     */
    public ControllerSummary setQuarantinePorts(Long QuarantinePorts) {
        this.quarantinePorts = QuarantinePorts;
        return this;
    }

    public ControllerSummary withQuarantinePorts(Long QuarantinePorts) {
        this.quarantinePorts = QuarantinePorts;
        return this;
    }

    /**
     * 
     * @return
     *     The interSwitchLinks
     */
    public Long getInterSwitchLinks() {
        return interSwitchLinks;
    }

    /**
     * 
     * @param InterSwitchLinks
     *     The # inter-switch links
     */
    public void setInterSwitchLinks(Long InterSwitchLinks) {
        this.interSwitchLinks = InterSwitchLinks;
    }

    public ControllerSummary withInterSwitchLinks(Long InterSwitchLinks) {
        this.interSwitchLinks = InterSwitchLinks;
        return this;
    }

    /**
     * 
     * @return
     *     The hosts
     */
    public Long getHosts() {
        return hosts;
    }

    /**
     * 
     * @param Hosts
     *     The # hosts
     */
    public void setHosts(Long Hosts) {
        this.hosts = Hosts;
    }

    public ControllerSummary withHosts(Long Hosts) {
        this.hosts = Hosts;
        return this;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ControllerSummary withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(switches).append(quarantinePorts).append(interSwitchLinks).append(hosts).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ControllerSummary) == false) {
            return false;
        }
        ControllerSummary rhs = ((ControllerSummary) other);
        return new EqualsBuilder().append(switches, rhs.switches).append(quarantinePorts, rhs.quarantinePorts).append(interSwitchLinks, rhs.interSwitchLinks).append(hosts, rhs.hosts).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
