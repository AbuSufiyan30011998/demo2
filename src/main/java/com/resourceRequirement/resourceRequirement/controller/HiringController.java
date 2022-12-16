package com.resourceRequirement.resourceRequirement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resourceRequirement.resourceRequirement.model.HiringType;
import com.resourceRequirement.resourceRequirement.service.HiringService;

@RestController
@CrossOrigin("*")
public class HiringController {
	@Autowired
	HiringService hiringService;

	@GetMapping("/hiringType")
	public ResponseEntity<List<HiringType>> getAllHiringType() {
		List<HiringType> allCountries = hiringService.getAllHiringType();
		return new ResponseEntity<List<HiringType>>(allCountries, HttpStatus.OK);
	}
}
