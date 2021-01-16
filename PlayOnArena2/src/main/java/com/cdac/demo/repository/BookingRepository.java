package com.cdac.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.demo.dto.Booking;

@Repository("bookingRepository")
public interface BookingRepository extends JpaRepository<Booking, Integer>  {
	
	Booking findByBookingId(int bookingId);
	
	

}
