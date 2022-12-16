package com.resourceRequirement.resourceRequirement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resourceRequirement.resourceRequirement.model.ResourceType;

@Repository
public interface ResourceTypeRepository extends JpaRepository<ResourceType, Long>{
	
	public ResourceType findByResourceType(String resourceType);
}
