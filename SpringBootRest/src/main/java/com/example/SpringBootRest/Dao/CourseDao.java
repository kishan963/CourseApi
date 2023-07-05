package com.example.SpringBootRest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootRest.Entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
