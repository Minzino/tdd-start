package com.example.tddstart.chap03;


import java.time.LocalDate;

public class ExpiryDateCalculator {

//	public LocalDate calculateExpiryDate(LocalDate billingDate, int payAmount) {
//		int cnt = 0;
//		for (int i = 10000; i <= payAmount; i += 10000) {
//			cnt++;
//		}
//		return billingDate.plusMonths(cnt);
//	}
	public LocalDate calculateExpiryDate(PayData payData) {
		return payData.getBillingDate().plusMonths(1);
	}
}
