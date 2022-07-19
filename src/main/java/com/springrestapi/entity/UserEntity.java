package com.springrestapi.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@NotBlank
	private String userName;
	@NotEmpty
	@NotBlank
	private String firstName;
	@NotEmpty
	@NotBlank
	private String lastName;
	@NotEmpty
	@NotBlank
	private String email;
	@NotEmpty
	@NotBlank
	private String password;
	private Date createdDate;
	private Date updatedDate;
	
	public UserEntity(Long id, String userName, String firstName, String lastName, String email, String password,
			Date createdDate, Date updatedDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	
}
