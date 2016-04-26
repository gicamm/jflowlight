package onos.model;

import com.google.gson.annotations.Expose;

public class Location {
	@Expose
	private String elementId;
	@Expose
	private String port;
	/**
	 * @return the elementId
	 */
	public String getElementId() {
		return elementId;
	}
	/**
	 * @param elementId the elementId to set
	 */
	public void setElementId(String elementId) {
		this.elementId = elementId;
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
}
