package com.topic8.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="students_courses")
public class StudentCourse {
	@Id
	private String stc_id;
	private String stc_student;
	private String stc_course;
	private String stc_pnote1;
	private String stc_pnote2;
	private String stc_pnote3;
	private String stc_fnote;
	private String stc_year;
	
	public StudentCourse(){}
	
	public StudentCourse(String stc_id, String stc_student, String stc_course,
			String stc_pnote1, String stc_pnote2, String stc_pnote3,
			String stc_fnote, String stc_year) {
		super();
		this.stc_id = stc_id;
		this.stc_student = stc_student;
		this.stc_course = stc_course;
		this.stc_pnote1 = stc_pnote1;
		this.stc_pnote2 = stc_pnote2;
		this.stc_pnote3 = stc_pnote3;
		this.stc_fnote = stc_fnote;
		this.stc_year = stc_year;
	}

	public String getStc_id() {
		return stc_id;
	}

	public void setStc_id(String stc_id) {
		this.stc_id = stc_id;
	}

	public String getStc_student() {
		return stc_student;
	}

	public void setStc_student(String stc_student) {
		this.stc_student = stc_student;
	}

	public String getStc_course() {
		return stc_course;
	}

	public void setStc_course(String stc_course) {
		this.stc_course = stc_course;
	}

	public String getStc_pnote1() {
		return stc_pnote1;
	}

	public void setStc_pnote1(String stc_pnote1) {
		this.stc_pnote1 = stc_pnote1;
	}

	public String getStc_pnote2() {
		return stc_pnote2;
	}

	public void setStc_pnote2(String stc_pnote2) {
		this.stc_pnote2 = stc_pnote2;
	}

	public String getStc_pnote3() {
		return stc_pnote3;
	}

	public void setStc_pnote3(String stc_pnote3) {
		this.stc_pnote3 = stc_pnote3;
	}

	public String getStc_fnote() {
		return stc_fnote;
	}

	public void setStc_fnote(String stc_fnote) {
		this.stc_fnote = stc_fnote;
	}

	public String getStc_year() {
		return stc_year;
	}

	public void setStc_year(String stc_year) {
		this.stc_year = stc_year;
	}

	
}
