package com.kh.chap06.controller;

public class MethodController {
	/*
	 * 메소드(Method) == 멤버 함수
	 * 
	 * 프로그래밍 언어에서의 함수 : 특정 작업을 수행하기 위해서 만들어진 코드 블럭
	 * 1. 재사용성
	 * 2. 모듈화
	 * 
	 * 객제지향 프로그래밍에서의 함수(메소드) : 객체가 수행할 수 있는 행동을 정의한 코드 블럭
	 * 
	 * 특정 자료형에서만 사용이 가능한 함수
	 * 
	 * [ 표현법 ]
	 * 
	 * 접근제한자 예약어 반환형 메소드식별자(매개변수의자료형 매개변수식별자){
	 * 		수행할 코드;
	 * 		return 반환값;
	 * }
	 * 생략 가능한 것 : 예약어, 매개변수, return(void)
	 * 반환형 : 반환값이 존재할 시 반환값의 자료형
	 * 메소드 호출 시 전달 인자값 => 매개변수의 자료형 및 개수가 일치해야함
	 */
	// 정수 값 두개를 받아서 합을 반환해주는 기능을 구현하고 싶음
	// Method Signature
	public int add(int a, int b) { // Method Body
		return a + b; // Return Value
	}
	
	// 근본 => 매개변수 O, 반환값 O
	public int fn(int num) {
		return num * 2;
	}
	
	// getter
	
	/*
	 * public String getName(){
	 * 	return name;
	 * }
	 */
	private String returnStr() {
		return "반환값";
	}
	
	public String fn2() {
		return returnStr();
	}
	
	
	/*
	 * 메소드 오버로딩(Method Overloading)
	 * 
	 * "하나의 클래스" 안에 동일한 메소드 식별자로 여러 개의 메소드를 정의하는 기술
	 * 
	 * 1. 매개변수 자료형의 개수, 순서, 종류를 각각 다르게 작성해야함
	 * 2. 매개변수 식별자, 접근제한자, 반환타입은 메소드 오버로딩과 연관이 없음
	 */
	
	// 메소드명을 method로 통일
	public void method() {
		System.out.println("메소드 오버로딩1");
	}
	public void method(int a) {
		System.out.println("메소드 오버로딩2");
	}
	public void method(int a, int b) {
		System.out.println("메소드 오버로딩3");
	}
	public void method(String s) {
		System.out.println("메소드 오버로딩4");
	}
	public void method(int a, String s) {}
	public void method(String s, int a) {}
	
	/*
	private String method(int a) {
		return "a";
	}
	*/
	

}
