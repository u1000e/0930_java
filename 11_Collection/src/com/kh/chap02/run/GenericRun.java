package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap02.model.Box;
import com.kh.chap02.model.dto.Mall;

public class GenericRun {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		/*
		list.add("하이~");
		list.add(1);
		list.add(true);
		
		// 꺼낼때 불편함
		String text = (String)list.get(0);
		Integer number = (Integer)list.get(1);
		int num = number.intValue();
		*/
		/*
		StringBox sb = new StringBox();
		sb.set("하하");
		String s = sb.get();
		IntegerBox ib = new IntegerBox();
		ib.set(123213);
		int i = ib.get();
		*/
		Box box = new Box();
		box.set(1);
		box.set("하하");
		box.set(new Mall("스타필드", "고양"));
		
		Box<String> b = new Box();
		b.set("타입");
		// b.set(123213);
		String str = b.get();
		
		Box<Mall> m = new Box();
		// 제네릭 : 타입지정을 컴파일 시점에 체크하는 것
		m.set(new Mall("스타필드", "하남"));
		// m.set("이건??");
		Mall e = m.get();
		/*
		 * 개발자들끼리의 암묵적인 약속
		 * 
		 * T -> Type		==>> 아무타입이나 OK
		 * E -> Element		==>> 요소라는 의미를 적을 땐 E로 적자
		 * N -> Number		==>> 숫자타입만 적게하자~
		 * R -> Return		==>> 반환타입
		 * K -> Key			==>> Map의 Key타입
		 * V -> Value		==>> Map의 Value값
		 */
		// LinkedList
		List<Mall> malls = new ArrayList();
		malls.add(new Mall("스타필드", "하남"));
		malls.add(new Mall("스타필드", "고양"));
		// malls.add
		
		//Mall mall = malls.get(0);
		/*
		for(Object mall : malls) {
			System.out.println(((Mall)mall).getBrand());
		}
		*/
		for(Mall mall : malls) {
			System.out.println(mall.getBrand());
		}
		
		// 1. 다룰 요소의 타입을 제한할 수 있음 => 실수를 줄일 수 있음
		// 2. 매 번 형변환하는 절차를 없앨 수 있음 => 코드 작성할 때 편함
	}
	
	
	
	
	
	
	
	
	
	
	

}
