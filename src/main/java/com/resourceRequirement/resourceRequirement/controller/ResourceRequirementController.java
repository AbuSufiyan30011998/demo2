package com.resourceRequirement.resourceRequirement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.resourceRequirement.resourceRequirement.model.ResourceRequirement;
import com.resourceRequirement.resourceRequirement.service.ResourceRequirementService;

@RestController
@CrossOrigin("*")
public class ResourceRequirementController {

	@Autowired
	private ResourceRequirementService resourceRequirementService;

	@PostMapping("/saveResourceRequirement")
	public ResponseEntity<ResourceRequirement> saveResourceRequirement(
			@RequestBody ResourceRequirement resourceRequirement) {
		ResourceRequirement savedResourceRequirement = this.resourceRequirementService
				.saveResourceRequirement(resourceRequirement);
		return new ResponseEntity<ResourceRequirement>(savedResourceRequirement, HttpStatus.OK);
	}

	@GetMapping("/getRR")
	public ResponseEntity<ResourceRequirement> gerRR(@RequestParam("id") long id) {
		ResourceRequirement savedResourceRequirement = this.resourceRequirementService.getRR(id);
		return new ResponseEntity<ResourceRequirement>(savedResourceRequirement, HttpStatus.OK);
	}
}
