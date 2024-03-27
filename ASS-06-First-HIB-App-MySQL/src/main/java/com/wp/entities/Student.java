package com.wp.entities;

public class Student {
	
	//By using primitive datatypes we can even store null value inside a primary key which is not a good practice
	// Solution --> Use of wrapper classes
//	private int rno;
//	private String name;
//	private double per;
	
	private Integer rno;
	private String name;
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
