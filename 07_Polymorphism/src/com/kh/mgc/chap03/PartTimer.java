package com.kh.mgc.chap03;

public class PartTimer {
	private String name;
	public PartTimer(String name) {
		this.name = name;
	}
	public void working() {
		System.out.println("알바시작~");
	}
	public void breakTime() {
		System.out.println("쉬는시간~");
	}
	public String getName() {
		return name;
	}
}
