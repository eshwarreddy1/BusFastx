package com.hexaware.busfastx.entity;
import java.time.LocalTime;

public class Bus {
    private int operatorId;
    private String busName;
    private String busNumber;
    private int numberOfSeats;
    private String origin;
    private String destination;
    private LocalTime departureTime;
    private double fare;
	public Bus() {
		super();
	}
	public Bus(int operatorId, String busName, String busNumber, int numberOfSeats, String origin, String destination,
			LocalTime departureTime, double fare) {
		super();
		this.operatorId = operatorId;
		this.busName = busName;
		this.busNumber = busNumber;
		this.numberOfSeats = numberOfSeats;
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
		this.fare = fare;
	}
	public int getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "Bus [operatorId=" + operatorId + ", busName=" + busName + ", busNumber=" + busNumber
				+ ", numberOfSeats=" + numberOfSeats + ", origin=" + origin + ", destination=" + destination
				+ ", departureTime=" + departureTime + ", fare=" + fare + "]";
	}

}
