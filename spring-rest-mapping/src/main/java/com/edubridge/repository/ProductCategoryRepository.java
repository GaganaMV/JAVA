package com.edubridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.edubridge.entity.ProductCategory;

@RepositoryRestResource(path = "productcategory",collectionResourceRel = "productcategory")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
