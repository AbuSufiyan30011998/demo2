package com.resourceRequirement.resourceRequirement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.resourceRequirement.resourceRequirement.dtos.QualificationDegreeResponse;
import com.resourceRequirement.resourceRequirement.model.QualificationDegree;

@Repository
public interface QualificationDegreeRepository extends JpaRepository<QualificationDegree, Long> {
	
	@Query("SELECT new com.resourceRequirement.resourceRequirement.dtos.QualificationDegreeResponse(e.degreeId,e.degreeName) FROM  QualificationDegree e JOIN e.qualification d WHERE d.qualificationId =:qualificationId")
    List<QualificationDegreeResponse> getAllDegrees(@Param("qualificationId")long qualificationId);
}
