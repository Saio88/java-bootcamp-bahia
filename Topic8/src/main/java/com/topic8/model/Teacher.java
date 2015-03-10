package com.topic8.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="teachers")
public class Teacher {
	@Id
	private String te_id;
	private String te_name;
	private String te_lastname;
	private String te_datebirth;
	
	public Teacher(){}
	
	public Teacher(String te_id, String te_name, String te_lastname, String te_datebirth) {
		super();
		this.te_id = te_id;
		this.te_name = te_name;
		this.te_lastname = te_lastname;
		this.te_datebirth = te_datebirth;
	}
	public String getId() {
		return te_id;
	}
	public void setId(String te_id) {
		this.te_id = te_id;
	}
	public String getName() {
		return te_name;
	}
	public void setName(String te_name) {
		this.te_name = te_name;
	}
	public String getLastname() {
		return te_lastname;
	}
	public void setLastname(String te_lastname) {
		this.te_lastname = te_lastname;
	}
	public String getDatebirth() {
		return te_datebirth;
	}
	public void setDatebirth(String te_datebirth) {
		this.te_datebirth = te_datebirth;
	}

}
