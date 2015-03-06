package com.t7.dao;

import java.util.List;
import com.t7.model.*;

public interface StudentDao {
	public void addStudent(Student student);
	public void removeStudent(int id);
	public void updateStudent(Student student);
	public Student getStudent(int id);
	public List<Student> getAllStudents();
}
