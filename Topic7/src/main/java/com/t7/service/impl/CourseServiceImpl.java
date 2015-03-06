package com.t7.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.t7.dao.CourseDao;
import com.t7.model.Course;
import com.t7.service.CourseService;

public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public void addCourse(Course course) {
		courseDao.addCourse(course);
		
	}

	@Override
	public void removeCourse(int id) {
		courseDao.removeCourse(id);
	}

	@Override
	public void updateCourse(Course course) {
		courseDao.updateCourse(course);		
	}

	@Override
	public Course getCourse(int id) {
		return courseDao.getCourse(id);
	}

	@Override
	public List<Course> getAllCourses() {
		return courseDao.getAllCourses();
	}

}
