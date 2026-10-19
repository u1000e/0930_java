package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.EnterFiveException;

public class UncheckedException {
	public void divZero() {
		/*
		System.out.println("천천히");
		System.out.println(10 / 0);  
		System.out.println("합시다잉");
		*/
		// ArithmeticException
		// 사용자에게 두 개의 정수값을 입력받아서 나눗셈을 한 뒤 결과를 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("나누기 프로그램입니다.");
		System.out.print("첫 번째 정수를 입력해주세요 > ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력해주세요(제발 0은 입력하지말아주세요) > ");
		int num2 = sc.nextInt();
		
		/*
		if(num2 != 0) {
			System.out.println("나눗셈 결과 : " + num1 / num2);
		} else {
			System.out.println("0은 나누기 연산을 수행할 수 없습니다.");
		}
		*/
		// 예외처리 : 예외상황을 감지하고 예외상황 발생 시
		//			 프로그램이 비정상적인 종료가 되는것을 방지하고 적절한 대응 조취를 취하는 모든 절차
		/*
		 * 예외처리 구문
		 * 
		 * try ~ catch문
		 * try {
		 * 		num1 / num2 <= 예외가 발생할수도 있는 구문
		 * } catch(발생할예외클래스명 변수명) {
		 * 		해당 예외가 발생했을 때 실행할 구문
		 * }
		 */
		try {
			System.out.println("연산 결과 : " + num1 / num2);
			System.out.println("참 잘했어요!");
		} catch(ArithmeticException e) {
			// e.printStackTrace();
			System.out.println("두 번째 정수에 0을 입력할 수 없습니다.");
		}
		sc.close(); // 자원반납 => 개발자들끼리 약속
		System.out.println("메소드 호출 끝!");
	}
	
	public void input() {
		// 정수를 입력받고 싶은데 => 사용자가 실수 또는 문자열을 입력했다.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 추가하기");
			System.out.println("2. 삭제하기");
			System.out.println("3. 종료하기");
			System.out.print("1번 또는 2번을 선택해주세요 > ");
			int menu = 0;
			// InputMismatchException
			// String menu = sc.nextLine();
			try {
				menu = sc.nextInt();
			} catch(InputMismatchException e) {
				e.printStackTrace();
				System.out.println("숫자를 입력하세요.");
			}
			sc.nextLine();
			System.out.println(menu + "번을 선택하셨습니다.");
		}
	}
	/*
	 * 프로그램 실행 시 발생하는 예외들
	 * 
	 * ArithmeticException : 나누기 연산을 0으로 나누면 발생하는 예외
	 * InputMismatchException : 입력버퍼의 값이 자료형과 일치하지 않을 때 발생하는 예외
	 * NullPointerException : 주소값이 있을것이라 예상하고 객체를 참조했더니 null값일 경우 발생하는 예외
	 * ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스에 접근할 때 발생하는 예외
	 * ClassCastException : 허용할 수 없는 형변환을 진행할 경우 발생하는 예외
	 * ...
	 * 
	 * 개발자가 예측할 수 있음
	 * RumtimeException
	 */
	public int multiCatch() {
		Scanner sc = new Scanner(System.in);
		// 사용자에게 정수값을 하나 입력받아서
		// 100을 사용자가 입력한 정수값으로 나눈 결과를 반환
		System.out.print("정수를 입력하시오  > ");
		/*
		try {
			int num = sc.nextInt();
		} catch(InputMismatchException e) {}
		sc.close();
		// sc.nextLine();
		try {
			return (100 / num);
		} catch(ArithmeticException e) {}
		*/
		try {
			int num = sc.nextInt();
			// sc.close();
			return (100 / num);
		} catch(InputMismatchException e) {
			System.out.println("숫자값을 입력해주세요.");
			// sc.close();
			return 0;
		} catch(ArithmeticException e) {
			System.out.println("0이 아닌 정수값을 입력하세요.");
			return 0;
		} finally { // 리턴 직전에 항상 무조건 finally블럭 부터 수행
			sc.close();
		}
		// sc.close();
	}
	
	public void orderByCatch() {
		// 배열
		// 사용자에게 정수값을 입력받아서   							--> 1
		// 입력받은 만큼의 크기를 가진 배열을 생성 및 할당받고				--> 2
		// 이 배열의 100번째 인덱스에 대입되어있는 기본값을 출력하시오.		--> 3
		// 실습 => 시작
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 > ");
		
		// InputMismatchException : 스캐너 메소드의 자료형과 일치하지 않는다면
		// NegativeArraySizeException : 배열의 크기를 음수로 할당하려고 하면
		// ArrayIndexOutOfBoundsException : 배열의 크기보다 큰 인덱스에 접근하면
		
		try {
			int num = sc.nextInt();			// --> 1
			int[] nums = new int[num];		// --> 2
			System.out.println(nums[100]);	// --> 3
		} catch(InputMismatchException e) {
			System.out.println("흑흑");
		} catch(RuntimeException e) {
			System.out.println("이게 뭘까~~~요?");
		} 
		sc.close();
	}
	
	public void bomb() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 > ");
		int num = sc.nextInt();
		// 절대로 num에 5가 들어와선 안됨!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		if(num == 5) {
			throw new EnterFiveException("사용자가 5를 입력함!! 비상비상!!! 5가 입력됨!!!!!!!! 큰일남!!");
		}
	}
	
}
