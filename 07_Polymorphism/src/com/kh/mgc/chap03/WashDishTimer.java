package com.kh.mgc.chap03;

public class WashDishTimer extends PartTimer{
	
	public WashDishTimer(String name) {
		super(name);
	}
	
	@Override
	public void working() {
		System.out.println(getName() + "이(가) 설거지를 합니다.");
	}

}
