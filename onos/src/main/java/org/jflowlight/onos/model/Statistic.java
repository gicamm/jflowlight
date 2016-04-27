package org.jflowlight.onos.model;

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
