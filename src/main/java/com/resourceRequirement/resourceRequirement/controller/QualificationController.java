package com.resourceRequirement.resourceRequirement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resourceRequirement.resourceRequirement.model.Qualification;
import com.resourceRequirement.resourceRequirement.service.QualificationService;

@CrossOrigin("*")
@RestController
public class QualificationController {

	@Autowired
	QualificationService qualificationService;

	@GetMapping("/qualification")
	public ResponseEntity<List<Qualification>> getAllQualifications() {
		List<Qualification> allCountries = qualificationService.getAllQualifications();
		return new ResponseEntity<List<Qualification>>(allCountries, HttpStatus.OK);
	}

}
