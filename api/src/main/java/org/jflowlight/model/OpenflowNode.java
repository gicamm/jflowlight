package org.jflowlight.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class OpenflowNode implements Serializable{

    private static final long serialVersionUID = -1327983090069589606L;

    private Address ipv4Address;
    private final String ID;
    private final String switchID;
    private final Map<String,LinkModel> links;


    public OpenflowNode(final String ID,final String switchID) {
        this.ID = ID;
        this.switchID = switchID;
        links = new HashMap<>();
    }

    public OpenflowNode addLink(final Map<String, LinkModel> links){
        if(links!=null)
            this.links.putAll(links);

        return this;
    }

    public boolean isLeaf() {
        return switchID != null;
    }

    public String getID() {
        return ID;
    }

    public Map<String, LinkModel> getLinks() {
        return links;
    }

    public Address getIpv4Address() {
        return ipv4Address;
    }

    public OpenflowNode setAddresses(final Address ipv4Address) {
        this.ipv4Address = ipv4Address;
        return this;
    }

    public String getSwitchID() {
        return switchID;
    }

    /**
     *
     * @return
     */
    public boolean hasChildren(){
         return !getChildren().isEmpty();
    }

    /**
     *
     * @return
     */
    public Set<String> getChildren(){
        final Set<String> toReturn = new HashSet<>();
        if(!isLeaf()) {
            for (final LinkModel link : links.values()) {
                if (link.getLinkType() == LinkModel.LinkType.SWITCH_LEAF)
                    toReturn.add(link.getDstID());
            }
        }

        return toReturn;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof OpenflowNode)) return false;

        final OpenflowNode that = (OpenflowNode) o;

        if (switchID != that.switchID) return false;
        if (ID != null ? !ID.equals(that.ID) : that.ID != null) return false;
        if (ipv4Address != null ? !ipv4Address.equals(that.ipv4Address) : that.ipv4Address != null)
            return false;
        if (links != null ? !links.equals(that.links) : that.links != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return ID.hashCode();
    }

    @Override
    public String toString() {
        return "OpenflowNode{" +
                "ipv4Address=" + ipv4Address +
                ", ID='" + ID + '\'' +
                ", switchID='" + switchID + '\'' +
                ", links=" + links +
                '}';
    }

    @Override
    public OpenflowNode clone() {
        final OpenflowNode toReturn = new OpenflowNode(ID, switchID);
        toReturn.getLinks().putAll(links);
        toReturn.setAddresses(ipv4Address);

        return toReturn;
    }

}
