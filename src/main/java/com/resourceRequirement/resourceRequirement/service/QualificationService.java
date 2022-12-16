package com.resourceRequirement.resourceRequirement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.resourceRequirement.resourceRequirement.model.Qualification;
import com.resourceRequirement.resourceRequirement.repository.QualificationRepository;

@Service
public class QualificationService {

	@Autowired
	private QualificationRepository qualificationRepository;

	public List<Qualification> getAllQualifications() {
		return this.qualificationRepository.findAll();
	}
}
