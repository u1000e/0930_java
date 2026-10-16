package com.kh.chap02.model.dto;
/*
 * 상속(Inheritance)
 * 
 * 기존에 존재하는 클래스를 이용해서 새로운 클래스를 만드는 기술
 */
public class Treasure extends Object {
	// 공통 필드
	protected String name;
	private double weight;
	
	public Treasure() {
		System.out.println("나는 부모");
	}
	public Treasure(String name, double weight) {
		this.name = name;
		this.weight = weight;
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
	
	public String info() {
		return "보물명 : " + name
		     + ", 무게 : " + weight;
	}

}
