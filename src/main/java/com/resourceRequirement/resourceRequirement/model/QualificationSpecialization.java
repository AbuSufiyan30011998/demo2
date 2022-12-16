package com.resourceRequirement.resourceRequirement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class QualificationSpecialization {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long specializationId;
	private String specializationName;

	@ManyToOne
	@JoinColumn(name = "degreeId")
	private QualificationDegree degree;

	public QualificationSpecialization() {
		super();
	}

	public QualificationSpecialization(long specializationId, String specializationName, QualificationDegree degree) {
		super();
		this.specializationId = specializationId;
		this.specializationName = specializationName;
		this.degree = degree;
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

	public QualificationDegree getDegree() {
		return degree;
	}

	public void setDegree(QualificationDegree degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "QualificationSpecialization [specializationId=" + specializationId + ", specializationName="
				+ specializationName + ", degree=" + degree + "]";
	}

}
