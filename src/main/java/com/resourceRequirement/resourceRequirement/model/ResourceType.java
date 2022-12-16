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
public class ResourceType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long resourceTypeId;
	private String resourceType;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "technologyId")
	private List<Technology> technologies;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "resourceRequirementId")
	private List<ResourceRequirement> resourceRequirements;

	public ResourceType() {
		super();
	}

	public ResourceType(long resourceTypeId, String resourceType) {
		super();
		this.resourceTypeId = resourceTypeId;
		this.resourceType = resourceType;
	}

	public long getResourceTypeId() {
		return resourceTypeId;
	}

	public void setResourceTypeId(long resourceTypeId) {
		this.resourceTypeId = resourceTypeId;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	@Override
	public String toString() {
		return "ResourceType [resourceTypeId=" + resourceTypeId + ", resourceType=" + resourceType + "]";
	}

}
