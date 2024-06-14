package com.wp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {
	
	@Id
	private Integer rno;
	
	@Column
	private String name;
	
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
