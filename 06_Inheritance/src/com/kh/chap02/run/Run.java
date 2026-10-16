package com.kh.chap02.run;

import com.kh.chap02.model.dto.Bracelet;
import com.kh.chap02.model.dto.PrinceGoldCrown;
import com.kh.chap02.model.dto.Shoes;
import com.kh.chap02.model.dto.SwedenGoldCrown;

public class Run extends Object {
	
	public static void main(String[] args) {
		PrinceGoldCrown pgc = new PrinceGoldCrown();
		pgc.setName("금관총 금관");
		System.out.println(pgc.getName());
		
		SwedenGoldCrown sgc = new SwedenGoldCrown("서머시기 금관", 8.0, 80);
		System.out.println(sgc.info());
		
		Bracelet b = new Bracelet("팔찌", 120.0, 12.0);
		System.out.println(b.info());
		
		Shoes s = new Shoes();
		s.setName("신발");
		System.out.println(s.getName());
		
		// s.
		
		/*
		 * 상속
		 * 
		 * - 중복이 발생하는 부분을 공통의 클래스로 뽑아서 관리
		 * => 코드를 적게쓰고 새 클래스를 만들 수 있음 => 생산성 향상, 가독성 향상
		 * 
		 * 단점 : 객체간의 결합도가 높아짐
		 * 
		 * 오늘날은 상속보다 합성(Composition)을 통해 구현하는 것을 권장
		 * 
		 * 상속의 특징
		 * 
		 * - 자바는 클래스간의 다중상속을 지원하지 않음(단일 상속만 가능)
		 * - 명시되어있지는 않지만 자바의 모든 클래스는 Object라는 클래스의 후손 클래스
		 * 
		 * => 모든 객체는 Object클래스에 존재하는 멤버를 사용할 수 있음
		 * => Object클래스에 존재하는 메소드가 마음에 안든다?
		 * => 메소드를 재정의 할 수 있음
		 */
	}
	
	

}
