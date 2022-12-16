package com.resourceRequirement.resourceRequirement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceRequirement.resourceRequirement.dtos.QualificationDegreeResponse;
import com.resourceRequirement.resourceRequirement.model.QualificationDegree;
import com.resourceRequirement.resourceRequirement.repository.QualificationDegreeRepository;

@Service
public class QualificationDegreeService {

	@Autowired
	private QualificationDegreeRepository qualificationDegreeRepository;

	public List<QualificationDegreeResponse> getAllDegree(long qualificationId) {
		return this.qualificationDegreeRepository.getAllDegrees(qualificationId);
	}
}
