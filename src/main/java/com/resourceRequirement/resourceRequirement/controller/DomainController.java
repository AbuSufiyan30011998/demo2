package com.resourceRequirement.resourceRequirement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.resourceRequirement.resourceRequirement.model.DomainKnowledge;
import com.resourceRequirement.resourceRequirement.service.DomainService;

@RestController
@CrossOrigin("*")
public class DomainController {

	@Autowired
	private DomainService domainService;

	@GetMapping("/viewDomains")
	public ResponseEntity<List<DomainKnowledge>> getAllDomains() {
		List<DomainKnowledge> domains = this.domainService.getAllDomains();
		return new ResponseEntity<List<DomainKnowledge>>(domains, HttpStatus.OK);
	}

}
