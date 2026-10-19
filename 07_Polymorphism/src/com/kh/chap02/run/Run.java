package com.kh.chap02.run;

import com.kh.chap02.model.dto.Cook;
import com.kh.chap02.model.dto.Event;
import com.kh.chap02.model.dto.Main;
import com.kh.chap02.model.dto.Salad;
import com.kh.chap02.model.factory.CookFactory;
import com.kh.chap02.model.fried.Fried;

public class Run {
	
	public static void main(String[] args) {
		
		Main m = new Main("조규철");
		//m.cooking();
		Salad s = new Salad("이승철");
		//s.cooking();
		//Cook c = new Cook("요리사"); // 추상클래스로 선언되었기때문에 객체 생성이 불가능
		//c.cooking();
		
		Cook[] c = {m, s, new Event("이벤트왕")};	// 다형성 적용
		for(int i = 0; i < c.length; i++) {
			//c[i].cooking();
		}
		// 추상화란 => 요구사항들 중에서 공통점을 찾고, 공통점에서 필요없는것 제거
		// 정보은닉
		
		//JjamBbong jb = new JjamBbong(); 
		//jb.makeJjamBbong(); // 짬뽕클래스에 의존적인 코드
		
		//Jajang jj = new Jajang();
		// jj.makeJajang();
		
		// FriedRice, FriedPork
		
		// 타입 은닉
		// Fried f = new FriedRice();
		// f.fried();	// Fried클래스에 의존
		// f = new FriedPork();
		// f.fried();
		CookFactory cf = new CookFactory(); // 1. 교체와 변경이 쉬워짐
		Fried f = cf.create();				// 2. 또 다른 Fried타입을 추가하는것도 쉬워짐
		f.fried();						    // CookFactory를 거치면 모두 다 같은 Fried로 취급
		
		// 다형성 : 부모타입으로 상속받은 다양한 자식 객체를 다룰 수 있는 기술
		// 의존성주입할 때 처음부터 다시 설명해드림
		// => 정보은닉을 통한 유연성 확보
		/*
		 * 1. 코드의 수정이 쉬움
		 * 2. 기능의 추가가 쉬움
		 * 3. 기능의 교체도 쉬움
		 */
		
		
		
	}
	
	
}
