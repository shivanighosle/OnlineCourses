package com.springrestapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class CoursesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long courseName;
	private long description;
	
	public CoursesEntity(long id, long courseName, long description) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.description = description;
	}
	
	
}
