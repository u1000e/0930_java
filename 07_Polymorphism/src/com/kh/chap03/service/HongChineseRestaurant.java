package com.kh.chap03.service;

public class HongChineseRestaurant extends BlackBeanSauceNoodles implements DeliveryService, Skill {

	@Override
	public void makeNoodles() {
		System.out.println("모든 재료를 다저 만든 부드럽고 고소한맛의 유니짜장");
	}
	
	@Override
	public void delivery() {
		System.out.println("오도바이로 배달합니다~");
	}

	
	
}
