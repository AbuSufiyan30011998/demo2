package com.resourceRequirement.resourceRequirement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceRequirement.resourceRequirement.model.HiringType;
import com.resourceRequirement.resourceRequirement.repository.HiringTypeRepository;

@Service
public class HiringService {
	@Autowired
	HiringTypeRepository hiringTypeRepository;
	
   public List<HiringType>getAllHiringType()
   {
	   return hiringTypeRepository.findAll();
   }

}
