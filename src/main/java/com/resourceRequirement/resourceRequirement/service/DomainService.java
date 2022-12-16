package com.resourceRequirement.resourceRequirement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceRequirement.resourceRequirement.model.DomainKnowledge;
import com.resourceRequirement.resourceRequirement.repository.DomainRepository;

@Service
public class DomainService {
	@Autowired
	private DomainRepository domainRepository;

	public List<DomainKnowledge> getAllDomains() {
		return this.domainRepository.findAll();
	}
}
