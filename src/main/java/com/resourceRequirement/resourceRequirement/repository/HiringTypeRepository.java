package com.resourceRequirement.resourceRequirement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resourceRequirement.resourceRequirement.model.HiringType;

@Repository
public interface HiringTypeRepository extends JpaRepository<HiringType, Long> {

}
