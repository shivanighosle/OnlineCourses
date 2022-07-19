package com.springrestapi.implementation;

import com.springrestapi.service.CoursesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrestapi.entity.CoursesEntity;
import com.springrestapi.repository.CoursesRepository;

@Service
public class CoursesServiceImpl implements CoursesService{

	@Autowired
	private CoursesRepository coursesRepository;
	
	@Override
	public List<CoursesEntity> getAllCourses() {
		return coursesRepository.findAll();
	}
	
	@Override
	public CoursesEntity addCourses(CoursesEntity courses) {
		return coursesRepository.save(courses);
	}
}
