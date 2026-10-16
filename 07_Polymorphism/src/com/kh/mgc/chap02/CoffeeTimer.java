package com.kh.mgc.chap02;

public class CoffeeTimer {
	private String name;

	public CoffeeTimer(String name) {
		this.name = name;
	}
	public void coffeeWork() {
		System.out.println("커피 관련 업무");
	}
	public void breakTime() {
		System.out.println("쉬는시간~~");
	}

}
