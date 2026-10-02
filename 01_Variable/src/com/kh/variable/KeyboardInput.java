package com.kh.variable;

import java.util.Scanner; // 1절 끝

public class KeyboardInput {
	/*
	 * 키보드를 이용해서 사용자에게 직접 값을 입력받아 볼 것
	 * 
	 * 남산돈까스 => 메뉴판
	 * 
	 * 자바에서 제공해주는 Scanner라는 클래스를 사용합시다!!!
	 * Scanner클래스에 존재하고 있는 메소드들을 호출해서 입력을 받을 수 있음
	 */
	public void inputInfo() {
		// System.out.println("부르기 성공");
		Scanner sc = new Scanner(System.in);
		// System.in : 표준 입력도구에서 입력받은 값들을 받겠다.(바이트 단위)
		// sc.next();
		
		System.out.println("25년 전통의 오리지널 메뉴");
		System.out.println("맛도 두 배 크기도 두 배");
		System.out.println("------메뉴판------");
		System.out.println("매운 페퍼로니 치즈돈까스");
		System.out.println("남산 왕 돈까스");
		System.out.println("철판 함박 스테이크");
		System.out.println("=================");
		System.out.print("주문하실 메뉴를 입력해주세요 > ");
		// next() : 사용자가 입력한 값 중 공백이 있을경우 공백문자 이전까지만 입력받음
		String menu = sc.next();
		
		// 사용자가 입력한 메뉴를 출력 => 남산왕돈까스를 주문하셨습니다.
		System.out.println(menu + "를 주문하셨습니다.");
		
		System.out.print("몇 개 주문하시겠습니까?(숫자로 입력해주세요) >  ");
		int count = sc.nextInt(); // nextInt() => Int 
		System.out.println(menu + "를 " + count + "개 주문하셨습니다.");
		
		sc.nextLine();
		// 사실 배달어플
		System.out.print("주소지를 입력해주세요 > ");
		String address = sc.nextLine();
		
		System.out.println(menu + " " + count + "개를 " + address + "로 배달합니다.");
	}
	
	
	
	
	
	/*
	 * 주말 숙제
	 * 
	 * 1번 집에다가 개발환경 세팅하기
	 * 
	 * 2번 남산돈까스 만든거 참고해서 우리동네 내가 좋아하는 음식점 키오스크 만들기 
	 * 
	 * 		↑ 음식점 3군데 만들기 복붙하지 말것 열심히 타이핑 할것
	 * 
	 * 3번 영문타자 열심히 연습하기
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
