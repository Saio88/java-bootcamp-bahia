package com.t7.service;

import java.util.List;
import com.t7.model.Course;

public interface CourseService {
	public void addCourse(Course course);
	public void removeCourse(int id);
	public void updateCourse(Course course);
	public Course getCourse(int id);
	public List<Course> getAllCourses();
}