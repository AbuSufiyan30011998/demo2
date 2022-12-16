package com.resourceRequirement.resourceRequirement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.resourceRequirement.resourceRequirement.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

	@Query("SELECT c FROM Country c")
	List<Country> getAllCountries();

	@Query("SELECT c FROM Country c WHERE c.countryName=:countryName")
	Optional<Country> findByCountryName(@Param("countryName") String countryName);

}
