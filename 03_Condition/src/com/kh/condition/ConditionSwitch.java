package com.kh.condition;

import java.util.Scanner;

public class ConditionSwitch {
	
	public void method0() {
		// 스위치문 공부하기!!!!
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 층 가세요?(B1 / B2 / B3) > ");
		String floor = sc.nextLine();
		
		if(floor.equals("B1")) {
			System.out.println("지하 1층입니다~");
		} else if(floor.equals("B2")) {
			System.out.println("지하 2층입니다~");
		} else if(floor.equals("B3")) {
			System.out.println("지하 3층입니다~");
		}
		
		switch(floor) {
		case "B1" : System.out.println("지하 1층입니다~"); break;
		case "B2" : System.out.println("지하 2층입니다~"); break;
		case "B3" : System.out.println("지하 3층입니다~");
		}
		/*
		 * [ 표현식 ]
		 * 
		 * switch(case문에 기술할 동등비교 대상) {
		 * case 정수, 실수, 문자, 문자열 : 실행할코드;
		 * }
		 */
	}
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 > ");
		int menuNo = sc.nextInt();
		// 1번 메뉴는 1000원 2번 메뉴는 500원 3번 메뉴는 4000원 4번 메뉴는 1000원 가정
		// 희망편
		/*
		int price = menuNo == 1 || menuNo == 4 ? 1000
				  : menuNo == 2 ? 500
				  : menuNo == 3 ? 4000
				  : 0;
		*/
		// 모던 스위치
		int price = switch(menuNo) {
		case 1, 4 -> 1000;
		case 2 -> 500;
		case 3 -> 4000;
		default -> 0;
		};
		System.out.println(menuNo + "번 메뉴는 " + price + "원 입니다.");
	}
	
	public void method2() {
		int num = 2;
		switch(num) {
		case 1 : System.out.println("1입니다요~"); break;
		case 2 : System.out.println("2입니다요~"); break;
		default : System.out.println("없습니다요~");
		}
	}
	
	
	
	
	
	
	

}
