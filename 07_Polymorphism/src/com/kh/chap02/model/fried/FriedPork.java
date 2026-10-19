package com.kh.chap02.model.fried;

public class FriedPork extends Fried {
	private void pork() {
		System.out.println("탕수육 나왔습니다~");
	}
	@Override
	public void fried() {
		pork();
	}
}
