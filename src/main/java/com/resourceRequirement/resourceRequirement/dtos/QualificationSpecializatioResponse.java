package com.resourceRequirement.resourceRequirement.dtos;

public class QualificationSpecializatioResponse {
	private long specializationId;
	private String specializationName;
	public QualificationSpecializatioResponse(long specializationId, String specializationName) {
		super();
		this.specializationId = specializationId;
		this.specializationName = specializationName;
	}
	public QualificationSpecializatioResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getSpecializationId() {
		return specializationId;
	}
	public void setSpecializationId(long specializationId) {
		this.specializationId = specializationId;
	}
	public String getSpecializationName() {
		return specializationName;
	}
	public void setSpecializationName(String specializationName) {
		this.specializationName = specializationName;
	}
	

}
