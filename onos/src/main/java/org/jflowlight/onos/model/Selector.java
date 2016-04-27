package org.jflowlight.onos.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Selector {
	@SerializedName("criteria")
	@Expose
	private List<Criterion> criteria = new ArrayList<Criterion>();

	/**
	 * @return the criteria
	 */
	public List<Criterion> getCriteria() {
		return criteria;
	}

	/**
	 * @param criteria the criteria to set
	 */
	public void setCriteria(List<Criterion> criteria) {
		this.criteria = criteria;
	}

}
