package com.kh.chap03.service;
/*
 * Interface
 * 
 * 구체클래스
 * 추상클래스
 * 인터페이스
 * 
 * 추상클래스 / 인터페이스
 * 
 * -> 필드 / 메소드 -> 재사용
 * 
 * 
 * 인터페이스 -> 추상클래스보다 더욱 강한 규칙성, 강제성을 가짐
 * 필드를 작성하면 상수필드
 * 메소드를 작성하면 추상메소드
 * 
 * -> 무조건 구현해야 하는 기능이 있을 경우
 * -> 인터페이스를 설계 사용법만 만들어주고
 * -> 구현하는 쪽에서 이걸 실체화하게 만들어줌
 * 
 * 인터페이스는 다중구현이 가능함!!!!
 * 
 */
public interface DeliveryService {
	
	/* public static final*/int num = 1;
	
	/* public abstract */void delivery();

	default void close() {
		System.out.println("닫힙니다~");
	}
	// 인터페이스를 구현한 모든 클래스가 동일하게 수행해야하는 메소드는 default 키워드를 붙여 구현
}