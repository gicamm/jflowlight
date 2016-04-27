package org.jflowlight.onos.model;

import com.google.gson.annotations.Expose;
/**
 * @author Alessandro Di Stefano
 */
public class Connection {
	@Expose
	private String port;
	@Expose
	private String device;
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
	 * @return the device
	 */
	public String getDevice() {
		return device;
	}
	/**
	 * @param device the device to set
	 */
	public void setDevice(String device) {
		this.device = device;
	}
	
}
