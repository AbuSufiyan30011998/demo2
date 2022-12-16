package com.resourceRequirement.resourceRequirement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceRequirement.resourceRequirement.dtos.QualificationSpecializatioResponse;
import com.resourceRequirement.resourceRequirement.model.QualificationSpecialization;
import com.resourceRequirement.resourceRequirement.repository.QualificationSpecializationRepository;

@Service
public class QualificationSpecializationService {

	@Autowired
	private QualificationSpecializationRepository qualificationSpecializationRepository;

	public List<QualificationSpecializatioResponse> getSpecializations(long degreeId){
	
		return this.qualificationSpecializationRepository.getAllSpecializations(degreeId);
	}
}
