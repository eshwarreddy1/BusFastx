package com.hexaware.busfastx.service;

import java.util.List;

import com.hexaware.busfastx.entity.Booking;

public interface IBookingService {
	
	int createBooking(Booking booking);
	int updateBooking(Booking booking);
	int deleteBooking(Booking booking);
	List<Booking> getAllBooking();

}
