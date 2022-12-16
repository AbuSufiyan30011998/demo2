package com.resourceRequirement.resourceRequirement.dtos;

public class QualificationDegreeResponse {
	private long degreeId;
	private String degreeName;
	public QualificationDegreeResponse(long degreeId, String degreeName) {
		super();
		this.degreeId = degreeId;
		this.degreeName = degreeName;
	}
	public QualificationDegreeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getDegreeId() {
		return degreeId;
	}
	public void setDegreeId(long degreeId) {
		this.degreeId = degreeId;
	}
	public String getDegreeName() {
		return degreeName;
	}
	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}
	
}
