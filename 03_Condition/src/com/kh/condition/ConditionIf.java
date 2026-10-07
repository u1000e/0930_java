package com.kh.condition;

import java.util.Scanner;

public class ConditionIf {
	/*
	 * (단일)if문
	 * 
	 * if(조건식) {
	 * 		조건식이 참일 경우 실행하고자 하는 코드;
	 * }
	 * => 조건식의 결과값이 false일 경우 : if문 Scope({})를 건너뜀
	 * => 조건식의 결과값이 true일 경우 : if문 Scope({}) 안의 코드가 수행
	 */
	public void method0() {
		// System.out.println("실습 : 메소드를 불러보세요~ 시작!");
		/*
		if(false) {
			System.out.println("나는 if문 이다");
		}
		*/
		
		if(true) {
			System.out.println("세상만사 문제없음");
		}
		if(false) {
			System.out.println("세상만사 문제있음");
		}
		// 예시
		// 온도를 조절 습도를 조절
		double temperature = 0.0;
		// 30도를 유지~~~~
		if(temperature < 30.0) { // 조건식 자리에는 결론적으로 true / false값이 들어가도록 구현한다!
			System.out.println("물트는 코드 또는 메소드호출~~");
		}
	}
	
	public void quiz() {
		
		int count = 0; // 정답 개수를 저장할 용도의 변수
		int wrongCount = 0; // 오답 개수를 저장할 용도의 변수
		System.out.println("잼컨만들기");
		// 정답입니다~ 또는 오답입니다~를 출력해주는 퀴즈 프로그램
		System.out.println("---------------------------------");
		// 문제를 출력한 뒤
		System.out.println("문제 : 토마토는 과일일까요?");
		// 사용자에게 o 또는 x를 입력받아서
		Scanner sc = new Scanner(System.in);
		System.out.print("정답을 o 또는 x로 입력하세요 > ");
		char answer = sc.nextLine().charAt(0);
		// x를 입력했을 때 정답입니다~~
		if(answer == 'x' || answer == 'X') {
			System.out.println("정답입니다요~~");
			count++;
		}
		/*
		if(answer == 'X') {
			System.out.println("정답입니다요~~");
		}
		*/
		// o를 입력했을 때 오답입니다~~
		if(answer == 'o' || answer == 'O') {
			System.out.println("오답입니다요~~ㅠㅠ");
			wrongCount++;
		}
		
		// 킹우의 수
		// => x,X,o,O 48개
		//    0 ~ 9, !@#$%^&*(), ㄱ-ㅎ, ㅏ-ㅣ, 한자, 히라가나~~
		if((answer != 'X') && (answer != 'x') && (answer != 'O') && (answer != 'o')) {
			System.out.println("O 또는 X를 입력하세요.");
			wrongCount++;
		}
		
		System.out.println("문제 : 기린은 서서 잠을 잔다.");
		System.out.print("정답을 o / x로 입력해주세요 > ");
		answer = sc.nextLine().charAt(0);
		
		if(answer == 'O' || answer == 'o') {
			System.out.println("정답이예용~~");
			count++;
		}
		if(answer == 'X' || answer == 'x') {
			System.out.println("오답이예용~~");
			wrongCount++;
		}
		if(!(answer == 'O' || answer == 'o' || answer == 'X' || answer == 'x')) {
			System.out.println("O 또는 X를 입력하세요.");
			wrongCount++;
		}
		
		// 두 문제밖에 없음
		
		// 문제 풀이가 끝난 후
		// 정답개수와 오답개수를 출력해줄 것
		System.out.println("퀴즈 끝~~~ 오늘의 결과 !");
		System.out.println("정답 : " + count + "개");
		System.out.println("오답 : " + wrongCount + "개");
		
		// ☆ 숙제 1 ☆
		// 오늘의 퀴즈쇼에 퀴즈 3개 더 추가하기
		// 퀴즈 3개 추가하면서 기존의 if문을 if else문으로 변경하기
	}
	
	
	
	
	
	
	
	
	
	
	

}
