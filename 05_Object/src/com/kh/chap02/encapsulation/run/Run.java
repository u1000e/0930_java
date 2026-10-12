package com.kh.chap02.encapsulation.run;

import java.util.Scanner;

import com.kh.chap02.encapsulation.model.vo.CellPhone;
import com.kh.chap02.run.Human;

public class Run {

	public static void main(String[] args) {
		// 아 한개의 스마트폰 정보를 저장을 좀 해두어야겠구나!
		// CellPhone클래스를 이용해서 객체 생성 => 메모리(heap)에 적재
		CellPhone cp = new CellPhone();
		// cp.hi();
		// new CellPhone().hi();
		// 자바에서 변수 공간에 대입될 수 있는 값의 종류 10가지
		//
		// 기본자료형
		// boolean 리터럴, char리터럴, byte리터럴, short리터럴, int리터럴, long리터럴, float리터럴, double리터럴
		//
		// 참조자료형
		// 주소값, null값
		// 주소값 == 객체
		//cp.productName = "아이폰18Pro";
		//cp.name = "하하호호"; 
		//System.out.println(cp.productName);
		//cp.size = -8.0;
		//System.out.println(cp.size);
		// 캡슐화(encapsulation)
		
		// 필드가 외부에서는 보이지 않기 때문에 오류 발생!!
		// 접근제한자를 public에서 private으로 바꿨기 때문에!!!
		// 직접접근이 불가능함
		
		// 캡슐화란?
		// 속성(데이터)과 해당 데이터를 조작하는 행동(메소드)를 하나의 단위로 묶는 것
		
		// 클래스 내부 숨기기 => 정보은닉(information hiding)
		
		cp.setSize(4.0); // size필드의 값을 세팅
				   // argument, 인자값, 인수
		// System.out.println("메인메소드 34행 : " + cp);
		
		//--
		/*
		Human 홍길동 = new Human();
		홍길동.잔고보기();
		홍길동.set내돈(3000);
		홍길동.잔고보기();
		홍길동.감자사오기();
		int 잔돈 = 홍길동.양파사오기(10000);
		System.out.println("심부름하고 남은 돈 : " + 잔돈);
		*/
		
		// System.out.println(cp.size);
		cp.getSize();
		System.out.println(cp.getSize());
		double size = cp.getSize();
		System.out.println(size);
		// 갤럭시 폴드 7
		cp.setProductName("갤럭시 폴드 7");
		//cp.setColorAndNetworkProvider("파란색", "KT");
		cp.setColor("파란색");
		cp.setNetworkProvider("KT");
		
		String name = cp.getProductName();
		String color = cp.getColor();
		String np = cp.getNetworkProvider();
		
		System.out.println("스마트폰 = [제품명 : " + name 
						 + ", 색상 : " + color
						 + ", 사이즈 : " + size + "인치"
						 + ", 통신사 : " + np + "]");
		
		CellPhone applePhone = new CellPhone();
		applePhone.setColor("주황색");
		applePhone.setProductName("아이폰 18 Pro");
		applePhone.setSize(3.0);
		applePhone.setNetworkProvider("LG");
		
		
		System.out.println(cp.info());
		System.out.println(applePhone.info());
		
		
		
	}

}







