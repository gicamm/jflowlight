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
}
