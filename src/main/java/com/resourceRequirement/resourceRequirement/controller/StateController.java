package com.resourceRequirement.resourceRequirement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.resourceRequirement.resourceRequirement.dtos.StateResponse;
import com.resourceRequirement.resourceRequirement.model.State;
import com.resourceRequirement.resourceRequirement.service.StateService;

@RestController
@CrossOrigin("*")
public class StateController {

	@Autowired
	StateService stateService;

	@GetMapping("/country/state/{countryId}")
	public ResponseEntity<List<StateResponse>> getAllStatesByCountryId(@PathVariable long countryId) {
		System.out.println("countryId"+countryId);
		List<StateResponse> statesByCountry = stateService. getStates(countryId);
		System.out.println("lisyt of states"+statesByCountry);
		return new ResponseEntity<List<StateResponse>>(statesByCountry, HttpStatus.OK);
	}

	

}
