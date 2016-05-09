package org.jflowlight.onos.model.topology;

import java.util.List;

import com.google.gson.annotations.Expose;
/**
 * @author Alessandro Di Stefano
 */
public class TopoDevices {
	@Expose
	private List<String> devices;

	/**
	 * @return the devices
	 */
	public List<String> getDevices() {
		return devices;
	}

	/**
	 * @param devices the devices to set
	 */
	public void setDevices(List<String> devices) {
		this.devices = devices;
	}
	
}
