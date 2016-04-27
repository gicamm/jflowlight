package org.jflowlight.onos.model;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * @author Alessandro Di Stefano
 */
public class Statistics {
	@Expose
	@SerializedName("loads")
	private ArrayList<Statistic> statistics;

	/**
	 * @return the statistics
	 */
	public ArrayList<Statistic> getStatistics() {
		return statistics;
	}

	/**
	 * @param statistics the statistics to set
	 */
	public void setStatistics(ArrayList<Statistic> statistics) {
		this.statistics = statistics;
	}
}
