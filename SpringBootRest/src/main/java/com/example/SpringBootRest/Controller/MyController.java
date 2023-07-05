package com.example.SpringBootRest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootRest.Entities.Course;
import com.example.SpringBootRest.Service.Services;

@RestController
public class MyController {
    @Autowired
	private Services courseService;
	
	@GetMapping("/home")
	public String home() {
		return "My home"; 
	}
	
	@GetMapping("/Courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	 
	@GetMapping("/Courses/{CourseId}")
	public Course getCourses(@PathVariable String CourseId) {
		return this.courseService.getCourses(Long.parseLong(CourseId));
	}
	
	@PostMapping("/Courses")
	public Course addCourses(@RequestBody Course course) {
		return this.courseService.addCourses(course);
	}
}
