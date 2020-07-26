package com.lti.training.styleComparison;

import java.util.List;

public class Employee {

	
	private int id;
	private String name;
	private  int credit_score;
	private int career_level;
	private String Designation;
	private List<String> Roles;
	
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
	public int getCredit_score() {
		return credit_score;
	}
	public void setCredit_score(int credit_score) {
		this.credit_score = credit_score;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	
	
	public List<String> getRoles() {
		return Roles;
	}
	public void setRoles(List<String> roles) {
		Roles = roles;
	}
	
	
	public int getCareer_level() {
		return career_level;
	}
	public void setCareer_level(int career_level) {
		this.career_level = career_level;
	}
	
	
	public Employee(int id, String name, int credit_score, int career_level, String designation, List<String> roles) {
		super();
		this.id = id;
		this.name = name;
		this.credit_score = credit_score;
		this.career_level = career_level;
		Designation = designation;
		Roles = roles;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", credit_score=" + credit_score + ", career_level="
				+ career_level + ", Designation=" + Designation + ", Roles=" + Roles + "]";
	}
	
	
}
