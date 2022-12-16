package com.resourceRequirement.resourceRequirement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceRequirement.resourceRequirement.dtos.SkillResponse;
import com.resourceRequirement.resourceRequirement.model.Skill;
import com.resourceRequirement.resourceRequirement.repository.SkillRepository;
import com.resourceRequirement.resourceRequirement.repository.TechnologyRepository;

@Service
public class SkillsService {
	@Autowired
	private SkillRepository skillsRepository;

	public List<SkillResponse> getAllSkills(List<Long> allTechnologId) {
		List<SkillResponse>allSkills=new ArrayList<SkillResponse>(); 
		   for (Long techId : allTechnologId) {
			 allSkills.addAll(skillsRepository.getAllSkills(techId)) ;
		}
		return allSkills;
				
		//return this.skillsRepository.findByTechnology(this.technologyRepository.findByTechnology(technology));
	}

}
