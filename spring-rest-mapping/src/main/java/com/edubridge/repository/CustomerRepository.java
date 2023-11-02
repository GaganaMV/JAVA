package com.edubridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.edubridge.entity.Customer;

@RepositoryRestResource(path = "customer",collectionResourceRel = "customer")
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
