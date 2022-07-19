package com.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springrestapi.entity.CoursesEntity;
import com.springrestapi.entity.UserEntity;
import com.springrestapi.service.CoursesService;


@Controller
//Representation state transfer (json or xml)
public class CoursesController {
	
	@Autowired
	private CoursesService coursesService;
	
	@RequestMapping("/ViewHome")
	public String HomePage(UserEntity userEntity) {
		
		return "Home";
	}
	
	@PostMapping("/AddCourse")
	public CoursesEntity addCourse(CoursesEntity courses) {
		
		return coursesService.addCourses(courses);
	}
	
	@GetMapping("/getAllCourses")
	public List<CoursesEntity> getCourses() {
		
		return coursesService.getAllCourses();
	}
	
	@RequestMapping("/SignIn")
	public String SignInPage() {
		
		return "SignIn";
	}
	
	@PostMapping("/registration")
	public String Registration(UserEntity userEntity) {
		
		
		return "SignIn";
	}
	
	@RequestMapping("/login")
	public String Login() {
		
		return "Home";
	}
	
}
