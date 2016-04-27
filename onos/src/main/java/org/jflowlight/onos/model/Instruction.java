package org.jflowlight.onos.model;

import com.google.gson.annotations.Expose;
/**
 * @author Alessandro Di Stefano
 */
public class Instruction {
	@Expose
	private String type = null;
	@Expose
	private String port = null;
	@Expose
	private Long tableId = null;
	@Expose
	private Long groupId = null;
	@Expose
	private Long meterId = null;
	@Expose
	private Long queueId = null;
	@Expose
	private String subtype = null;
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
	private Long vlanId = null;
	@Expose
	private String mac = null;
	@Expose
	private Long label = null;
	@Expose
	private Long ethernetType = null;
	@Expose
	private Long tunnelId = null;
	@Expose
	private String ip = null;
	@Expose
	private Long flowLabel = null;
	@Expose
	private Long tcpPort = null;
	@Expose
	private Long udpPort = null;
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
	 * @return the tableId
	 */
	public Long getTableId() {
		return tableId;
	}
	/**
	 * @param tableId the tableId to set
	 */
	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}
	/**
	 * @return the groupId
	 */
	public Long getGroupId() {
		return groupId;
	}
	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	/**
	 * @return the meterId
	 */
	public Long getMeterId() {
		return meterId;
	}
	/**
	 * @param meterId the meterId to set
	 */
	public void setMeterId(Long meterId) {
		this.meterId = meterId;
	}
	/**
	 * @return the queueId
	 */
	public Long getQueueId() {
		return queueId;
	}
	/**
	 * @param queueId the queueId to set
	 */
	public void setQueueId(Long queueId) {
		this.queueId = queueId;
	}
	/**
	 * @return the subtype
	 */
	public String getSubtype() {
		return subtype;
	}
	/**
	 * @param subtype the subtype to set
	 */
	public void setSubtype(String subtype) {
		this.subtype = subtype;
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
	 * @return the vlanId
	 */
	public Long getVlanId() {
		return vlanId;
	}
	/**
	 * @param vlanId the vlanId to set
	 */
	public void setVlanId(Long vlanId) {
		this.vlanId = vlanId;
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
	 * @return the ethernetType
	 */
	public Long getEthernetType() {
		return ethernetType;
	}
	/**
	 * @param ethernetType the ethernetType to set
	 */
	public void setEthernetType(Long ethernetType) {
		this.ethernetType = ethernetType;
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
	 * @return the flowLabel
	 */
	public Long getFlowLabel() {
		return flowLabel;
	}
	/**
	 * @param flowLabel the flowLabel to set
	 */
	public void setFlowLabel(Long flowLabel) {
		this.flowLabel = flowLabel;
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
	

	
}
