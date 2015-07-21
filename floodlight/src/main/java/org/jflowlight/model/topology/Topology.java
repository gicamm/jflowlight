package org.jflowlight.model.topology;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class Topology implements Serializable{

    private static final long serialVersionUID = 8576267135480254734L;

    @SerializedName("src-switch")
    @Expose
    private String srcSwitch;
    @SerializedName("src-port")
    @Expose
    private Integer srcPort;
    @SerializedName("dst-switch")
    @Expose
    private String dstSwitch;
    @SerializedName("dst-port")
    @Expose
    private Integer dstPort;
    @Expose
    private String type;
    @Expose
    private String direction;

    /**
     *
     * @return
     * The srcSwitch
     */
    public String getSrcSwitch() {
        return srcSwitch;
    }

    /**
     *
     * @param srcSwitch
     * The src-switch
     */
    public void setSrcSwitch(String srcSwitch) {
        this.srcSwitch = srcSwitch;
    }

    /**
     *
     * @return
     * The srcPort
     */
    public Integer getSrcPort() {
        return srcPort;
    }

    /**
     *
     * @param srcPort
     * The src-port
     */
    public void setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
    }

    /**
     *
     * @return
     * The dstSwitch
     */
    public String getDstSwitch() {
        return dstSwitch;
    }

    /**
     *
     * @param dstSwitch
     * The dst-switch
     */
    public void setDstSwitch(String dstSwitch) {
        this.dstSwitch = dstSwitch;
    }

    /**
     *
     * @return
     * The dstPort
     */
    public Integer getDstPort() {
        return dstPort;
    }

    /**
     *
     * @param dstPort
     * The dst-port
     */
    public void setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     *
     * @param direction
     * The direction
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Topology{" +
                "srcSwitch='" + srcSwitch + '\'' +
                ", srcPort=" + srcPort +
                ", dstSwitch='" + dstSwitch + '\'' +
                ", dstPort=" + dstPort +
                ", type='" + type + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }
}
