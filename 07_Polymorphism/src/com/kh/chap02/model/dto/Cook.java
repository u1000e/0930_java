package com.kh.chap02.model.dto;
/*
 * 클래스 내부에 추상메소드가 한개라도 존재하는 순간
 * 클래스 또한 abstract 키워드를 붙여서 추상 클래스로 정의 해야함
 * 
 * 추상 클래스 == 필드 + 메소드 + 추상메소드 => 추상메소드가 존재하지 않아도 추상클래스로 정의할 수 있음
 * 
 * 1. 구현하는 도중 해당 클래스가 구체적으로 구현된 상태가 아닌것 같다~~ 추상클래스로 선언
 * 
 * 2. 지금 이 클래스는 부모클래스 역할만 할 것이고 객체 생성은 불가능해야한다! 라는 생각이 들면 추상클래스로 선언
 */
public abstract class Cook {
	private String name;
	public Cook(String name) {
		this.name = name;
	}
	// 이 메소드는 자식클래스들이 오버라이딩 하기 위해서 선언만 해놓을 용도
	// public void cooking() {}
	
	//		추상화	=> 추상메소드
	//				abstract  <=> implement
	public abstract void cooking();
	//				static / dynamic / automatic
	//				virtual == logical / physical
	public void breakTime() {
		System.out.println("쉬는시간입니다~~");
	}

}
