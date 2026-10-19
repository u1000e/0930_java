package com.kh.homework;

import com.kh.chap04.model.dto.Payment;

public class Point implements Payment {
	private int point = 1000;

	@Override
	public int pay(int amount) {
		point -= amount;
		return point;
	}
}
