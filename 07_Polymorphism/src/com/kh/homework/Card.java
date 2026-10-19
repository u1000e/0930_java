package com.kh.homework;

import com.kh.chap04.model.dto.Payment;

public class Card implements Payment {
	private int balance = 10000;
	
	@Override
	public int pay(int amount) {
		balance -= (amount * 0.9);
		System.out.println("카드 결제 시 10%할인 혜택이 적용");
		return balance;
	}

}
