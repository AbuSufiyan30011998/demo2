package com.resourceRequirement.resourceRequirement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.resourceRequirement.resourceRequirement.dtos.CityResponse;
import com.resourceRequirement.resourceRequirement.model.City;
import com.resourceRequirement.resourceRequirement.service.CityService;

@RestController
@CrossOrigin("*")
public class CityController {

	@Autowired
	CityService cityService;

	@GetMapping("/country/state/city/{stateId}")
	public ResponseEntity<List<CityResponse>> getAllCitiesByStateId(@PathVariable long stateId) {
		List<CityResponse> citiesByState = cityService.getAllCities(stateId);
		return new ResponseEntity<List<CityResponse>>( citiesByState,HttpStatus.OK);
	}


}
