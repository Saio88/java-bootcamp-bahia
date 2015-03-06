package com.t7.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Teachers")
public class Teacher {
	
	@Id
	@Column(name="te_id", nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
	@Column(name="te_name", nullable = false)
		private String name;
	@Column(name="te_lastname", nullable = false)
		private String lastname;
	@Column(name="te_datebirth", nullable = false)
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
}
