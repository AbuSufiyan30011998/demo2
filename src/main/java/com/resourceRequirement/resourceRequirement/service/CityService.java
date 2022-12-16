package com.resourceRequirement.resourceRequirement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceRequirement.resourceRequirement.dtos.CityResponse;
import com.resourceRequirement.resourceRequirement.model.City;
import com.resourceRequirement.resourceRequirement.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepo;

	public List<CityResponse> getAllCities(long stateId) {
		return cityRepo.getAllCities(stateId);
	}

	
}
