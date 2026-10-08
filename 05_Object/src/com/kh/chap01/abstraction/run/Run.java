package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Dog;

public class Run {

	public static void main(String[] args) {
		// 현실세계의 개 => 자바세상에서 구현
		// 종 : 도베르만, 이름 : 나폴레옹, 나이 : 6, 성별 : M, 중성화여부 : 안함
		Dog dog = new Dog();
		//dog.walk();
		// 참조자료형은 기본값이 null
		dog.name = "나폴레옹"; 
		System.out.println(dog.name);
		// 종 : 푸들, 이름 : 징기스칸, 나이 : 6, 성별 : M, 중성화여부 : 안함
		Dog khan = new Dog();
		khan.name = "징기스칸";
		System.out.println(khan.name);
		
		// 클래스 => 객체가 가지는 정보(속성, 행위)들을 담아내는 그릇 또는 틀 또는 설계도 또는 명세
		//		=> 사용자 정의 자료형

		dog.walk();
		khan.walk();
		
		dog.age = 6;
		System.out.println(dog.age);
		
		//for(int i = 0; i < 100; i++) {
		dog.swingTail();
		//}
		dog.neuter = false;
		System.out.println(dog.age);
	}

}
/*
 * 숙제
 * 
 * 나만의 클래스 10개 만들기
 * 
 * 수업시간에 만든 Dog를 참고하여 현실세계의 그 어떤 무언가를 클래스로 설계
 * 
 * 설계한 클래스를 이용해서 main메소드에서 객체를 클래스마다 x2씩 생성해서 객체 20개 만들기
 * 
 * 그리고 객체 필드에 접근해서 값 대입 후 출력하기
 * 
 * 
 */





