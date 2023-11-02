package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Employee;
import com.book.services.EmployeeServices;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeServices employeeServices;
	
	@PostMapping("/insert")
	public Employee insertEmployee(@RequestBody Employee employee) {
		return employeeServices.insertEmployee(employee);
	}
	
	@GetMapping("/getAll")
	public List<Employee> listAll(){
		return employeeServices.listAll();
	}
	

}
