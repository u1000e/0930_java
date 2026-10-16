package com.kh.mgc.chap02;

public class EtcTimer {
	private String name;

	public EtcTimer(String name) {
		this.name = name;
	}
	
	public void etcWork() {
		System.out.println("그 외 업무");
	}
	public void breakTime() {
		System.out.println("쉬는시간~~");
	}

}
