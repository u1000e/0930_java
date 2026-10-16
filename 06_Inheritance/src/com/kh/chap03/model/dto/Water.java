package com.kh.chap03.model.dto;

public class Water extends Beverage {
	
	private String waterSource;

	public Water() {}
	public Water(String name, String volume, String color, String waterSource) {
		super(name, volume, color);
		this.waterSource = waterSource;
	}
	public String getWaterSource() {
		return waterSource;
	}
	public void setWaterSource(String waterSource) {
		this.waterSource = waterSource;
	}

}
