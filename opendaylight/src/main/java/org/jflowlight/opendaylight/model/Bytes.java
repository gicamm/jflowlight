
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
@Generated("org.jflowlight")
public class Bytes {

    @Expose
    private Long received;
    @Expose
    private Long transmitted;

    /**
     * 
     * @return
     *     The received
     */
    public Long getReceived() {
        return received;
    }

    /**
     * 
     * @param received
     *     The received
     */
    public void setReceived(Long received) {
        this.received = received;
    }

    public Bytes withReceived(Long received) {
        this.received = received;
        return this;
    }

    /**
     * 
     * @return
     *     The transmitted
     */
    public Long getTransmitted() {
        return transmitted;
    }

    /**
     * 
     * @param transmitted
     *     The transmitted
     */
    public void setTransmitted(Long transmitted) {
        this.transmitted = transmitted;
    }

    public Bytes withTransmitted(Long transmitted) {
        this.transmitted = transmitted;
        return this;
    }

}
