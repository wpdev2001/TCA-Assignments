package com.wp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Student {
	
	@Id
	@Column(name="rno")
	private Integer rno;
	
	@Column(name="name")
	private String name;
	
	//NOTE: If we don't pass the 'name' attribute then it gives same name to column name which we have passed while declaring this field
	@Column
	private Double per;
	
	public Integer getRno() {
		return rno;
	}
	public void setRno(Integer rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPer() {
		return per;
	}
	public void setPer(Double per) {
		this.per = per;
	}

}
