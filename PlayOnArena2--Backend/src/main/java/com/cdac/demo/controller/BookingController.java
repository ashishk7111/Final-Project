package com.cdac.demo.controller;


import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.demo.dto.Booking;
import com.cdac.demo.service.BookingServiceImple;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200")
public class BookingController {
	
	@Autowired
	private BookingServiceImple bservice;
	
	/*
	@PostMapping("/booking")
	public Booking createBooking(@RequestBody Booking booking) {
		return bservice.saveBooking(booking);
		
	}*/
	
	@GetMapping("/booking/{bookingId}")
	public Booking getBookingById(@PathVariable(value="bookingId") int bookingId) {
		return bservice.findByBookingId(bookingId);
		
	}
	
	@PostMapping("/booking")
	public int saveBooking(@RequestBody Booking booking) throws Exception
	{
		LocalDate tempDate = booking.getDate();
		String temptime = booking.getTime();
		String tempAdd = booking.getTurfAdd();
//		Booking bookingObj = null;

		if((tempDate != null && temptime != null)&& tempAdd != null ) {
			Booking bookingobj = bservice.findByturfAddAndDateAndTime(tempAdd, tempDate, temptime);
			
			if(bookingobj != null)
			{
				throw new Exception(" Booking with this "+ tempDate + temptime + tempAdd + "is allready exit");
				
			}
		}
		
		  bservice.saveBooking(booking);
		
		
		return booking.getBookingId();
		


		
		//bservice.saveBooking(booking);
		//return booking.getBookingId();
		
	}

}
