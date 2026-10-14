package com.kh.chap04.view;

import java.util.Arrays;

import com.kh.chap04.controller.FieldController;

public class FieldView {
	
	public void check() {
		
		FieldController fc = new FieldController();
		// 1. FieldController라는 자료형으로 fc라는 식별자를 가진 지역변수를 선언
		// 2. 객체 생성(new 라는 키워드를 만났을 때) -> global 멤버변수 할당
		// 3. 생성된 객체의 주소값을 대입
		System.out.println(fc.global);
		
		// System.out.println(fc.local);
		
		fc.checkVariable(10); // checkVariable호출 => parameter(매개변수) 초기화
		// 호출종료 => parameter, local 지역변수 소멸
		
		System.out.println(fc.global);
		fc = null;
		//System.out.println(fc.global);
		
		System.out.println(FieldController.str);
		
		System.out.println(Math.random());
		System.out.println(Arrays.toString(new int[2]));
		
	}
	
	
	

}
