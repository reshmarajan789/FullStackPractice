package com.lti.training.bootApp.entity;

public class Student {
	private String name;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public Student() {
		
		// TODO Auto-generated constructor stub
	}

}
