package com.resourceRequirement.resourceRequirement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resourceRequirement.resourceRequirement.model.Country;
import com.resourceRequirement.resourceRequirement.service.CountryService;

@RestController
@CrossOrigin("*")
public class CountryController {

	@Autowired
	CountryService countryService;

	@GetMapping("/country")
	public ResponseEntity<List<Country>> getAllCountries() {
		List<Country> allCountries = countryService.getAllCountries();
		return new ResponseEntity<List<Country>>(allCountries, HttpStatus.OK);
	}

}
