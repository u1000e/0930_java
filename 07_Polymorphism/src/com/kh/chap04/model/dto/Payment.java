package com.kh.chap04.model.dto;

public interface Payment { // 인터페이스
	
	int pay(int amount);
	
	// 1. Payment인터페이스를 구현하는
	// 3개의 클래스
	// Card, Cash, Point 만들기
	// 이거까진 꼭 하기
	
	// 1_1. 각각의 클래스는 잔액 필드를 가진다.
	// 1_2. 각각의 클래스는 pay를 전부 다르게 구현한다.
	// 1_3. main메서드에서는 Payment[]를 선언하고 세개의 클래스의 pay메서드를 반복문을 호출하여 결과를 확인한다.
	// => 월요일에 같이 할건데 혼자 해볼 수 있으면 해보기
	
	// 2. 과수원 하는날 뭐만들기 고민하기 숙제 => 만들어보기
}
