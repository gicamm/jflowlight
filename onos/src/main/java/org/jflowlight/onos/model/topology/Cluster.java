package org.jflowlight.onos.model.topology;

import org.jflowlight.onos.model.Links;

import com.google.gson.annotations.Expose;
/**
 * @author Alessandro Di Stefano
 */
public class Cluster {
	@Expose
	private Long id;
	@Expose
	private Long deviceCount;
	@Expose
	private Long linkCount;
	@Expose
	private String root;
	
	private TopoDevices devices;
	private Links links;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the deviceCount
	 */
	public Long getDeviceCount() {
		return deviceCount;
	}
	/**
	 * @param deviceCount the deviceCount to set
	 */
	public void setDeviceCount(Long deviceCount) {
		this.deviceCount = deviceCount;
	}
	/**
	 * @return the linkCount
	 */
	public Long getLinkCount() {
		return linkCount;
	}
	/**
	 * @param linkCount the linkCount to set
	 */
	public void setLinkCount(Long linkCount) {
		this.linkCount = linkCount;
	}
	/**
	 * @return the root
	 */
	public String getRoot() {
		return root;
	}
	/**
	 * @param root the root to set
	 */
	public void setRoot(String root) {
		this.root = root;
	}
	/**
	 * @return the devices
	 */
	public TopoDevices getDevices() {
		return devices;
	}
	/**
	 * @param devices the devices to set
	 */
	public void setDevices(TopoDevices devices) {
		this.devices = devices;
	}
	/**
	 * @return the links
	 */
	public Links getLinks() {
		return links;
	}
	/**
	 * @param links the links to set
	 */
	public void setLinks(Links links) {
		this.links = links;
	}
}
