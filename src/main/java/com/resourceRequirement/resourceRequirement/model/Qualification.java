package com.resourceRequirement.resourceRequirement.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Qualification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long qualificationId;
	private String qualification;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "degreeId")
	private List<QualificationDegree> degrees;

	public Qualification() {
		super();
	}

	public Qualification(long qualificationId, String qualification) {
		super();
		this.qualificationId = qualificationId;
		this.qualification = qualification;
	}

	public long getQualificationId() {
		return qualificationId;
	}

	public void setQualificationId(long qualificationId) {
		this.qualificationId = qualificationId;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Qualification [qualificationId=" + qualificationId + ", qualification=" + qualification + "]";
	}

}
