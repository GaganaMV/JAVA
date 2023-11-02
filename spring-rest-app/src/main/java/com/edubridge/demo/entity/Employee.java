package com.edubridge.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue
	private long eid;
	@Column(name = "ename")
    @NotEmpty(message = "employee name should not be empty")
	private String ename;
	@Column(name = "esalary")
	private int esalary;
	@Column(name="email")
	@NotEmpty
	@Email(message = "email is not valid")
	private String email;
	@Column(name = "mobileNo")
	private String emobileNo;

}
