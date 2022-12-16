package com.resourceRequirement.resourceRequirement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceRequirement.resourceRequirement.model.ResourceRequirement;
import com.resourceRequirement.resourceRequirement.model.TempResourceRequirement;
import com.resourceRequirement.resourceRequirement.repository.ResourceRequirementRepository;
import com.resourceRequirement.resourceRequirement.repository.TempRRRepository;

@Service
public class TempResourceRequirementService {

	@Autowired
	private TempRRRepository tempresourceRequirementRepository;

	public TempResourceRequirement saveResourceRequirement(TempResourceRequirement resourceRequirement) {
		resourceRequirement.setDeleteStatus(false);
		return this.tempresourceRequirementRepository.save(resourceRequirement);
	}

	public TempResourceRequirement getRR(long rr) {
		return this.tempresourceRequirementRepository.findById(rr).get();
	}
}
