package com.kh.chap04.controller;
/*
 * 필드 == 멤버변수 == 속성
 * 
 * 클래스를 구성하는 요소 중 하나
 * 데이터를 저장하기 위한 역할(변수)
 * 위치가 클래스 블록안에 존재
 * 
 * 인스턴스 변수
 * 
 * new 키워드를 사용해서 해당 객체를 생성하는 순간 heap에 할당
 * 
 * 클래스 변수(static field)
 * 
 * static 이라는 예약어가 붙어있는 필드
 * 
 * 지역 변수
 * 
 * 특정 영역( {} ) 내부에서 선언되는 시점에 메모리 영역에 할당
 */
public class FieldController {
	
	public int global; 
	public static String str = "나는 스태틱";
	// 프로그램 구동 중 계속 값을 사용해야하는 경우에만 사용
	public static final String JAVA_VERSION = "21";
	//		final static
	
	// 선언과 동시에 초기화를 진행해 절대 못바꾸게 쭉 사용
	
	
	public void checkVariable(int parameter) {
		
		int local = 1;
		//int[] arr = new int[2];
		//System.out.println(arr.length);
		System.out.println(global);
		System.out.println(local);
		System.out.println(parameter);
	}
	

}
