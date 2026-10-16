package com.kh.chap01.model.dto;

public class GoldBracelet {
	private String name;
	private double weight;
	private double perimeter;
	
	public GoldBracelet() {
	}
	public GoldBracelet(String name, double weight, double perimeter) {
		this.name = name;
		this.weight = weight;
		this.perimeter = perimeter;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public String info() {
		return "보물정보 = [보물명 : " + name
			 + ", 무게 : " + weight
			 + ", 둘레 : " + perimeter + "]";
	}
	

}
