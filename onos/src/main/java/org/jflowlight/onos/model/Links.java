package org.jflowlight.onos.model;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
/**
 * @author Alessandro Di Stefano
 */
public class Links {
	@Expose
	private ArrayList<Link> links;

	/**
	 * @return the links
	 */
	public ArrayList<Link> getLinks() {
		return links;
	}

	/**
	 * @param links the links to set
	 */
	public void setLinks(ArrayList<Link> links) {
		this.links = links;
	}
	
}
