package com.kh.chap02.model.dto;

public class SwedenGoldCrown extends Treasure {
	
	private double purity; // 순도맨

	public SwedenGoldCrown() {}
	public SwedenGoldCrown(String name, double weight, double purity) {
		// super.name = name;
		// 캡슐화원칙 위반!
		//super();
		//setName(name);
		//setWeight(weight);
		super(name, weight);
		this.purity = purity;
	}
	
	public double getPurity() {
		return purity;
	}
	public void setPurity(double purity) {
		this.purity = purity;
	}
}
