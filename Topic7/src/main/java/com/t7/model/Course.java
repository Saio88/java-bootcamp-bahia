package com.t7.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Courses")
public class Course {
	
	@Id
	@Column(name="co_id", nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
	@Column(name="co_name", nullable = false)
		private String name;
	@Column(name="co_teacher", nullable = false)
		private int teacher;
	@Column(name="co_weekhs", nullable = false)
		private int weekhs;
	@Column(name="co_schedule_time", nullable = false)
		private int time;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTeacher() {
		return teacher;
	}
	public void setTeacher(int teacher) {
		this.teacher = teacher;
	}
	public int getWeekhs() {
		return weekhs;
	}
	public void setWeekhs(int weekhs) {
		this.weekhs = weekhs;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	

	
	
	
	
}
