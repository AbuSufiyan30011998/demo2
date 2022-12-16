package com.resourceRequirement.resourceRequirement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.resourceRequirement.resourceRequirement.model.ResourceType;
import com.resourceRequirement.resourceRequirement.service.ResourceTypeService;

@RestController
@CrossOrigin("*")
public class ResourceTypeController {

	@Autowired
	private ResourceTypeService resourceService;

	@GetMapping("/viewResource")
	public ResponseEntity<List<ResourceType>> viewResources() {
		List<ResourceType> resources = this.resourceService.getAllResources();
		return new ResponseEntity<List<ResourceType>>(resources, HttpStatus.OK);
	}
}
