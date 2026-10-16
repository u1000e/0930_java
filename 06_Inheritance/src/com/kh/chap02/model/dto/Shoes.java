package com.kh.chap02.model.dto;

public class Shoes {
	private Treasure treasure = new Treasure();
	
	public void setName(String name) {
		treasure.setName(name);
	}
	
	public String getName() {
		return treasure.getName();
	}

}
