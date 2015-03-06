package com.t7.service;

import java.util.List;
import com.t7.model.Student;

public interface StudentService {
	public void addStudent(Student student);
	public void removeStudent(int id);
	public void updateStudent(Student student);
	public Student getStudent(int id);
	public List<Student> getAllStudents();
}
