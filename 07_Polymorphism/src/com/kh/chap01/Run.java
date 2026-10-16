package com.kh.chap01;

public class Run {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.printParent();
		//p.printChild1();
		
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent();
		
		Parent p2 = (Parent)new Child1();
		p2.printParent();
		//p2.printChild1();
		// 상속이란 무엇일까?
		
		// 필드 / 메소드 => 안중요함
		// 상속을 통해 부모클래스로부터 상속받을 수 있는 가장 중요한 것은?
		// => 타입(자료형)
		
		// 양쪽의 자료형이 다름에도 불구하고 대입이 될 수 있는 이유는
		// 부모클래스인 Parent가 자식클래스인 Child1에게 자료형을 상속해주었기 때문
		// 대입되기전 Child1객체가 Parent타입으로 형변환을 수행해서 대입됨
		((Child1)p2).printChild1();
		
		/*
		 * 클래스 형 변환
		 * 
		 * " 상속 구조 " 일 경우에만 가능
		 * 
		 * 1. UpCasting
		 * 자식 => 부모
		 * 2. DownCasting
		 * 부모 => 자식
		 * 생략이 불가능함 꼭 명시해줘야함
		 */
		// Parent p3 = new String();
		
		Child1 c2 = new Child1();
		Child1 c3 = new Child1();
		
		Child1[] cs = {new Child1(), new Child1(), new Child1(), new Child1()};
		Child2[] css = {new Child2(), new Child2(), new Child2(), new Child2()};
		System.out.println("-------------------");
		
		Parent[] arr = {new Child1(), new Child2(), new Child2(), new Child1(), new Child2()};
		for(int i = 0; i < arr.length; i++) {
			arr[i].print();
			// 동적바인딩
			// Dynamic Binding
			// 실질적으로 참조하는 객체가 해당 메소드를 오버라이딩 했다면
			// 프로그램 실행시점에 동적으로 자식클래스의 오버라이딩 된 메소드를 호출함
		}
		

	}

}
