package com.edubridge.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.edubridge.demo.entity.Employee;

@RepositoryRestResource(path = "employee details",collectionResourceRel = "employee")
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
