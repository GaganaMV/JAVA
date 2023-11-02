package com.book.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Employee;
import com.book.repository.Employeerepository;
import com.book.services.EmployeeServices;

@Service
public class EmployeeImpl implements EmployeeServices{
	@Autowired
	private Employeerepository employeerepository;

	@Override
	public Employee insertEmployee(Employee employee) {
		return employeerepository.save(employee);
	}

	@Override
	public List<Employee> listAll() {
		return employeerepository.findAll();
		
	}

}
