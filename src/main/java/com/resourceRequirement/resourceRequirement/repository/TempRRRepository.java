package com.resourceRequirement.resourceRequirement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resourceRequirement.resourceRequirement.model.TempResourceRequirement;

@Repository
public interface TempRRRepository extends JpaRepository<TempResourceRequirement, Long> {

}
