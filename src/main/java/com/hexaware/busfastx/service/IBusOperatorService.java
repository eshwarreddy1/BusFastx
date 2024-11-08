package com.hexaware.busfastx.service;

import java.util.List;

import com.hexaware.busfastx.entity.BusOperator;

public interface IBusOperatorService {
	int createBusOperate(BusOperator Busoperator);
	int deleteBusOperate(BusOperator Busoperator);
	int updateBusOperate(BusOperator Busoperator);
	List<BusOperator> getAllBusOperator();

}
