package com.topic8.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="courses")
public class Course {
	@Id
	private String co_id;
	private String co_name;
	private String co_teacher;
	private String co_weekhs;
	private String co_time;
	private String co_status;
	
	public Course(){}
	
	public Course(String co_id, String co_name, String co_teacher, String co_weekhs, String co_time, String co_status) {
		super();
		this.co_id = co_id;
		this.co_name = co_name;
		this.co_teacher = co_teacher;
		this.co_weekhs = co_weekhs;
		this.co_time = co_time;
		this.co_status = co_status;
	}

	public String getId() {
		return co_id;
	}

	public void setId(String co_id) {
		this.co_id = co_id;
	}

	public String getName() {
		return co_name;
	}

	public void setName(String co_name) {
		this.co_name = co_name;
	}

	public String getTeacher() {
		return co_teacher;
	}

	public void setTeacher(String co_teacher) {
		this.co_teacher = co_teacher;
	}

	public String getWeekhs() {
		return co_weekhs;
	}

	public void setWeekhs(String co_weekhs) {
		this.co_weekhs =co_weekhs;
	}

	public String getTime() {
		return co_time;
	}

	public void setTime(String co_time) {
		this.co_time = co_time;
	}
	
	public void setStatus(String co_status) {
		this.co_status = co_status;
	}
	
	public String getStatus() {
		return co_status;
	}
	
}
