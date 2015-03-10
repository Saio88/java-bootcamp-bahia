package com.t7.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.t7.dao.TeacherDao;
import com.t7.model.Teacher;

@Repository
public class TeacherDaoImp implements TeacherDao{

	@Autowired
	private SessionFactory session;
	
	@Override
	public void addTeacher(Teacher teacher) {
		session.getCurrentSession().save(teacher);
		
	}

	@Override
	public void removeTeacher(int id) {
		session.getCurrentSession().delete(getTeacher(id));
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		session.getCurrentSession().update(teacher);
	}

	@Override
	public Teacher getTeacher(int id) {
		return (Teacher) session.getCurrentSession().get(Teacher.class, id);
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return session.getCurrentSession().createQuery("from teachers").list();
	}

}
