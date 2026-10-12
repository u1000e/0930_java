package com.kh.chap02.run;

public class Human {
	
	private int 내돈;
	
	public void set내돈(int 내돈) {
		this.내돈 = 내돈;
	}
	
	public void 잔고보기() {
		System.out.println("길동이의 잔고 : " + 내돈);
	}
	
	public int 양파사오기(int 돈) {
		
		System.out.println("엄마가 준 돈 : " + 돈);
		System.out.println("양파 구매하기");
		돈 -= 1000;
		System.out.println("양파사고 남은 돈 : " + 돈);
		
		return 돈;
	}
	
	public void 감자사오기() {
		System.out.println("감자를 구매합니다.");
		내돈 -= 1000;
		System.out.println("길동이가 감자사고 남은돈 : " + 내돈);
	}
	
	public void 러닝() {
		준비운동();
		신발끈묶기();
		뛰기();
		스트레칭();
		//씻기();
	}
	
	private void 신발끈묶기() {
		System.out.println("신발끈을 묶어요.");
	}
	
	private void 준비운동() {
		System.out.println("준비운동해요");
	}
	
	private void 뛰기() {
		System.out.println("열심히 뛰어요");
	}
	
	private void 스트레칭() {
		System.out.println("스트레칭하기");
	}
	

}
