package com.resourceRequirement.resourceRequirement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceRequirement.resourceRequirement.model.Employee;
import com.resourceRequirement.resourceRequirement.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee getEmployeeById(long id) {
		return this.employeeRepository.findById(id).get();
	}
}
