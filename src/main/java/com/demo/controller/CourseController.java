package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Course;
import com.demo.service.CourseService;
import com.demo.service.StudentService;

@RestController

@CrossOrigin("http://localhost:8080")
public class CourseController {

	@Autowired	
	private StudentService studentService;
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> retrieveAllCourses()
	{
		return courseService.getAll();
	}
	
}
