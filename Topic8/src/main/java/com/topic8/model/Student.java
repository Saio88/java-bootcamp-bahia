package com.topic8.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="students")
public class Student {

	@Id
	private String st_id;
	private String st_name;
	private String st_lastname;	
	private String st_datebirth;
	
	public Student(){}
	
	public Student(String st_id, String st_name, String st_lastname,
			String st_datebirth) {
		super();
		this.st_id = st_id;
		this.st_name = st_name;
		this.st_lastname = st_lastname;
		this.st_datebirth = st_datebirth;
	}
	public String getSt_id() {
		return st_id;
	}
	public void setSt_id(String st_id) {
		this.st_id = st_id;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public String getSt_lastname() {
		return st_lastname;
	}
	public void setSt_lastname(String st_lastname) {
		this.st_lastname = st_lastname;
	}
	public String getSt_datebirth() {
		return st_datebirth;
	}
	public void setSt_datebirth(String st_datebirth) {
		this.st_datebirth = st_datebirth;
	}

	
}