package com.hexaware.busfastx.entity;

import java.sql.Date;

public class Booking {
	
	private int bookingId;
    private int userId;
    private int busId;
    private Date bookingDate;
    private Date journeyDate;
    private double totalAmount;
    private String bookingStatus;
	public Booking() {
		super();
	}
	public Booking(int bookingId, int userId, int busId, Date bookingDate, Date journeyDate, double totalAmount,
			String bookingStatus) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.busId = busId;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.totalAmount = totalAmount;
		this.bookingStatus = bookingStatus;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
    

}
