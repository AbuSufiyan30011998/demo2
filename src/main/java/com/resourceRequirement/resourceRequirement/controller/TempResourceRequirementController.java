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
import com.resourceRequirement.resourceRequirement.model.TempResourceRequirement;
import com.resourceRequirement.resourceRequirement.service.ResourceRequirementService;
import com.resourceRequirement.resourceRequirement.service.TempResourceRequirementService;

@RestController
@CrossOrigin("*")
public class TempResourceRequirementController {

	@Autowired
	private  TempResourceRequirementService resourceRequirementService;

	@PostMapping("/saveTempResourceRequirement")
	public ResponseEntity<TempResourceRequirement> saveTempResourceRequirement(
			@RequestBody TempResourceRequirement resourceRequirement) {
		TempResourceRequirement savedResourceRequirement = this.resourceRequirementService
				.saveResourceRequirement(resourceRequirement);
		return new ResponseEntity<TempResourceRequirement>(savedResourceRequirement, HttpStatus.OK);
	}

	@GetMapping("/getTempRR")
	public ResponseEntity<TempResourceRequirement> gerRR(@RequestParam("id") long id) {
		TempResourceRequirement savedResourceRequirement = this.resourceRequirementService.getRR(id);
		return new ResponseEntity<TempResourceRequirement>(savedResourceRequirement, HttpStatus.OK);
	}
	
	
}
