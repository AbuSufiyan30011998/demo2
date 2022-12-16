package com.resourceRequirement.resourceRequirement.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class QualificationDegree {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long degreeId;
	private String degreeName;

	@ManyToOne
	@JoinColumn(name = "qualificationId")
	private Qualification qualification;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "specializationId")
	private List<QualificationSpecialization> specializations;

	public QualificationDegree() {
		super();
	}

	public QualificationDegree(long degreeId, String degreeName, Qualification qualification) {
		super();
		this.degreeId = degreeId;
		this.degreeName = degreeName;
		this.qualification = qualification;
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

	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "QualificationDegree [degreeId=" + degreeId + ", degreeName=" + degreeName + ", qualification="
				+ qualification + "]";
	}

}
