package org.jflowlight.onos.model;

import org.jflowlight.model.LinkModel;

import com.google.gson.annotations.Expose;
/**
 * @author Alessandro Di Stefano
 */
public class Statistic {
	
	@Expose
	private Long rate;
	@Expose
	private Long latest;
	@Expose
	private Boolean valid;
	@Expose
	private Long time;
	@Expose
	private String link;
	private LinkModel theLink;
	private String device;
	private Integer port;
	
	/**
	 * @return the port
	 */
	public Integer getPort() {
		return port;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(Integer port) {
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
	/**
	 * @return the theLink
	 */
	public LinkModel getTheLink() {
		return theLink;
	}
	/**
	 * @param theLink the theLink to set
	 */
	public void setTheLink(LinkModel theLink) {
		this.theLink = theLink;
	}
	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}
	/**
	 * @return the rate
	 */
	public Long getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(Long rate) {
		this.rate = rate;
	}
	/**
	 * @return the latest
	 */
	public Long getLatest() {
		return latest;
	}
	/**
	 * @param latest the latest to set
	 */
	public void setLatest(Long latest) {
		this.latest = latest;
	}
	/**
	 * @return the valid
	 */
	public Boolean getValid() {
		return valid;
	}
	/**
	 * @param valid the valid to set
	 */
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	/**
	 * @return the time
	 */
	public Long getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(Long time) {
		this.time = time;
	}
	
}
