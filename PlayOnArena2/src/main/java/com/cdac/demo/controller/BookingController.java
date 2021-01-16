package com.cdac.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.demo.dto.Booking;
import com.cdac.demo.service.BookingServiceImple;

@RestController
public class BookingController {
	
	@Autowired
	private BookingServiceImple bservice;
	
	@PostMapping("/booking")
	public Booking createBooking(@RequestBody Booking booking) {
		return bservice.saveBooking(booking);
		
	}
	
	@GetMapping("/booking/{bookingId}")
	public Booking getBookingById(@PathVariable(value="bookingId") int bookingId) {
		return bservice.findByBookingId(bookingId);
		
	}

}
