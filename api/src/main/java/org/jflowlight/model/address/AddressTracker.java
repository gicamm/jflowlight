package org.jflowlight.model.address;

/**
 * @author Giovanni Cammarata
 */
public class AddressTracker {

    private Long id;
    private String ip;
    private Long firstSeen;
    private String mac;
    private Long lastSeen;

    public Long getId() {
        return id;
    }

    public AddressTracker setId(Long id) {
        this.id = id;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public AddressTracker setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public Long getFirstSeen() {
        return firstSeen;
    }

    public AddressTracker setFirstSeen(Long firstSeen) {
        this.firstSeen = firstSeen;
        return this;
    }

    public String getMac() {
        return mac;
    }

    public AddressTracker setMac(String mac) {
        this.mac = mac;
        return this;
    }

    public Long getLastSeen() {
        return lastSeen;
    }

    public AddressTracker setLastSeen(Long lastSeen) {
        this.lastSeen = lastSeen;
        return this;
    }

}
