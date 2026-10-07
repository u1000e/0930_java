package com.kh.condition;

import java.util.Scanner;

public class ConditionElse {
	/*
	 * if ~ else
	 *
	 * [ 표현법 ]
	 * 
	 * if(조건식) {
	 * 		조건식의 결과값이 true일 경우 실행할 코드 - a
	 * } else {
	 * 		조건식의 결과값이 false일 경우 실행할 코드 - b
	 * }
	 * 조건식의 결과가 true -> a실행
	 * 조건식의 결과가 false -> b실행
	 */
	public void method1() {
		// 우리가 뭔가 응모를 했다고 가정
		// 핸드폰 번호를 입력받아서 당첨자 번호와 같으면 추카포카를 출력
		// 아니면 다음기회에를 띄워주는거고
		// 010-7777-7777 => 당첨자 번호다
		
		// ctrl + shift + o => 임포트 자동완성
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰번호를 입력해보세요 > ");
		String phoneNumber = sc.nextLine();
		// System.out.println(phoneNumber == "010-7777-7777");
		
		// 1. 어떤값을 가지고			사용자가 입력한 폰번호 == phoneNumber / "010-7777-7777"
		// 2. 어떤 연산				동등비교
		// ==(동등비교연산자)의 경우 기본타입자료형 8개끼리만 사용가능
		//System.out.println(phoneNumber.equals("010-7777-7777"));
		// 아 문자열 값끼리의 비교를 하고싶다. == equals() 메소드를 호출해서 비교해야함
		//								문자열 값이 일치하면 true / 일치하지않으면 false
		if(phoneNumber.equals("010-7777-7777")) { // 조건식이 true일 시
			System.out.println("당첨입니다~ 추카포카링~~");
		} else {	// 조건식이 false일 시
			System.out.println("꽝 아쉽지만 다음기회에~~");
		}
		/*
		if(!phoneNumber.equals("010-7777-7777")) {
			System.out.println("꽝 아쉽지만 다음기회에~~");
		}
		*/
	}
	/*
	 * if ~ else if문
	 * 
	 * [ 표현법 ]
	 * 
	 * if(조건식1) {
	 * 		조건식1이 true일 경우 실행;
	 * } else if(조건식2) {
	 * 		조건식2가 true일 경우 실행;
	 * } else if(조건식3) {
	 *		조건식3이 true일 경우 실행; 
	 * } else {
	 *		앞에서 기술했던 모든 조건들이 false일 경우 실행; 		
	 * }
	 */
	public void method2() {
		// 핸드폰 뒷자리만 입력받아서 1등, 2등, 3등 아쉽지만 미당첨 출력해주기
		//						1234, 5678, 1111
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 번호 뒷자리를 입력해주세요 > ");
		// String
		String phoneNumber = sc.nextLine();
		// System.out.println("사용자가 입력한 폰번호 : " + phoneNumber);
		// 1번 : phoneNumber, "1234"
		// 2번 : 동등비교연산 => equals()
		if(phoneNumber.equals("1234")) {
			System.out.println("1등이예용~~~");
		} else if(phoneNumber.equals("5678")) {
			System.out.println("2등이예용~~~");
		} else if(phoneNumber.equals("1111")) {
			System.out.println("3등이예용~~");
		} else {
			System.out.println("아쉽지만 다음기회에~~~");
		}
	}
	
	public void ageCheck() {
		
		// 사용자에게 나이(정수)를 입력받고   => OK
		// 입력받은 나이에 따라서 각기 다른 내용을 출력해주세요.
		
		//  1 ~ 12 : 어린이입니다.
		// 13 ~ 17 : 청소년입니다.
		// 18 ~    : 성인입니다.
		//  0, -   : 잘 못 입력하셨습니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 > ");
		int age = sc.nextInt();
		// System.out.println(age);
		
		// 나이 1, 2, 3, 4, 5, 6, 7, 8... 100, 101, 102, 103...
		//     -1, -2, -3, -4, -5...
		// 	   217653192... 값
		
		// 연산 => 동등비교(age == 1 || age == 2|| age == 3||)
		//		  대소비교(age < 3...
		
		
		//  1 ~ 12 : 어린이입니다.
		// 13 ~ 17 : 청소년입니다.
		// 18 ~    : 성인입니다.
		//  0, -   : 잘 못 입력하셨습니다.
		/*
		if(1 <= age && age <= 12) {
			System.out.println("어린이 입니다.");
		} else if(13 <= age && age <= 17) {
			System.out.println("청소년 입니다.");
		} else if(18 <= age) {
			System.out.println("성인 입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		*/
		
		if(age <= 0) {
			System.out.println("올바른 나이를 입력하세요.");
		} else if(age >= 18) {
			System.out.println("성인입니다.");
		} else if(age <= 12) {
			System.out.println("어린이입니다.");
		} else {
			System.out.println("청소년입니다.");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
