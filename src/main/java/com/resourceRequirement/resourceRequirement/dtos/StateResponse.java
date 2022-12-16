package com.resourceRequirement.resourceRequirement.dtos;

public class StateResponse {
	private long stateId;
	private String stateName;
	
	public StateResponse(long stateId, String stateName) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
	}
	
	public StateResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getStateId() {
		return stateId;
	}
	public void setStateId(long stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


}
