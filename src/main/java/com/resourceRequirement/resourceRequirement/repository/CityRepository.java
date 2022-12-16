package com.resourceRequirement.resourceRequirement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.resourceRequirement.resourceRequirement.dtos.CityResponse;
import com.resourceRequirement.resourceRequirement.dtos.StateResponse;
import com.resourceRequirement.resourceRequirement.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

	@Query("SELECT new com.resourceRequirement.resourceRequirement.dtos.CityResponse(e.cityId,e.cityName) FROM City e JOIN e.state d WHERE d.stateId=:stateId")
    List<CityResponse> getAllCities(@Param("stateId") long stateId);


}
