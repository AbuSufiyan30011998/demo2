package com.resourceRequirement.resourceRequirement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceRequirement.resourceRequirement.model.Country;
import com.resourceRequirement.resourceRequirement.repository.CountryRepository;

@Service
public class CountryService {
	@Autowired
	CountryRepository countryRepository;

	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}

}
