package com.example.SpringBootRest.Service;
import java.util.List;

import com.example.SpringBootRest.Entities.Course;
public interface Services {

	public List<Course> getCourses();
	
	public Course getCourses(long CourseId);
	
	public Course addCourses(Course course);
}
