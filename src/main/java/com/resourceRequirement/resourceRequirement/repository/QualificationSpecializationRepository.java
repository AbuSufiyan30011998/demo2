package com.resourceRequirement.resourceRequirement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.resourceRequirement.resourceRequirement.dtos.QualificationSpecializatioResponse;
import com.resourceRequirement.resourceRequirement.model.QualificationSpecialization;

@Repository
public interface QualificationSpecializationRepository extends JpaRepository<QualificationSpecialization, Long> {

	@Query("SELECT new com.resourceRequirement.resourceRequirement.dtos.QualificationSpecializatioResponse(e.specializationId,e.specializationName)FROM QualificationSpecialization e JOIN e.degree d WHERE d.degreeId =:degreeId")
    List<QualificationSpecializatioResponse>getAllSpecializations(@Param("degreeId")long degreeId);
}
