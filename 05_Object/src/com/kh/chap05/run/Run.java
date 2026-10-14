package com.kh.chap05.run;

import com.kh.chap05.model.dto.Member;

public class Run {

	public static void main(String[] args) {
		// 생성자
		// 웹사이트를 만들면 회원의 정보를 저장해야함
		// 회원정보를 저장할 자료형이 딱히 없네? => 오케이 그럼 내가 하나 만들어서 써야겠다
		Member member = new Member(); // 멤버객체가 생성됨 => 회원 가입이 발생
					  // 객체생성 => new
					  // 1. 힙에 덩어리 생성, 필드 전부 기본값
					  // 2. 생성자 실행
					  // 3. 참조값 반환
		member.setUserId("user");
		System.out.println(member.info());
		// member.setUserId("123123");
		
		Member member1 = new Member("user01");
		System.out.println(member1.info());
		
		Member member2 = new Member("user02", "pass02");
		System.out.println(member2.info());
		
		Member member3 = new Member("홍길동", "user05", "1234");
		System.out.println(member3.info());
		

	}
}
