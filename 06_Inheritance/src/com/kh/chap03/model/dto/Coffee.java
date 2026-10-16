package com.kh.chap03.model.dto;

public class Coffee extends Beverage {
	
	private String bean;

	public Coffee() {}
	public Coffee(String name, String volume, String color, String bean) {
		super(name, volume, color);
		this.bean = bean;
	}
	
	public String getBean() {
		return bean;
	}
	public void setBean(String bean) {
		this.bean = bean;
	}

}
