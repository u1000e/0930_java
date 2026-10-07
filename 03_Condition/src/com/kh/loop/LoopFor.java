package com.kh.loop;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LoopFor { // 반복문
	
	public void method0() {
		//System.out.println("주목!!!!!");
		// 100번
		for(
			int i = 0;
			i < 123457;
			i++
		   ) {
			System.out.println(i + 1 + "번 반복");
		}
	}
	
	/*
	 * for문
	 * 
	 * for() {}
	 * 
	 * 초기식; 조건식; 증감식    세 가지의 요소로 구성
	 * 
	 * for(int i = 0; i < 5; i++){
	 * 		반복 돌릴 코드;
	 * }
	 * 
	 * - 초기식 : 반복문을 시작할 때 "초기에 단 한번만 실행"될 구문
	 * 			반복을 할 때 필요한 변수를 선언하고 초기화를 하는 구문(제어변수) => int i = 0;
	 * 
	 * - 조건식 : "반복문이 실행될 조건"을 작성하는 구문
	 * 			 조건식의 결과가 true일 경우 Scope내부로 진입
	 * 			 조건식의 결과가 false일 경우 Scope밖으로 빠져나감 => i < 5;
	 * 
	 * - 증감식 : "반복문을 제어하는 제어변수에 대입된 값"을 증감하는 구문
	 * 			 꼭 그래야하는 것은 아니지만 보통 초기식에서 선언된 변수를 가지고 증감식 작성
	 * 			 이 때, 보편적으로 증감연산자를 사용
	 */
	public void method1() {
		

		// 지인짜로 단순하게
		// 1
		// 2
		// 3
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		*/
		//System.out.println("1\n2\n3");
		for(/* 1 */int i = 1; /* 2 */i <= 3; /* 4 */i++) {
			/* 3 */System.out.println(i);
		}
		// 제어변수명은 보편적으로 i, j, k
		for(int i = 0; i < 10; i+=4) {
			System.out.println(i);
		}
		for(int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
	}
	
	
	public void gugudan() {
		// ☆ 이번주 목표 내일까지 배열 끝내기 ★
		
		// 구구단 출력해주는 프로그램
		// 2 			... 	9
		// 2 X 1 = 2		 9 X 1 = 9
		// 2 X 2 = 4		 9 X 2 = 18
		// ... 				
		// 2 X 9 = 18		 9 X 9 = 81
		
		// 사용자에게 정수를 입력받아서 
		// 입력받은 정수의 단을 출력해보기
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 외자");
		System.out.print("몇 단을 출력하시겠어요 > ");
		int dan = sc.nextInt();
		System.out.println(dan + "단을 출력하겠습니다.");
		
		/*
		if(dan == 2) {
			// 사용자가 입력한 정수가 2라면
			System.out.println("2 X 1 = 2");
			System.out.println("2 X 2 = 4");
			System.out.println("2 X 3 = 6");
			System.out.println("2 X 4 = 8");
			System.out.println("2 X 5 = 10");
			System.out.println("2 X 6 = 12");
			System.out.println("2 X 7 = 14");
			System.out.println("2 X 8 = 16");
			System.out.println("2 X 9 = 18");
		} else if(dan == 7) {
			// 사용자가 입력한 정수가 7이라면
			System.out.println("7 X 1 = 7");
			System.out.println("7 X 2 = 14");
			System.out.println("7 X 3 = 21");
			System.out.println("7 X 4 = 28");
			System.out.println("7 X 5 = 35");
			System.out.println("7 X 6 = 42");
			System.out.println("7 X 7 = 49");
			System.out.println("7 X 8 = 56");
			System.out.println("7 X 9 = 63");
		}
		*/
		/*
		System.out.println(dan + " X 1 = " + (dan * 1));
		System.out.println(dan + " X 2 = " + (dan * 2));
		System.out.println(dan + " X 3 = " + (dan * 3));
		System.out.println(dan + " X 4 = " + (dan * 4));
		System.out.println(dan + " X 5 = " + (dan * 5));
		System.out.println(dan + " X 6 = " + (dan * 6));
		System.out.println(dan + " X 7 = " + (dan * 7));
		System.out.println(dan + " X 8 = " + (dan * 8));
		System.out.println(dan + " X 9 = " + (dan * 9));
		*/
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
		/*
		IntStream.rangeClosed(1, 9)
				 .forEach(i -> System.out.println("%d X %d = %d".formatted(dan, i, dan * i)));
				 */
		/*
		String gugudan = IntStream.rangeClosed(1, 9)
								  .mapToObj(i -> "%d X %d = %d".formatted(dan, i, dan * i))
								  .collect(Collectors.joining("\n"));
		
		System.out.println(gugudan);
		*/
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
