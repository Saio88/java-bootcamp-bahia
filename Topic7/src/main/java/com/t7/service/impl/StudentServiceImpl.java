package com.t7.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.t7.dao.StudentDao;
import com.t7.model.*;
import com.t7.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Transactional
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	@Transactional
	public void removeStudent(int id) {
		studentDao.removeStudent(id);
	}

	@Transactional
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}

	@Transactional
	public Student getStudent(int id) {
		return studentDao.getStudent(id);
	}

	@Transactional
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

}
