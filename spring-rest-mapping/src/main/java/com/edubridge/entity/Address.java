package com.edubridge.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue
	private long id;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name="country")
	private String country;
}
