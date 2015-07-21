package org.jflowlight.model.route;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class SwitchRoute implements Serializable{

    private static final long serialVersionUID = 3928218243149996232L;

    @SerializedName("switch")
    @Expose
    private String switchID;
    @Expose
    private PortRoute port;

    /**
     *
     * @return
     * The switchID
     */
    public String getSwitch() {
        return switchID;
    }

    /**
     *
     * @param switchID
     * The switch
     */
    public SwitchRoute setSwitch(String switchID) {
        this.switchID = switchID;
        return this;
    }

    /**
     *
     * @return
     * The port
     */
    public PortRoute getPort() {
        return port;
    }

    /**
     *
     * @param port
     * The port
     */
    public SwitchRoute setPort(PortRoute port) {
        this.port = port;
        return this;
    }

    @Override
    public String toString() {
        return "SwitchRoute{" +
                "switchID='" + switchID + '\'' +
                ", port=" + port +
                '}';
    }
}
