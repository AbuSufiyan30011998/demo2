package com.resourceRequirement.resourceRequirement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.resourceRequirement.resourceRequirement.model.Employee;
import com.resourceRequirement.resourceRequirement.service.EmployeeService;

@RestController
@CrossOrigin("*")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/getEmployee")
	public ResponseEntity<Employee> getStationList(@RequestParam("id") long employeeId) {
		Employee employee = this.employeeService.getEmployeeById(employeeId);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

}
