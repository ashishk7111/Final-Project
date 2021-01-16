package com.cdac.demo.service;

import com.cdac.demo.dto.Booking;

public interface BookingService{
	
	public Booking findByBookingId(int bookingId);
	
	public Booking saveBooking(Booking booking);

}
