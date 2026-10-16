package com.kh.mgc.chap03;

public class DesertPartTimer extends PartTimer {
	
	public DesertPartTimer(String name) {
		super(name);
	}
	
	@Override
	public void working() {
		System.out.println(getName() + "이/가 디저트를 만듭니다.");
	}

}
