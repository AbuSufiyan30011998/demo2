package com.resourceRequirement.resourceRequirement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceRequirement.resourceRequirement.dtos.TechnologyResponse;
import com.resourceRequirement.resourceRequirement.model.Technology;
import com.resourceRequirement.resourceRequirement.repository.ResourceTypeRepository;
import com.resourceRequirement.resourceRequirement.repository.TechnologyRepository;

@Service
public class TechnologyService {
	@Autowired
	private TechnologyRepository technologyRepository;

	public List<TechnologyResponse> getAllTechnoloigies(List<Long> resourceList) {
		List<TechnologyResponse>allResources=new ArrayList<TechnologyResponse>();
		for (Long resourceTypeId: resourceList) {
			allResources.addAll(technologyRepository.getAlltechnologies(resourceTypeId));
		}
		return allResources;
		
		
	}
}
