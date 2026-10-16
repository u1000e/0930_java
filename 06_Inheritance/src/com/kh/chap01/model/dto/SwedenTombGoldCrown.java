package com.kh.chap01.model.dto;

public class SwedenTombGoldCrown {
	private String name;   // 이름
	private double weight; // 무게
	private double purity; // 순도
	public SwedenTombGoldCrown() {
	}
	public SwedenTombGoldCrown(String name, double weight, double purity) {
		this.name = name;
		this.weight = weight;
		this.purity = purity;
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
	public double getPurity() {
		return purity;
	}
	public void setPurity(double purity) {
		this.purity = purity;
	}
	
	public String info() {
		return "보물정보 = [보물명 : " + name
			 + ", 무게 : " + weight
			 + ", 순도 : " + purity + "]";
	}
	

}
