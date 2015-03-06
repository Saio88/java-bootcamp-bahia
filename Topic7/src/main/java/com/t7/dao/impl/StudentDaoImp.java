package com.t7.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.t7.dao.StudentDao;
import com.t7.model.Student;


@Repository
public class StudentDaoImp implements StudentDao {
	
	@Autowired
	private SessionFactory session;
	
	
	@Override
	public void addStudent(Student student) {
		session.getCurrentSession().save(student);
		
	}

	@Override
	public void removeStudent(int id) {
		session.getCurrentSession().delete(getStudent(id));
	}

	@Override
	public void updateStudent(Student student) {
		session.getCurrentSession().update(student);
	}

	@Override
	public Student getStudent(int id) {
		return (Student) session.getCurrentSession().get(Student.class, id);
}

	@Override
	public List<Student> getAllStudents() {
		return session.getCurrentSession().createQuery("from students").list();
	}

}
