package org.jflowlight.model;

import java.io.Serializable;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class LinkModel implements Serializable{

    private static final long serialVersionUID = 6914468584987148627L;

    public enum LinkType{
        SWITCH_LEAF,
        SWITCH_SWITCH
    }

    private final String dstID;
    private final Integer dstPort;
    private final Integer srcPort;
    private final LinkType linkType;

    public LinkModel(final String dstID, final Integer dstPort, final Integer srcPort, final LinkType linkType) {
        this.dstID = dstID;
        this.dstPort = dstPort;
        this.srcPort = srcPort;
        this.linkType = linkType;
    }

    public String getDstID() {
        return dstID;
    }

    public Integer getDstPort() {
        return dstPort;
    }

    public Integer getSrcPort() {
        return srcPort;
    }

    public LinkType getLinkType() {
        return linkType;
    }

    @Override
    public String toString() {
        return "Link{" +
                "dstID='" + dstID + '\'' +
                ", dstPort=" + dstPort +
                ", srcPort=" + srcPort +
                ", linkType=" + linkType +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof LinkModel)) return false;

        final LinkModel linkModel = (LinkModel) o;

        if (dstID != null ? !dstID.equals(linkModel.dstID) : linkModel.dstID != null) return false;
        if (dstPort != null ? !dstPort.equals(linkModel.dstPort) : linkModel.dstPort != null) return false;
        if (srcPort != null ? !srcPort.equals(linkModel.srcPort) : linkModel.srcPort != null) return false;
        if (linkType != null ? !linkType.equals(linkModel.linkType) : linkModel.linkType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dstID != null ? dstID.hashCode() : 0;
        result = 31 * result + (dstPort != null ? dstPort.hashCode() : 0);
        result = 31 * result + (srcPort != null ? srcPort.hashCode() : 0);
        result = 31 * result + (linkType != null ? linkType.hashCode() : 0);
        return result;
    }

    @Override
    protected LinkModel clone(){
        return new LinkModel(dstID,dstPort,srcPort,linkType);
    }

}
