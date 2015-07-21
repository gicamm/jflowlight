
package org.jflowlight.opendaylight.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jflowlight")
public class AddressTrackerAddress {

    @Expose
    private Long id;
    @Expose
    private String ip;
    @SerializedName("first-seen")
    @Expose
    private Long firstSeen;
    @Expose
    private String mac;
    @SerializedName("last-seen")
    @Expose
    private Long lastSeen;

    /**
     * 
     * @return
     *     The id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    public AddressTrackerAddress withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 
     * @param ip
     *     The ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    public AddressTrackerAddress withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 
     * @return
     *     The firstSeen
     */
    public Long getFirstSeen() {
        return firstSeen;
    }

    /**
     * 
     * @param firstSeen
     *     The first-seen
     */
    public void setFirstSeen(Long firstSeen) {
        this.firstSeen = firstSeen;
    }

    public AddressTrackerAddress withFirstSeen(Long firstSeen) {
        this.firstSeen = firstSeen;
        return this;
    }

    /**
     * 
     * @return
     *     The mac
     */
    public String getMac() {
        return mac;
    }

    /**
     * 
     * @param mac
     *     The mac
     */
    public void setMac(String mac) {
        this.mac = mac;
    }

    public AddressTrackerAddress withMac(String mac) {
        this.mac = mac;
        return this;
    }

    /**
     * 
     * @return
     *     The lastSeen
     */
    public Long getLastSeen() {
        return lastSeen;
    }

    /**
     * 
     * @param lastSeen
     *     The last-seen
     */
    public void setLastSeen(Long lastSeen) {
        this.lastSeen = lastSeen;
    }

    public AddressTrackerAddress withLastSeen(Long lastSeen) {
        this.lastSeen = lastSeen;
        return this;
    }

}
