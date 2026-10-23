package com.kh.chap02.model.dto;

public class Mall {
	private String brand;
	private String address;
	public Mall(String brand, String address) {
		this.brand = brand;
		this.address = address;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Mall [brand=" + brand + ", address=" + address + "]";
	}
}
