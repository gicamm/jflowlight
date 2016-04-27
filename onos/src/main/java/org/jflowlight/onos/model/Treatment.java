package org.jflowlight.onos.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Treatment {
	
	@SerializedName("instructions")
	@Expose
	private List<Instruction> instructions = new ArrayList<Instruction>();

	
	/* TODO deferred array */
	
	public List<Instruction> getInstructions() {
		return instructions;
	}

	public void setInstructions(List<Instruction> instructions) {
		this.instructions = instructions;
	}
}
