package com.cdac.demo.service;

import java.time.LocalDate;

import com.cdac.demo.dto.Booking;

public interface BookingService{
	
	public Booking findByBookingId(int bookingId);
	
	public Booking saveBooking(Booking booking);
	
	Booking findByturfAddAndDateAndTime(String turfAdd,LocalDate date,String time);


}
