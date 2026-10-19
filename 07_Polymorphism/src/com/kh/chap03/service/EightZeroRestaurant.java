package com.kh.chap03.service;

import java.util.concurrent.ConcurrentHashMap;

public class EightZeroRestaurant extends BlackBeanSauceNoodles implements DeliveryService, Skill {
	
	@Override
	public void makeNoodles() {
		System.out.println("면은 기계면치고는 맛있는 짜장");
	}

	@Override
	public void delivery() {
		System.out.println("드론으로 배달함");
	}
}
