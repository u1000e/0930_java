package com.kh.second;

public class Run { // 내부 / 외부
	
	public static void main(String[] args) {
		
		// 외부 클래스에 존재하는 메소드를 호출 하고 싶다!
		// printMyName();
		PrintController pc = new PrintController();
		//printMyName();
		pc.printMyName();
		// .
		// 참조연산자 / 직접접근연산자
	}
	

}








/*
 * 실습
 * 
 * third 패키지를 생성한 후
 * 
 * 클래스 두 개를 만들고   ==> 클래스 이름은 자유
 * 
 * 하나의 클래스에는 메인메소드를 선언
 * 
 * 나머지 클래스에는 일반 메소드를 선언 후 ==> 메소드 이름은 자유
 * 
 * 메인메소드에서 일반 메소드를 호출 하시오.
 */



















