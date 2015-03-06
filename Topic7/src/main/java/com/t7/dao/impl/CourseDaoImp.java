package com.t7.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.t7.dao.CourseDao;
import com.t7.model.Course;
import com.t7.model.Teacher;

@Repository
public class CourseDaoImp implements CourseDao {
	
	@Autowired
	private SessionFactory session;

	@Override
	public void addCourse(Course course) {
		session.getCurrentSession().save(course);
		
	}

	@Override
	public void removeCourse(int id) {
		session.getCurrentSession().delete(getCourse(id));
		
	}

	@Override
	public void updateCourse(Course course) {
		session.getCurrentSession().update(course);
	}

	@Override
	public Course getCourse(int id) {
		return (Course) session.getCurrentSession().get(Course.class, id);
	}

	@Override
	public List<Course> getAllCourses() {
		return session.getCurrentSession().createQuery("from teachers").list();
	}

}
