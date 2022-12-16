package com.resourceRequirement.resourceRequirement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.resourceRequirement.resourceRequirement.dtos.TechnologyResponse;
import com.resourceRequirement.resourceRequirement.service.TechnologyService;

@RestController
@CrossOrigin("*")
public class TechnologyController {

	@Autowired
	private TechnologyService technologyService;

	@GetMapping("/viewTechnology/{resources}")
	public ResponseEntity<List<TechnologyResponse>> viewTechnology(@PathVariable("resources") String resources) {
		String[] ch = resources.split(" ");
		List<Long> resourceList = new ArrayList<Long>();
		for (int i = 0; i < ch.length; i++) {
			resourceList.add(Long.valueOf(ch[i]));
		}
		List<TechnologyResponse> technologies = this.technologyService.getAllTechnoloigies(resourceList);
		return new ResponseEntity<List<TechnologyResponse>>(technologies, HttpStatus.OK);
	}
}
