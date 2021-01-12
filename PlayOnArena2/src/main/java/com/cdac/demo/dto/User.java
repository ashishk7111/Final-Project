package com.cdac.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int Id;
	private String userName;
	private String firstname;
	private String lastName;
	private String mobNo;
	private String email;
	private String password;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id, String userName, String firstname, String lastName, String mobNo, String email,
			String password) {
		super();
		Id = id;
		this.userName = userName;
		this.firstname = firstname;
		this.lastName = lastName;
		this.mobNo = mobNo;
		this.email = email;
		this.password = password;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMobNo() {
		return mobNo;
	}


	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
