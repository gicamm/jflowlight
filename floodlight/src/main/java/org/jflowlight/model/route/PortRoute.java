package org.jflowlight.model.route;
import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class PortRoute implements Serializable{

    private static final long serialVersionUID = 3365064210536200010L;

    @Expose
    private Integer portNumber;
    @Expose
    private Integer shortPortNumber;
    @Expose
    private Integer length;

    /**
     *
     * @return
     * The portNumber
     */
    public Integer getPortNumber() {
        return portNumber;
    }

    /**
     *
     * @param portNumber
     * The portNumber
     */
    public void setPortNumber(Integer portNumber) {
        this.portNumber = portNumber;
    }

    /**
     *
     * @return
     * The shortPortNumber
     */
    public Integer getShortPortNumber() {
        return shortPortNumber;
    }

    /**
     *
     * @param shortPortNumber
     * The shortPortNumber
     */
    public void setShortPortNumber(Integer shortPortNumber) {
        this.shortPortNumber = shortPortNumber;
    }

    /**
     *
     * @return
     * The length
     */
    public Integer getLength() {
        return length;
    }

    /**
     *
     * @param length
     * The length
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "PortRoute{" +
                "portNumber=" + portNumber +
                ", shortPortNumber=" + shortPortNumber +
                ", length=" + length +
                '}';
    }

}
