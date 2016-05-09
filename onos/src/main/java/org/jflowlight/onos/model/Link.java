package org.jflowlight.onos.model;

import com.google.gson.annotations.Expose;
/**
 * @author Alessandro Di Stefano
 */
public class Link {
	@Expose
	private Connection src;
	@Expose
	private Connection dst;
	@Expose
	private String type;
	@Expose 
	private String state;
	/**
	 * @return the src
	 */
	public Connection getSrc() {
		return src;
	}
	/**
	 * @param src the src to set
	 */
	public void setSrc(Connection src) {
		this.src = src;
	}
	/**
	 * @return the dst
	 */
	public Connection getDst() {
		return dst;
	}
	/**
	 * @param dst the dst to set
	 */
	public void setDst(Connection dst) {
		this.dst = dst;
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
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
}
