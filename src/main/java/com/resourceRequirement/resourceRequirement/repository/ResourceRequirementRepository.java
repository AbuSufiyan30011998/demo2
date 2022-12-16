package com.resourceRequirement.resourceRequirement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resourceRequirement.resourceRequirement.model.ResourceRequirement;

@Repository
public interface ResourceRequirementRepository extends JpaRepository<ResourceRequirement, Long>{

}
