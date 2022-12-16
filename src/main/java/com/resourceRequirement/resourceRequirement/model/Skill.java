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
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long skillId;
	private String skill;

	@ManyToOne
	@JoinColumn(name = "TechnologyId")
	private Technology technology;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "resourceRequirementId")
	private List<ResourceRequirement> resourceRequirements;

	public Skill() {
		super();
	}

	public Skill(long skillId, String skill, Technology technology) {
		super();
		this.skillId = skillId;
		this.skill = skill;
		this.technology = technology;
	}

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Technology getTechnology() {
		return technology;
	}

	public void setTechnology(Technology technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skill=" + skill + ", technology=" + technology + "]";
	}

}
