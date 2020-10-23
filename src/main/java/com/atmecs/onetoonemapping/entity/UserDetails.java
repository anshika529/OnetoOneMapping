package com.atmecs.onetoonemapping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails {
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UD_id")
	private int UD_id;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "Job")
	private String Job;
	
	@Column(name = "Salary")
	private String Salary;
	
	

	public UserDetails() {
	
	}

	public UserDetails(int uD_id, String email, String gender, String job, String salary) {
		
		this.UD_id = uD_id;
		this.email = email;
		this.gender = gender;
		this.Job = job;
		this.Salary = salary;
	}

	public int getUD_id() {
		return UD_id;
	}

	public void setUD_id(int uD_id) {
		UD_id = uD_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJob() {
		return Job;
	}

	public void setJob(String job) {
		Job = job;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

}
