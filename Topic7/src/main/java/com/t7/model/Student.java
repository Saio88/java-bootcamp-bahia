package com.t7.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Student {
	
	@Id
	@Column(name="st_id", nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
	@Column(name="st_name", nullable = false)
		private String name;
	@Column(name="st_lastname", nullable = false)
		private String lastname;
	@Column(name="st_datebirth", nullable = false)
		private Date datebirth;
	
	
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDatebirth() {
		return datebirth;
	}
	public void setDatebirth(Date datebirth) {
		this.datebirth = datebirth;
	}
	
	
	
	/*
	@Override
    public String toString() {
        return String.format(
                "Student[st_id=%d, st_name='%s', st_lastname='%s', st_datebirth='%s']",
                id, name, lastname, datebirth);
    }
	*/
	
}
