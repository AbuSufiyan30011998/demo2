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
public class HiringType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long hiringTypeId;
	private String hiringType;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "resourceRequirementId")
	private List<ResourceRequirement> resourceRequirements;

	public HiringType() {
		super();
	}

	public HiringType(long hiringTypeId, String hiringType) {
		super();
		this.hiringTypeId = hiringTypeId;
		this.hiringType = hiringType;
	}

	public long getHiringTypeId() {
		return hiringTypeId;
	}

	public void setHiringTypeId(long hiringTypeId) {
		this.hiringTypeId = hiringTypeId;
	}

	public String getHiringType() {
		return hiringType;
	}

	public void setHiringType(String hiringType) {
		this.hiringType = hiringType;
	}

	@Override
	public String toString() {
		return "HiringType [hiringTypeId=" + hiringTypeId + ", hiringType=" + hiringType + "]";
	}

}
