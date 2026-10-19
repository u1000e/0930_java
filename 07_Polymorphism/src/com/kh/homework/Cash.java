package com.kh.homework;

import com.kh.chap04.model.dto.Payment;

public class Cash implements Payment {
	private int balance = 10000;
	
	@Override
	public int pay(int amount) {
		balance -= amount;
		System.out.println("현금 영수증 발급");
		return balance;
	}

}
