package com.cdac.demo.dto;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Value;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue
	private int bookingId;
	private String name;
	private String emailId;
	private String turfName;
	private String managerName;
	private String turfAdd;
	private String time;
	private LocalDate date;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Booking(int bookingId, String name, String emailId, String turfName, String managerName, String turfAdd,
			String time, LocalDate date) {
		super();
		this.bookingId = bookingId;
		this.name = name;
		this.emailId = emailId;
		this.turfName = turfName;
		this.managerName = managerName;
		this.turfAdd = turfAdd;
		this.time = time;
		this.date = date;
	}



	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getTurfName() {
		return turfName;
	}
	public void setTurfName(String turfName) {
		this.turfName = turfName;
	}
	
	public String getManagerName() {
		return managerName;
	}


	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}


	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getTurfAdd() {
		return turfAdd;
	}
	public void setTurfAdd(String turfAdd) {
		this.turfAdd = turfAdd;
	}
	
	
}
