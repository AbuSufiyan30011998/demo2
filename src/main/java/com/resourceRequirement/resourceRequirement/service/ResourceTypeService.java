package com.resourceRequirement.resourceRequirement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceRequirement.resourceRequirement.model.ResourceType;
import com.resourceRequirement.resourceRequirement.repository.ResourceTypeRepository;

@Service
public class ResourceTypeService {
	@Autowired
	private ResourceTypeRepository qualificationRepository;

	public List<ResourceType> getAllResources() {
		return this.qualificationRepository.findAll();
	}

}
