package com.hexaware.busfastx.service;

import java.util.List;

import com.hexaware.busfastx.entity.Bus;

public interface IBusService {
	int createBus(Bus bus);
	int deleteBus(Bus bus);
	int updateBus(Bus bus);
	List<Bus> getAllBuses();
	

}
