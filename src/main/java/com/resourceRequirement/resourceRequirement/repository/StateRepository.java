package com.resourceRequirement.resourceRequirement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.resourceRequirement.resourceRequirement.dtos.StateResponse;
import com.resourceRequirement.resourceRequirement.model.Country;
import com.resourceRequirement.resourceRequirement.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {


	
	@Query("SELECT new com.resourceRequirement.resourceRequirement.dtos.StateResponse(e.stateId,e.stateName) FROM State e JOIN e.country d WHERE d.countryId =:countryId")
    List<StateResponse> getAllStates(@Param("countryId") long countryId);


}
