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
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long countryId;
	private String countryName;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "stateId")
	private List<State> states;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "resourceRequirementId")
	private List<ResourceRequirement> resourceRequirements;

	public Country() {
		super();
	}

	public Country(long countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	public long getCountryId() {
		return countryId;
	}

	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + "]";
	}

}
