package com.kh.chap01.model.dto;

public class PrinceTombGoldCrown {
	private String name;    // 이름
	private double weight;  // 무게
	private String source;  // 출처
	
	// 1. 기본생성자 , 2. 모든 필드를 매개변수로 갖는 생성자
	// 기본생성자 단축키
	// Alt + Shift + s -> o -> Alt + d -> Alt + g
	public PrinceTombGoldCrown() {}
	// 매개변수 생성자
	// Alt + Shift + s -> o -> Alt + g
	public PrinceTombGoldCrown(String name, double weight, String source) {
		this.name = name;
		this.weight = weight;
		this.source = source;
	}
	// 게터세터 단축키 : Alt + Shift + s -> r -> Alt + a -> Alt + r
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
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	public String info() {
		return "보물정보 = [보물명 : " + name
			 + ", 무게 : " + weight
			 + ", 출처 : " + source + "]";
	}
	

}
