package com.t7.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.t7.dao.TeacherDao;
import com.t7.model.Teacher;
import com.t7.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherDao teacherDao;
	
	
	@Override
	public void addTeacher(Teacher teacher) {
		teacherDao.addTeacher(teacher);
		
	}

	@Override
	public void removeTeacher(int id) {
		teacherDao.removeTeacher(id);
		
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		teacherDao.updateTeacher(teacher);
		
	}

	@Override
	public Teacher getTeacher(int id) {
		return teacherDao.getTeacher(id);
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return teacherDao.getAllTeachers();
	}

}
