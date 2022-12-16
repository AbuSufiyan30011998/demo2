package com.resourceRequirement.resourceRequirement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceRequirement.resourceRequirement.model.ResourceRequirement;
import com.resourceRequirement.resourceRequirement.repository.ResourceRequirementRepository;

@Service
public class ResourceRequirementService {

	@Autowired
	private ResourceRequirementRepository resourceRequirementRepository;
	
	public ResourceRequirement saveResourceRequirement(ResourceRequirement resourceRequirement) {
		return this.resourceRequirementRepository.save(resourceRequirement);
	}

	public ResourceRequirement getRR(long rr) {
		return this.resourceRequirementRepository.findById(rr).get();
	}
	
	
}
