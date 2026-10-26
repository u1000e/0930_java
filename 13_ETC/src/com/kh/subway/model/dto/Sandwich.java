package com.kh.subway.model.dto;

public class Sandwich {
	private String name;
	private int price;
	private String material;
	
	public Sandwich(String name, int price, String material) {
		this.name = name;
		this.price = price;
		this.material = material;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "Sandwich [name=" + name + ", price=" + price + ", material=" + material + "]";
	}
}
