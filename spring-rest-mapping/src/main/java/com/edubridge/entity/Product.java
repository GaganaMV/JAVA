package com.edubridge.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_details")
public class Product {
	@Id
	@GeneratedValue
	private long productId;
	private String productName;
	private String productDescription;
	private int productPrice;
	
	

}
