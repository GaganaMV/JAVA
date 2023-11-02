package com.book.services;

import java.util.List;

import com.book.entity.Employee;

public interface EmployeeServices {

	Employee insertEmployee(Employee employee);

	List<Employee> listAll();

}
