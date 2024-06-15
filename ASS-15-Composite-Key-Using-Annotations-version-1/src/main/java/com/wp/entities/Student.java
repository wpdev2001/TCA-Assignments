package com.wp.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	//This annotation is used to extract fname, lname from StudentComposite.java
	@EmbeddedId
	private StudentCompositeKey id;
	
	@Column
	private String city;

	public StudentCompositeKey getId() {
		return id;
	}

	public void setId(StudentCompositeKey id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}
