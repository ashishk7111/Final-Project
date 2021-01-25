package com.cdac.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	private String firstName;
	private String lastName;
	private String mobNo;
	private String emailId;
	private String password;
	private String token;

	
	
	public User() {
		
	}


	public User(int userId, String userName, String firstName, String lastName, String mobNo, String emailId,
			String password, String token) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobNo = mobNo;
		this.emailId = emailId;
		this.password = password;
		this.token = token;
	}






	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
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



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}


	public String getToken() {
		return token;
	}



	public void setToken(String token) {
		this.token = token;
	}
	}
