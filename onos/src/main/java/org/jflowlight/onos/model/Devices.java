package org.jflowlight.onos.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Alessandro Di Stefano
 */
public class Devices {
	@SerializedName("devices")
    @Expose
    private List<Device> devices = new ArrayList<>();

	/**
	 * @return the devices
	 */
	public List<Device> getDevices() {
		return devices;
	}

	/**
	 * @param devices the devices to set
	 */
	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
}