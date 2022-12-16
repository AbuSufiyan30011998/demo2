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
public class Technology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long technologyId;
	private String technology;

	@ManyToOne
	@JoinColumn(name = "resourceTypeId")
	private ResourceType resourceType;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "skillId")
	private List<Skill> skills;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "resourceRequirementId")
	private List<ResourceRequirement> resourceRequirements;

	public Technology() {
		super();
	}

	public Technology(long technologyId, String technology, ResourceType resourceType) {
		super();
		this.technologyId = technologyId;
		this.technology = technology;
		this.resourceType = resourceType;
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

	public ResourceType getResourceType() {
		return resourceType;
	}

	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}

	@Override
	public String toString() {
		return "Technology [technologyId=" + technologyId + ", technology=" + technology + ", resourceType="
				+ resourceType + "]";
	}

}
