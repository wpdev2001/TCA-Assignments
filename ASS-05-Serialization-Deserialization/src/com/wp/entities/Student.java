package com.wp.entities;

import java.io.Serializable;

public class Student implements Serializable {
	
	//This line is optional but it is used to identify object during serializable and deserializable --> Refer into notes
	private static final long serialVersionUID = 1L;
	
	private int rno;
	private String name;
	private double per;
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	
}
