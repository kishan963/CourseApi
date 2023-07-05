package com.example.SpringBootRest.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootRest.Dao.CourseDao;
import com.example.SpringBootRest.Entities.Course;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;
@Service
public class CourseServiceImp implements Services {

	List<Course> list;
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImp() {
		list=new ArrayList<Course>();
		list.add(new Course(1,"Physics","Newton"));
		list.add(new Course(2,"Chemistry","Oxygen"));
		list.add(new Course(3,"Math","Pythogorus"));
	}


	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return this.courseDao.findAll();
	}


	@Override
	public Course getCourses(long CourseId) {
		
//		for(Course c : list)
//		{
//			if(c.getId()==CourseId)
//				return c;
//		}
//		return null;
		 java.util.Optional<Course> optionalCourse = courseDao.findById(CourseId);
	        return optionalCourse.orElse(null);
		
	}


	@Override
	public Course addCourses(Course course) {
		
//		list.add(course);
		courseDao.save(course);
		return course;
		
	}

}
