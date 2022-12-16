package com.resourceRequirement.resourceRequirement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.resourceRequirement.resourceRequirement.dtos.SkillResponse;
import com.resourceRequirement.resourceRequirement.model.Skill;


@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
	 
	@Query("SELECT new com.resourceRequirement.resourceRequirement.dtos.SkillResponse(e.skillId,e.skill) FROM Skill e JOIN e.technology d WHERE d.technologyId=:technologyId")
	public List<SkillResponse>getAllSkills(@Param("technologyId")long technologyId);

	
}
