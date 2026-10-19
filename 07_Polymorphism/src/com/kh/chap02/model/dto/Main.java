package com.kh.chap02.model.dto;

public class Main extends Cook {
	public Main(String name) {
		super(name);
	}
	
	@Override
	public void cooking() {
		System.out.println("소고기 구워용~~");
	}
}
