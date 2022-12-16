package com.resourceRequirement.resourceRequirement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceRequirement.resourceRequirement.dtos.StateResponse;
import com.resourceRequirement.resourceRequirement.model.State;
import com.resourceRequirement.resourceRequirement.repository.StateRepository;

@Service
public class StateService {
	@Autowired
	StateRepository sateRepository;

	public List<StateResponse> getStates(Long id) {
		return sateRepository.getAllStates(id);
	}

}
