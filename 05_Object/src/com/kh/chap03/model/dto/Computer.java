package com.kh.chap03.model.dto;

public class Computer {
	// 가격, 어디서, 결제방법
	
	// 필드부
	private int price;
	private String storeName;
	private String payment;
	
	// 생성자부=> 아직안배움
	// 메소드부
	// getter , setter , info
	public int getPrice() {
		return price;
	}
	public String getStoreName() {
		return storeName;
	}
	public String getPayment() {
		return payment;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	public String info() {
		return "결제수단 : " + payment + ", 금액 : " + price + ", 구입처 : " + storeName;
	}
	
	

}
