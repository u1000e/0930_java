package com.kh.chap01;

public class Child1 extends Parent {
	private int y;
	
	public void printChild1() {
		System.out.println("첫번째 자식 클래스 메소드 호출");
	}
	public void print() {
		System.out.println("Child1의 오버라이딩된 메소드");
	}
}