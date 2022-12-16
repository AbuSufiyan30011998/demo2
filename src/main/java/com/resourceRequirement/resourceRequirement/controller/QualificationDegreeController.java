package com.resourceRequirement.resourceRequirement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.resourceRequirement.resourceRequirement.dtos.QualificationDegreeResponse;
import com.resourceRequirement.resourceRequirement.model.QualificationDegree;
import com.resourceRequirement.resourceRequirement.service.QualificationDegreeService;

@RestController
@CrossOrigin("*")
public class QualificationDegreeController {

	@Autowired
	private QualificationDegreeService qualificationDegreeService;

	@GetMapping("/viewQualificationDegree/{qualificationId}")
	public ResponseEntity<List<QualificationDegreeResponse>> viewAllQualificationDegree(
			@PathVariable("qualificationId") long qualificationId) {
		List<QualificationDegreeResponse> qualificationDegrees = this.qualificationDegreeService.getAllDegree(qualificationId);
		return new ResponseEntity<List<QualificationDegreeResponse>>(qualificationDegrees, HttpStatus.OK);
	}
}
