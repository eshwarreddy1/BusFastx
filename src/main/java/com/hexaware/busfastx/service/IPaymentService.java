package com.hexaware.busfastx.service;

import java.util.List;

import com.hexaware.busfastx.entity.Payment;

public interface IPaymentService {
	
	int createpayment(Payment payment);
	int deletePayment(Payment payment);
	int updatePayment(Payment payment);
	List<Payment> getAllPayment();

}
