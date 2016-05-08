package org.jflowlight.onos.model;

import com.google.gson.annotations.Expose;

/* * 				"managementAddress":"192.168.0.2",
 * 				"protocol":"OF_13",
 * 				"channelId":"192.168.0.2:33783"}*/
/**
 * @author Alessandro Di Stefano
 */
public class Annotations {
	@Expose
	private String managementAddress;
	@Expose
	private String protocol;
	@Expose
	private String channelId;
	/**
	 * @return the managementAddress
	 */
	public String getManagementAddress() {
		return managementAddress;
	}
	/**
	 * @param managementAddress the managementAddress to set
	 */
	public void setManagementAddress(String managementAddress) {
		this.managementAddress = managementAddress;
	}
	/**
	 * @return the protocol
	 */
	public String getProtocol() {
		return protocol;
	}
	/**
	 * @param protocol the protocol to set
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	/**
	 * @return the channelId
	 */
	public String getChannelId() {
		return channelId;
	}
	/**
	 * @param channelId the channelId to set
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
}
