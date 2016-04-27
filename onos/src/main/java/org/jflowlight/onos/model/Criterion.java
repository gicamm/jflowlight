package org.jflowlight.onos.model;

import java.util.AbstractMap;
import java.util.Map;

import com.google.gson.annotations.Expose;
/**
 * @author Alessandro Di Stefano
 */
public class Criterion {
	@Expose
	private String type = null;
	@Expose
	private String mac = null;
	@Expose
	private String port = null;
	@Expose
	private String metadata = null;
	@Expose
	private String vLanId = null;
	@Expose
	private String priority = null;
	@Expose
	private String innerVlanId = null;
	@Expose
	private String innerPriority = null;
	@Expose
	private Long ipDscp = null;
	@Expose
	private Long ipEcn = null;
	@Expose
	private Long protocol = null;
	@Expose
	private String ip = null;
	@Expose
	private Long tcpPort = null;
	@Expose
	private Long udpPort = null;
	@Expose
	private String ethType = null;
	@Expose
	private Long sctpPort = null;
	@Expose
	private String icmpType = null;
	@Expose
	private Long icmpCode = null;
	@Expose
	private Long flowlabel = null;
	@Expose
	private Long icmpv6Type = null;
	@Expose
	private Long icmpv6Code = null;
	@Expose
	private String targetAddress = null;
	@Expose
	private Long label = null;
	@Expose
	private Long exthdrFlags = null;
	@Expose
	private Long lambda = null;
	@Expose
	private String gridType = null;
	@Expose
	private Long channelSpacing = null;
	@Expose
	private Long spacingMultiplier = null;
	@Expose
	private Long slotGranularity = null;
	@Expose
	private Long ochSignalId = null;
	@Expose
	private Long tunnelId = null;
	@Expose
	private Long ochSignalType = null;
	@Expose
	private Long oduSignalId = null;
	@Expose
	private Long tributaryPortNumber = null;
	@Expose
	private Long tributarySlotBitmap = null;
	@Expose
	private Long triburaySlotLen = null;
	
	public Map.Entry<String,Object> getMatch()
	{
		switch (getType())
		{
			case "ETH_TYPE":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getEthType());
			case "ETH_DST":
			case "ETH_SRC":
			case "IPV6_ND_SLL":
			case "IPV6_ND_TLL":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getMac());
			case "IN_PORT":
			case "IN_PHY_PORT":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getPort());
			case "METADATA":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getMetadata());
			case "VLAN_VID":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getvLanId());
			case "VLAN_PCP":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getPriority());
			case "INNER_VLAN_VID":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getInnerVlanId());
			case "INNER_VLAN_PCP":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getInnerPriority());
			case "IP_DSCP":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getIpDscp());
			case "IP_ECN":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getIpEcn());
			case "IP_PROTO":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getProtocol());
			case "IPV4_SRC":
			case "IPV4_DST":
			case "IPV6_SRC":
			case "IPV6_DST":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getIp());
			case "TCP_SRC":
			case "TCP_DST":
			case "UDP_DST":
			case "UDP_SRC":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getTcpPort());
			case "SCTP_SRC":
			case "SCTP_DST":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getSctpPort());
			case "ICMPV4_TYPE":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getIcmpType());
			case "ICMPV4_CODE":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getIcmpCode());
			case "IPV6_FLABEL":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getFlowlabel());
			case "ICMPV6_TYPE":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getIcmpv6Type());
			case "ICMPV6_CODE": 
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getIcmpv6Code());
			case "ICMPV6_ND_TARGET":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getTargetAddress());
			case "MPLS_LABEL":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getLabel());
			case "IPV6_EXTHDR":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getExthdrFlags());
			case "OCH_SIGID":
				if (getLambda() != null)
					return new AbstractMap.SimpleEntry<String, Object> (getType(), getLambda());
				else
					return new AbstractMap.SimpleEntry<String, Object> (getType(), getOchSignalId());
			case "GRID_TYPE":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getGridType());
			case "CHANNEL_SPACING":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getChannelSpacing());
			case "SPACING_MULTIPLIER":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getSpacingMultiplier());
			case "SLOT_GRANULARITY":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getSlotGranularity());
			case "OCH_SIGTYPE":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getOchSignalType());
			case "ODU_SIGTYPE":
				return new AbstractMap.SimpleEntry<String, Object> (getType(), getOduSignalId());
			default:
				return null;
				
		}
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the mac
	 */
	public String getMac() {
		return mac;
	}
	/**
	 * @param mac the mac to set
	 */
	public void setMac(String mac) {
		this.mac = mac;
	}
	/**
	 * @return the port
	 */
	public String getPort() {
		return port;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(String port) {
		this.port = port;
	}

	/**
	 * @return the vLanId
	 */
	public String getvLanId() {
		return vLanId;
	}
	/**
	 * @param vLanId the vLanId to set
	 */
	public void setvLanId(String vLanId) {
		this.vLanId = vLanId;
	}
	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}
	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}
	/**
	 * @return the innerVlanId
	 */
	public String getInnerVlanId() {
		return innerVlanId;
	}
	/**
	 * @param innerVlanId the innerVlanId to set
	 */
	public void setInnerVlanId(String innerVlanId) {
		this.innerVlanId = innerVlanId;
	}
	/**
	 * @return the innerPriority
	 */
	public String getInnerPriority() {
		return innerPriority;
	}
	/**
	 * @param innerPriority the innerPriority to set
	 */
	public void setInnerPriority(String innerPriority) {
		this.innerPriority = innerPriority;
	}
	/**
	 * @return the ipDscp
	 */
	public Long getIpDscp() {
		return ipDscp;
	}
	/**
	 * @param ipDscp the ipDscp to set
	 */
	public void setIpDscp(Long ipDscp) {
		this.ipDscp = ipDscp;
	}
	/**
	 * @return the ipEcn
	 */
	public Long getIpEcn() {
		return ipEcn;
	}
	/**
	 * @param ipEcn the ipEcn to set
	 */
	public void setIpEcn(Long ipEcn) {
		this.ipEcn = ipEcn;
	}
	/**
	 * @return the protocol
	 */
	public Long getProtocol() {
		return protocol;
	}
	/**
	 * @param protocol the protocol to set
	 */
	public void setProtocol(Long protocol) {
		this.protocol = protocol;
	}
	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * @return the tcpPort
	 */
	public Long getTcpPort() {
		return tcpPort;
	}
	/**
	 * @param tcpPort the tcpPort to set
	 */
	public void setTcpPort(Long tcpPort) {
		this.tcpPort = tcpPort;
	}
	/**
	 * @return the ethType
	 */
	public String getEthType() {
		return ethType;
	}
	/**
	 * @param ethType the ethType to set
	 */
	public void setEthType(String ethType) {
		this.ethType = ethType;
	}
	/**
	 * @return the sctpPort
	 */
	public Long getSctpPort() {
		return sctpPort;
	}
	/**
	 * @param sctpPort the sctpPort to set
	 */
	public void setSctpPort(Long sctpPort) {
		this.sctpPort = sctpPort;
	}
	/**
	 * @return the icmpType
	 */
	public String getIcmpType() {
		return icmpType;
	}
	/**
	 * @param icmpType the icmpType to set
	 */
	public void setIcmpType(String icmpType) {
		this.icmpType = icmpType;
	}
	/**
	 * @return the icmpCode
	 */
	public Long getIcmpCode() {
		return icmpCode;
	}
	/**
	 * @param icmpCode the icmpCode to set
	 */
	public void setIcmpCode(Long icmpCode) {
		this.icmpCode = icmpCode;
	}
	/**
	 * @return the flowlabel
	 */
	public Long getFlowlabel() {
		return flowlabel;
	}
	/**
	 * @param flowlabel the flowlabel to set
	 */
	public void setFlowlabel(Long flowlabel) {
		this.flowlabel = flowlabel;
	}
	/**
	 * @return the icmpv6Type
	 */
	public Long getIcmpv6Type() {
		return icmpv6Type;
	}
	/**
	 * @param icmpv6Type the icmpv6Type to set
	 */
	public void setIcmpv6Type(Long icmpv6Type) {
		this.icmpv6Type = icmpv6Type;
	}
	/**
	 * @return the targetAddress
	 */
	public String getTargetAddress() {
		return targetAddress;
	}
	/**
	 * @param targetAddress the targetAddress to set
	 */
	public void setTargetAddress(String targetAddress) {
		this.targetAddress = targetAddress;
	}
	/**
	 * @return the label
	 */
	public Long getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(Long label) {
		this.label = label;
	}
	/**
	 * @return the exthdrFlags
	 */
	public Long getExthdrFlags() {
		return exthdrFlags;
	}
	/**
	 * @param exthdrFlags the exthdrFlags to set
	 */
	public void setExthdrFlags(Long exthdrFlags) {
		this.exthdrFlags = exthdrFlags;
	}
	/**
	 * @return the udpPort
	 */
	public Long getUdpPort() {
		return udpPort;
	}
	/**
	 * @param udpPort the udpPort to set
	 */
	public void setUdpPort(Long udpPort) {
		this.udpPort = udpPort;
	}
	/**
	 * @return the lambda
	 */
	public Long getLambda() {
		return lambda;
	}
	/**
	 * @param lambda the lambda to set
	 */
	public void setLambda(Long lambda) {
		this.lambda = lambda;
	}
	/**
	 * @return the gridType
	 */
	public String getGridType() {
		return gridType;
	}
	/**
	 * @param gridType the gridType to set
	 */
	public void setGridType(String gridType) {
		this.gridType = gridType;
	}
	/**
	 * @return the channelSpacing
	 */
	public Long getChannelSpacing() {
		return channelSpacing;
	}
	/**
	 * @param channelSpacing the channelSpacing to set
	 */
	public void setChannelSpacing(Long channelSpacing) {
		this.channelSpacing = channelSpacing;
	}
	/**
	 * @return the spacingMultiplier
	 */
	public Long getSpacingMultiplier() {
		return spacingMultiplier;
	}
	/**
	 * @param spacingMultiplier the spacingMultiplier to set
	 */
	public void setSpacingMultiplier(Long spacingMultiplier) {
		this.spacingMultiplier = spacingMultiplier;
	}
	/**
	 * @return the slotGranularity
	 */
	public Long getSlotGranularity() {
		return slotGranularity;
	}
	/**
	 * @param slotGranularity the slotGranularity to set
	 */
	public void setSlotGranularity(Long slotGranularity) {
		this.slotGranularity = slotGranularity;
	}
	/**
	 * @return the ochSignalId
	 */
	public Long getOchSignalId() {
		return ochSignalId;
	}
	/**
	 * @param ochSignalId the ochSignalId to set
	 */
	public void setOchSignalId(Long ochSignalId) {
		this.ochSignalId = ochSignalId;
	}
	/**
	 * @return the tunnelId
	 */
	public Long getTunnelId() {
		return tunnelId;
	}
	/**
	 * @param tunnelId the tunnelId to set
	 */
	public void setTunnelId(Long tunnelId) {
		this.tunnelId = tunnelId;
	}
	/**
	 * @return the ochSignalType
	 */
	public Long getOchSignalType() {
		return ochSignalType;
	}
	/**
	 * @param ochSignalType the ochSignalType to set
	 */
	public void setOchSignalType(Long ochSignalType) {
		this.ochSignalType = ochSignalType;
	}
	/**
	 * @return the oduSignalId
	 */
	public Long getOduSignalId() {
		return oduSignalId;
	}
	/**
	 * @param oduSignalId the oduSignalId to set
	 */
	public void setOduSignalId(Long oduSignalId) {
		this.oduSignalId = oduSignalId;
	}
	/**
	 * @return the tributaryPortNumber
	 */
	public Long getTributaryPortNumber() {
		return tributaryPortNumber;
	}
	/**
	 * @param tributaryPortNumber the tributaryPortNumber to set
	 */
	public void setTributaryPortNumber(Long tributaryPortNumber) {
		this.tributaryPortNumber = tributaryPortNumber;
	}
	/**
	 * @return the tributarySlotBitmap
	 */
	public Long getTributarySlotBitmap() {
		return tributarySlotBitmap;
	}
	/**
	 * @param tributarySlotBitmap the tributarySlotBitmap to set
	 */
	public void setTributarySlotBitmap(Long tributarySlotBitmap) {
		this.tributarySlotBitmap = tributarySlotBitmap;
	}
	/**
	 * @return the triburaySlotLen
	 */
	public Long getTriburaySlotLen() {
		return triburaySlotLen;
	}
	/**
	 * @param triburaySlotLen the triburaySlotLen to set
	 */
	public void setTriburaySlotLen(Long triburaySlotLen) {
		this.triburaySlotLen = triburaySlotLen;
	}
	/**
	 * @return the metadata
	 */
	public String getMetadata() {
		return metadata;
	}
	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}
	/**
	 * @return the icmpv6Code
	 */
	public Long getIcmpv6Code() {
		return icmpv6Code;
	}
	/**
	 * @param icmpv6Code the icmpv6Code to set
	 */
	public void setIcmpv6Code(Long icmpv6Code) {
		this.icmpv6Code = icmpv6Code;
	}
	

}
