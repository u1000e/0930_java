package com.kh.mgc.chap03;

public class CoffeePartTimer extends PartTimer {
	public CoffeePartTimer(String name) {
		super(name);
	}
	@Override
	public void working() {
		System.out.println(getName() + "이 커피 업무를 시작합니다~");
	}
}
