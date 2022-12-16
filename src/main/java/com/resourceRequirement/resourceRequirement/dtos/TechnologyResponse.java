package com.resourceRequirement.resourceRequirement.dtos;

public class TechnologyResponse {
	private long technologyId;
	private String technology;
	public TechnologyResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TechnologyResponse(long technologyId, String technology) {
		super();
		this.technologyId = technologyId;
		this.technology = technology;
	}
	public long getTechnologyId() {
		return technologyId;
	}
	public void setTechnologyId(long technologyId) {
		this.technologyId = technologyId;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}

	

}
