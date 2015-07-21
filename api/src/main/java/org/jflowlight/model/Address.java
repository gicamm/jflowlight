package org.jflowlight.model;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class Address {
    final String ipv4;
    final String mac;

    public Address(String ipv4, String mac) {
        this.ipv4 = ipv4;
        this.mac = mac;
    }

    public String getIpv4() {
        return ipv4;
    }

    public String getMac() {
        return mac;
    }

}
