package com.resourceRequirement.resourceRequirement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.resourceRequirement.resourceRequirement.dtos.QualificationSpecializatioResponse;
import com.resourceRequirement.resourceRequirement.service.QualificationSpecializationService;

@RestController
@CrossOrigin("*")
public class QualificationSpecializationController {

	@Autowired
	private QualificationSpecializationService qualificationSpecializationService;

	@GetMapping("/viewQualificationSpecialization/{degreeId}")
	public ResponseEntity<List<QualificationSpecializatioResponse>> viewAllSpecialization(
			@PathVariable("degreeId") long degreeId) {
		 System.out.println("degreeId"+degreeId);
		List<QualificationSpecializatioResponse> qualificationSpecialization = this.qualificationSpecializationService.getSpecializations(degreeId);
		return new ResponseEntity<List<QualificationSpecializatioResponse>>(qualificationSpecialization, HttpStatus.OK);
	}
}
