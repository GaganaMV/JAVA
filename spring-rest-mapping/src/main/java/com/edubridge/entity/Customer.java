package com.edubridge.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue
	private long customerId;
	private String customerName;
	private String customerEmail;
	private long customerMobile;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_Id",referencedColumnName = "id")
	private Address customerAddress;

}
