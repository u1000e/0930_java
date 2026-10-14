package com.kh.chap07;

public class 엄마 {
	private int cash;
	private 길동 자녀 = new 길동();
	
	public 엄마(int cash) {
		this.cash = cash;
	}
	
	public int getCash() {
		return cash;
	}
	
	public void 심부름시키기() {
		this.cash = 자녀.심부름하기(cash);
		return;
	}

}
