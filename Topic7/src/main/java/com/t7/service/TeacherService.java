package com.t7.service;

import java.util.List;
import com.t7.model.Teacher;;

public interface TeacherService {
	public void addTeacher(Teacher teacher);
	public void removeTeacher(int id);
	public void updateTeacher(Teacher teacher);
	public Teacher getTeacher(int id);
	public List<Teacher> getAllTeachers();
}

