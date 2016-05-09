package org.jflowlight.onos.model.topology;

import com.google.gson.annotations.Expose;
/**
 * @author Alessandro Di Stefano
 */
public class Topology {
	@Expose
	private Long time;
	@Expose
	private Long devices;
	@Expose
	private Long links;
	@Expose
	private Long clusters;
	
	private Clusters Graph;
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
	/**
	 * @return the devices
	 */
	public Long getDevices() {
		return devices;
	}
	/**
	 * @param devices the devices to set
	 */
	public void setDevices(Long devices) {
		this.devices = devices;
	}
	/**
	 * @return the links
	 */
	public Long getLinks() {
		return links;
	}
	/**
	 * @param links the links to set
	 */
	public void setLinks(Long links) {
		this.links = links;
	}
	/**
	 * @return the clusters
	 */
	public Long getClusters() {
		return clusters;
	}
	/**
	 * @param clusters the clusters to set
	 */
	public void setClusters(Long clusters) {
		this.clusters = clusters;
	}
	/**
	 * @return the graph
	 */
	public Clusters getGraph() {
		return Graph;
	}
	/**
	 * @param graph the graph to set
	 */
	public void setGraph(Clusters graph) {
		Graph = graph;
	}
}
