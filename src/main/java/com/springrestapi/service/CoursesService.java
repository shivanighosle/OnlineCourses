package com.springrestapi.service;

import java.util.List;
import com.springrestapi.entity.CoursesEntity;

public interface CoursesService {

	public List<CoursesEntity> getAllCourses();
	
	public CoursesEntity addCourses(CoursesEntity courses);
	
}
