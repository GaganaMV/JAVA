package com.fooddelivery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = { "username" }),
		@UniqueConstraint(columnNames = { "email" })

})
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotEmpty
	@Size(min = 3, message = "Name should contain atleast 3 characters")
	private String name;

	@NotEmpty
	@Email(message = "email is not valid!")
	private String email;

	@NotEmpty
	@Size(min = 3, message = "username should conatin atleast 3 character")
	@Pattern(regexp = "^[A-Za-z][A-Za-z0-9_]{7,29}$")
	private String username;

	@NotEmpty
	@Size(min = 8, message = "Password length must be 8 and contain uppercase,lowercase,digits")
	@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}")
	private String password;
}
