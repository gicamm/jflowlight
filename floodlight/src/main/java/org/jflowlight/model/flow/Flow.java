
package org.jflowlight.model.flow;

import java.io.Serializable;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class Flow implements Serializable{

    private static final long serialVersionUID = 6250106836183956205L;

    @SerializedName("switch")
    private String switchID;
    @SerializedName("in_port")
    private int inPort;
    @SerializedName("name")
    private String name;
    @SerializedName("active")
    private boolean active;
    @SerializedName("ether-type")
    private String etherType;
    @SerializedName("vlan-id")
    private String vlanID;
    @SerializedName("vlan-priority")
    private String vlanPriority;
    @SerializedName("src-ip")
    private String srcIp;
    @SerializedName("dst-ip")
    private String dstIp;
    @SerializedName("ingress-port")
    private int ingressPort;
    @SerializedName("src-port")
    private int srcPort;
    @SerializedName("dst-port")
    private int dstPort;
    @SerializedName("src-mac")
    private String srcMac;
    @SerializedName("dst-mac")
    private String dstMac;
    @SerializedName("version")
    private String version;
    @SerializedName("command")
    private String command;
    @SerializedName("cookie")
    private String cookie;
    @SerializedName("cookieMask")
    private String cookieMask;
    @SerializedName("tableId")
    private String tableId;
    @SerializedName("packetCount")
    private String packetCount;
    @SerializedName("byteCount")
    private String byteCount;
    @SerializedName("durationSeconds")
    private String durationSeconds;
    @SerializedName("priority")
    private String priority;
    @SerializedName("outGroup")
    private String outGroup;
    @SerializedName("outPort")
    private String outPort;
    @SerializedName("idleTimeoutSec")
    private String idleTimeoutSec;
    @SerializedName("hardTimeoutSec")
    private String hardTimeoutSec;
    @SerializedName("flags")
    private String flags;
    @SerializedName("actions")
    private String actions;
    @SerializedName("instruction_apply_actions")
    private String  instructionApplyActions ;
    @SerializedName("instruction_write_actions")
    private String  instructionWriteActions ;
    @SerializedName("instruction_clear_actions")
    private String  instructionClearActions ;
    @SerializedName("instruction_write_metadata")
    private String  instructionWriteMetadata ;
    @SerializedName("instruction_goto_table")
    private String  instructionGotoTable ;
    @SerializedName("instruction_goto_meter")
    private String  instructionGotoMeter ;

    private Map<String, Object> additionalProperties;

    @SerializedName("match")
    private Map<String, Object> match;
    @SerializedName("instructions")
    private Map<String, Object> instructions;


    public String getSwitchID() {
        return switchID;
    }

    public Flow setSwitchID(String switchID) {
        this.switchID = switchID;
        return this;
    }

    public String getName() {
        return name;
    }

    public Flow setName(final String name) {
        this.name = name;
        return this;
    }

    public boolean isActive() {
        return active;
    }

    public Flow setActive(final boolean active) {
        this.active = active;
        return this;
    }

    public String getEtherType() {
        return etherType;
    }

    public Flow setEtherType(final String etherType) {
        this.etherType = etherType;
        return this;
    }

    public String getSrcIp() {
        return srcIp;
    }

    public Flow setSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    public String getDstIp() {
        return dstIp;
    }

    public Flow setDstIp(final String dstIp) {
        this.dstIp = dstIp;
        return this;
    }

    public String getVlanID() {
        return vlanID;
    }

    public Flow setVlanID(String vlanID) {
        this.vlanID = vlanID;
        return this;
    }

    public String getVlanPriority() {
        return vlanPriority;
    }

    public Flow setVlanPriority(String vlanPriority) {
        this.vlanPriority = vlanPriority;
        return this;
    }

    public int getIngressPort() {
        return ingressPort;
    }

    public Flow setIngressPort(int ingressPort) {
        this.ingressPort = ingressPort;
        return this;
    }

    public int getInPort() {
        return inPort;
    }

    public Flow setInPort(final int inPort) {
        this.inPort = inPort;
        return this;
    }

    public int getSrcPort() {
        return srcPort;
    }

    public Flow setSrcPort(int srcPort) {
        this.srcPort = srcPort;
        return this;
    }

    public int getDstPort() {
        return dstPort;
    }

    public Flow setDstPort(int dstPort) {
        this.dstPort = dstPort;
        return this;
    }

    public String getSrcMac() {
        return srcMac;
    }

    public void setSrcMac(String srcMac) {
        this.srcMac = srcMac;
    }

    public String getDstMac() {
        return dstMac;
    }

    public void setDstMac(String dstMac) {
        this.dstMac = dstMac;
    }

    /**
     *
     * @return
     *     The version
     */
    public String getVersion() {
        return version;
    }

    /**
     *
     * @param version
     *     The version
     */
    public Flow setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getCommand() {
        return command;
    }

    public Flow setCommand(final String command) {
        this.command = command;
        return this;
    }

    /**
     *
     * @return
     *     The cookie
     */
    public String getCookie() {
        return cookie;
    }

    /**
     *
     * @param cookie
     *     The cookie
     */
    public Flow setCookie(final String cookie) {
        this.cookie = cookie;
        return this;
    }

    public String getCookieMask() {
        return cookieMask;
    }

    public Flow setCookieMask(final String cookieMask) {
        this.cookieMask = cookieMask;
        return this;
    }


    /**
     *
     * @return
     *     The tableId
     */
    public String getTableId() {
        return tableId;
    }

    /**
     *
     * @param tableId
     *     The tableId
     */
    public Flow setTableId(final String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     *
     * @return
     *     The packetCount
     */
    public String getPacketCount() {
        return packetCount;
    }

    /**
     *
     * @param packetCount
     *     The packetCount
     */
    public Flow setPacketCount(final String packetCount) {
        this.packetCount = packetCount;
        return this;
    }

    /**
     *
     * @return
     *     The byteCount
     */
    public String getByteCount() {
        return byteCount;
    }

    /**
     *
     * @param byteCount
     *     The byteCount
     */
    public Flow setByteCount(final String byteCount) {
        this.byteCount = byteCount;
        return this;
    }

    /**
     * 
     * @return
     *     The durationSeconds
     */
    public String getDurationSeconds() {
        return durationSeconds;
    }

    /**
     * 
     * @param durationSeconds
     *     The durationSeconds
     */
    public void setDurationSeconds(String durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * 
     * @return
     *     The priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     *
     * @param priority
     *     The priority
     */
    public Flow setPriority(final String priority) {
        this.priority = priority;
        return this;
    }

    public String getOutGroup() {
        return outGroup;
    }

    public Flow setOutGroup(final String outGroup) {
        this.outGroup = outGroup;
        return this;
    }

    public String getOutPort() {
        return outPort;
    }

    public Flow setOutPort(final String outPort) {
        this.outPort = outPort;
        return this;
    }

    /**
     *
     * @return
     *     The idleTimeoutSec
     */
    public String getIdleTimeoutSec() {
        return idleTimeoutSec;
    }

    /**
     *
     * @param idleTimeoutSec
     *     The idleTimeoutSec
     */
    public void setIdleTimeoutSec(String idleTimeoutSec) {
        this.idleTimeoutSec = idleTimeoutSec;
    }

    /**
     * 
     * @return
     *     The hardTimeoutSec
     */
    public String getHardTimeoutSec() {
        return hardTimeoutSec;
    }

    /**
     * 
     * @param hardTimeoutSec
     *     The hardTimeoutSec
     */
    public void setHardTimeoutSec(String hardTimeoutSec) {
        this.hardTimeoutSec = hardTimeoutSec;
    }

    /**
     * 
     * @return
     *     The flags
     */
    public String getFlags() {
        return flags;
    }

    /**
     * 
     * @param flags
     *     The flags
     */
    public void setFlags(String flags) {
        this.flags = flags;
    }

    /**
     * 
     * @return The match
     *
     */
    public Map<String, Object> getMatch() {
        return match;
    }

    /**
     *
     * @param match The match
     */
    public Flow setMatch(final Map<String, Object> match) {
        this.match = match;
        return this;
    }


    /**
     * 
     * @return The instructions
     */
    public Map<String, Object> getInstructions() {
        return instructions;
    }

    /**
     *
     * @param instructions The instructions
     */
    public Flow setInstructions(final Map<String, Object>instructions) {
        this.instructions = instructions;
        return this;
    }

    public String getActions() {
        return actions;
    }

    public Flow setActions(final String actions) {
        this.actions = actions;
        return this;
    }

    public String getInstructionApplyActions() {
        return instructionApplyActions;
    }

    public Flow setInstructionApplyActions(final String instructionApplyActions) {
        this.instructionApplyActions = instructionApplyActions;
        return this;
    }

    public String getInstructionWriteActions() {
        return instructionWriteActions;
    }

    public Flow setInstructionWriteActions(final String instructionWriteActions) {
        this.instructionWriteActions = instructionWriteActions;
        return this;
    }

    public String getInstructionClearActions() {
        return instructionClearActions;
    }

    public Flow setInstructionClearActions(final String instructionClearActions) {
        this.instructionClearActions = instructionClearActions;
        return this;
    }

    public String getInstructionWriteMetadata() {
        return instructionWriteMetadata;
    }

    public Flow setInstructionWriteMetadata(final String instructionWriteMetadata) {
        this.instructionWriteMetadata = instructionWriteMetadata;
        return this;
    }

    public String getInstructionGotoTable() {
        return instructionGotoTable;
    }

    public Flow setInstructionGotoTable(final String instructionGotoTable) {
        this.instructionGotoTable = instructionGotoTable;
        return this;
    }

    public String getInstructionGotoMeter() {
        return instructionGotoMeter;
    }

    public Flow setInstructionGotoMeter(final String instructionGotoMeter) {
        this.instructionGotoMeter = instructionGotoMeter;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Flow{" +
                "switchID='" + switchID + '\'' +
                ", inPort=" + inPort +
                ", name='" + name + '\'' +
                ", active=" + active +
                ", etherType='" + etherType + '\'' +
                ", vlanID='" + vlanID + '\'' +
                ", vlanPriority='" + vlanPriority + '\'' +
                ", srcIp='" + srcIp + '\'' +
                ", dstIp='" + dstIp + '\'' +
                ", ingressPort=" + ingressPort +
                ", srcPort=" + srcPort +
                ", dstPort=" + dstPort +
                ", srcMac='" + srcMac + '\'' +
                ", dstMac='" + dstMac + '\'' +
                ", version='" + version + '\'' +
                ", command='" + command + '\'' +
                ", cookie='" + cookie + '\'' +
                ", cookieMask='" + cookieMask + '\'' +
                ", tableId='" + tableId + '\'' +
                ", packetCount='" + packetCount + '\'' +
                ", byteCount='" + byteCount + '\'' +
                ", durationSeconds='" + durationSeconds + '\'' +
                ", priority='" + priority + '\'' +
                ", outGroup='" + outGroup + '\'' +
                ", outPort='" + outPort + '\'' +
                ", idleTimeoutSec='" + idleTimeoutSec + '\'' +
                ", hardTimeoutSec='" + hardTimeoutSec + '\'' +
                ", flags='" + flags + '\'' +
                ", actions='" + actions + '\'' +
                ", additionalProperties=" + additionalProperties +
                ", match=" + match +
                ", instructions=" + instructions +
                '}';
    }

}
