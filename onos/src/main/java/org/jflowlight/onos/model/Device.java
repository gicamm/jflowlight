package org.jflowlight.onos.model;

import com.google.gson.annotations.Expose;

/**
 * @author Alessandro Di Stefano
 */

/* {"devices":
 * 	[
 * 		{
 * 			"id":"of:000000000000000c",
 * 			"type":"SWITCH",
 * 			"available":true,
 * 			"role":"MASTER",
 * 			"mfr":"Nicira, Inc.",
 * 			"hw":"Open vSwitch",
 * 			"sw":"2.3.0",
 * 			"serial":"None",
 * 			"chassisId":"c",
 * 			"annotations":{
 * 				"managementAddress":"192.168.0.2",
 * 				"protocol":"OF_13",
 * 				"channelId":"192.168.0.2:33783"}
 * 			}
 * 		}
 * ...]
 * 
 */
public class Device {
	@Expose
	private String id;
	@Expose
	private String type;
	@Expose
	private Boolean available;
	@Expose
	private String role;
	@Expose
	private String mfr;
	@Expose
	private String hw;
	@Expose
	private String sw;
	@Expose
	private String serial;
	@Expose
	private String chassisId;
	@Expose
	private Annotations annotations;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the available
	 */
	public Boolean getAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @return the mfr
	 */
	public String getMfr() {
		return mfr;
	}
	/**
	 * @param mfr the mfr to set
	 */
	public void setMfr(String mfr) {
		this.mfr = mfr;
	}
	/**
	 * @return the hw
	 */
	public String getHw() {
		return hw;
	}
	/**
	 * @param hw the hw to set
	 */
	public void setHw(String hw) {
		this.hw = hw;
	}
	/**
	 * @return the sw
	 */
	public String getSw() {
		return sw;
	}
	/**
	 * @param sw the sw to set
	 */
	public void setSw(String sw) {
		this.sw = sw;
	}
	/**
	 * @return the serial
	 */
	public String getSerial() {
		return serial;
	}
	/**
	 * @param serial the serial to set
	 */
	public void setSerial(String serial) {
		this.serial = serial;
	}
	/**
	 * @return the chassisId
	 */
	public String getChassisId() {
		return chassisId;
	}
	/**
	 * @param chassisId the chassisId to set
	 */
	public void setChassisId(String chassisId) {
		this.chassisId = chassisId;
	}
	/**
	 * @return the annotations
	 */
	public Annotations getAnnotations() {
		return annotations;
	}
	/**
	 * @param annotations the annotations to set
	 */
	public void setAnnotations(Annotations annotations) {
		this.annotations = annotations;
	}
	
}
