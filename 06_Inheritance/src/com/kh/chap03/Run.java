package com.kh.chap03;

import com.kh.chap03.model.dto.Beverage;
import com.kh.chap03.model.dto.Coffee;
import com.kh.chap03.model.dto.Juice;
import com.kh.chap03.model.dto.Water;

public class Run {

	public static void main(String[] args) {
		Beverage b = new Beverage("마실거", "300ML", "검은색");
		System.out.println(b.info());
		Water w = new Water("삼다수", "500ML", "투명", "한라산");
		System.out.println(w.info());
		Coffee c = new Coffee("아메리카노", "1L", "갈색", "자바원두");
		System.out.println(c.info());
		
		System.out.println(b);
		System.out.println(b.toString());
		// toString : 해당 객체의 FullClassName + @ + 메모리의주소값을 기반으로 만든 10진수를 16진수 형태로 변경한 문자열
		// 1. 모든 클래스는 Object클래스를 상속받고 있음
		// 2. 모든 참조자료형 변수는 toString()를 호출할 수 있음
		System.out.println("-----------------------");
		System.out.println(c);
		System.out.println(w);
		
		System.out.println("-----------------------");
		
		
		Juice j = new Juice("델몬트오렌지쥬스", 5000);
		System.out.println(j);
		
	}
}






