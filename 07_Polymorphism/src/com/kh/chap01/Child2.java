package com.kh.chap01;

public class Child2 extends Parent {
	private int z;
	
	public void printChild2() {
		System.out.println("두 번째 자식클래스 메소드 호출");
	}
	public void print() {
		System.out.println("Child2가 오버라이딩 한 메소드");
	}
}
