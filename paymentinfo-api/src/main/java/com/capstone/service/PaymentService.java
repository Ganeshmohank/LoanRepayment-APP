package com.capstone.service;

import java.util.List;

import com.capstone.model.PaymentInfo;

public interface PaymentService {
	
	public List<PaymentInfo> getpayment();
	public PaymentInfo getfindByTransactionNo(int transaction_no);
	public PaymentInfo addTransaction(PaymentInfo payment);
}
