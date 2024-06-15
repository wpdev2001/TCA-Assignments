package com.wp.entities;

public class Student {
	

	private Integer rno;
	private String name;
	private Double per;

	//default consturctor
	public Student(){
		this.rno = null;
		this.name = null;
		this.per = null;
	}

	//Parametized constructor
	public Student(Integer rno, String name, Double per)
	{
		this.rno = rno;
		this.name = name;
		this.per = per;
	}
	
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

	public void display()
	{
		System.out.println("Rno" + rno);
		System.out.println("Name" + name);
		System.out.println("Per" + per);
	}	

}
