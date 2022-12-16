package com.resourceRequirement.resourceRequirement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resourceRequirement.resourceRequirement.model.DomainKnowledge;


@Repository
public interface DomainRepository extends JpaRepository<DomainKnowledge, Long> {

}
