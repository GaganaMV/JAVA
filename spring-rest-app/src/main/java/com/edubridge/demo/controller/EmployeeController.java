package com.edubridge.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.demo.entity.Employee;
import com.edubridge.demo.repository.EmployeeRepo;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@PostMapping()
	public Employee saveEmployee(@Valid @RequestBody Employee employee ) {
		return employeeRepo.save(employee);
	}
	

}
