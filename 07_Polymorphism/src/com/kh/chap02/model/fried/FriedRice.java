package com.kh.chap02.model.fried;

public class FriedRice extends Fried {
	private void rice() {
		System.out.println("볶음밥 나왔습니다~");
	}
	@Override
	public void fried() {
		rice();
	}
}
