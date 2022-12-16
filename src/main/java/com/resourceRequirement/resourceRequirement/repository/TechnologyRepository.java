package com.resourceRequirement.resourceRequirement.repository;

import java.util.Collection;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.resourceRequirement.resourceRequirement.dtos.SkillResponse;
import com.resourceRequirement.resourceRequirement.dtos.TechnologyResponse;
import com.resourceRequirement.resourceRequirement.model.Technology;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Long> {
	@Query("SELECT new com.resourceRequirement.resourceRequirement.dtos.TechnologyResponse(e.technologyId,e.technology) FROM Technology e JOIN e.resourceType d WHERE d.resourceTypeId=:resourceTypeId")
    List<TechnologyResponse> getAlltechnologies(@Param("resourceTypeId")long resourceTypeId);

	
}
