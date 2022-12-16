package com.resourceRequirement.resourceRequirement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resourceRequirement.resourceRequirement.model.Qualification;

@Repository
public interface QualificationRepository extends JpaRepository<Qualification, Long>{
	//public Qualification findByQualification(String qualification);
}
