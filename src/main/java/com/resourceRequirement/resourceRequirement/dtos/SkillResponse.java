package com.resourceRequirement.resourceRequirement.dtos;

public class SkillResponse {
	
	private long skillId;
	private String skill;
	
	public SkillResponse(long skillId, String skill) {
		super();
		this.skillId = skillId;
		this.skill = skill;
	}

	public SkillResponse() {
		super();
		// TODO Auto-generated constructor stub
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
	 
	
}
