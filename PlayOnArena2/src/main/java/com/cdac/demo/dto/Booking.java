package com.cdac.demo.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue
	private int bookingId;
	private int turfId;
	private String userName;
	private String turfName;
	private String turfAdd;
	private String sportsType;
	private String managerId;
	private String timeSlot;
	private Date date;
	@Value("Pending")
	private String paymentStatus;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int bookingId, int turfId, String userName, String turfName, String turfAdd, String sportsType,
			String managerId, String timeSlot, Date date, String paymentStatus) {
		super();
		this.bookingId = bookingId;
		this.turfId = turfId;
		this.userName = userName;
		this.turfName = turfName;
		this.turfAdd = turfAdd;
		this.sportsType = sportsType;
		this.managerId = managerId;
		this.timeSlot = timeSlot;
		this.date = date;
		this.paymentStatus = paymentStatus;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getTurfId() {
		return turfId;
	}
	public void setTurfId(int turfId) {
		this.turfId = turfId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTurfName() {
		return turfName;
	}
	public void setTurfName(String turfName) {
		this.turfName = turfName;
	}
	public String getTurfAdd() {
		return turfAdd;
	}
	public void setTurfAdd(String turfAdd) {
		this.turfAdd = turfAdd;
	}
	public String getSportsType() {
		return sportsType;
	}
	public void setSportsType(String sportsType) {
		this.sportsType = sportsType;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	
	
	

}
