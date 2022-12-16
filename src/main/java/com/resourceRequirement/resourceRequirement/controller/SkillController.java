package com.resourceRequirement.resourceRequirement.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.resourceRequirement.resourceRequirement.dtos.SkillResponse;
import com.resourceRequirement.resourceRequirement.model.Skill;
import com.resourceRequirement.resourceRequirement.service.SkillsService;

@RestController
@CrossOrigin("*")
public class SkillController {

	@Autowired
	private SkillsService skillsService;

	@GetMapping("/viewSkills/{technologies}")
	public ResponseEntity<List<SkillResponse>> viewAllSkills(@PathVariable("technologies") String technologies) {
		String[] technologyList= technologies.split(" ");
		List<Long>allTechnologId= new ArrayList<Long>();
		
		for (String tech : technologyList) {
			allTechnologId.add(Long.valueOf(tech));
		}
		List<SkillResponse> skills = this.skillsService.getAllSkills(allTechnologId);
		return new ResponseEntity<List<SkillResponse>>(skills, HttpStatus.OK);
	}
}
