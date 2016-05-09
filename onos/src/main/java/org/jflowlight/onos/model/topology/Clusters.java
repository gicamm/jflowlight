package org.jflowlight.onos.model.topology;

import java.util.ArrayList;
import java.util.List;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Alessandro Di Stefano
 */
public class Clusters {
	@SerializedName("clusters")
    @Expose
    private List<Cluster> clusters = new ArrayList<>();

	/**
	 * @return the clusters
	 */
	public List<Cluster> getClusters() {
		return clusters;
	}

	/**
	 * @param clusters the clusters to set
	 */
	public void setClusters(List<Cluster> clusters) {
		this.clusters = clusters;
	}
}
