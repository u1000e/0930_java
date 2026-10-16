package com.kh.mgc.chap03;

public class CoffeeWritingTimer extends PartTimer {
	public CoffeeWritingTimer(String name) {
		super(name);
	}
	@Override
	public void working() {
		System.out.println(getName() + "이/가 커피에 번호를 적습니다.");
	}
}
