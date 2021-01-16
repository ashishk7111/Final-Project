package com.cdac.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.demo.dto.Booking;
import com.cdac.demo.repository.BookingRepository;

@Service("bookingService")
public class BookingServiceImple implements BookingService {

	@Autowired
	public BookingRepository bookingRepository;
	
	@Override
	public Booking findByBookingId(int bookingId) {
		// TODO Auto-generated method stub
		return bookingRepository.findByBookingId(bookingId);
	}

	@Override
	public Booking saveBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepository.save(booking);
	}
	
	

}
