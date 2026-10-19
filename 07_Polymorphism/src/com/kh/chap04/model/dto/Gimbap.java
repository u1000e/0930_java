package com.kh.chap04.model.dto;

public class Gimbap {
	private String name;
	private String mainMenu;
	private int price;
	
	public Gimbap(String name, String mainMenu, int price) {
		super();
		this.name = name;
		this.mainMenu = mainMenu;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMainMenu() {
		return mainMenu;
	}
	public void setMainMenu(String mainMenu) {
		this.mainMenu = mainMenu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
