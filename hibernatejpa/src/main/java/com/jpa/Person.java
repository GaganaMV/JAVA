package com.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Person{
	@Id
	private int id;
	@Column(name = "pname",nullable = false)
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "email",unique = true)
	private String email;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}
	

}
	
	
	
	


