package com.kh.loop;

import java.util.Scanner;

public class LoopWhile {
	/*
	 * while문
	 * 
	 * [ 표현식 ]
	 * 
	 * 초기식;
	 * 
	 * while(조건식) {
	 * 		증감식;
	 * }
	 * for   => 개발자가 반복을 몇 번 해야하는지 명확하게 알고 있다.
	 * while => 개발자가 반복을 몇 번 해야하는지 가늠할 수 가 없다.
	 */
	public void method0() {
		// 초기식, 조건식, 증감식
		int i = 0;
		while(i < 3) {
			System.out.println(i);
			i++;
		}
	}
	public void method1() {
		while(true) { // 무한반복
			System.out.println("이런 느낌적인느낌");
		}
	}
	
	public void method2() {
		// 1부터 10까지의 합계를 구해서 출력
		//System.out.println(1 + 2 + 3 + 4 + 5);
		//System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
		// 무지성 반복문 => 불가능 
		// 조건 => 무지성 if문 가능
		
		// 반복횟수가 정해져있음
		//초기식
		int i = 1;
		int sum = 0;
		
		while(i <= 150) {
			//증감식
			sum += i;
			i++;
		}
		// 합계 출력
		System.out.println(sum);
	}
	
	// 로또번호 만들어보기 v 0.1
	public void generateLottoNumber() {
		// 1 ~ 45 => 6개
		// random : 무작위
		// Math m = new Math();
		// System.out.println(Math.random());
		// 0.26701429695718937 => double
		// 0.828731315415426   => double
		double number = Math.random();
		// random => 0.0 ~ 0.9999999999999999
		
		//        -> 1   ~ 10
		
		// 1단계 => number에다가 10을 곱해버리면?
		System.out.println(number * 10);
		// 0.0~~ ~ 9.999999999999999
		// 2단계 => 10을 곱한결과를 int형으로 강제형변환
		System.out.println((int)(number * 10));
		// 0 ~ 9
		// 3단계 => 10을 곱한 결과에다가 int형으로 형변환을 한 뒤에 + 1을 해버림
		System.out.println((int)(number * 10) + 1);
		// 1 ~ 10
		//System.out.println((int)(number * 45) + 1);
		
		int num1 = (int)(Math.random() * 45) + 1;
		int num2 = (int)(Math.random() * 45) + 1;
		int num3 = (int)(Math.random() * 45) + 1;
		int num4 = (int)(Math.random() * 45) + 1;
		int num5 = (int)(Math.random() * 45) + 1;
		int num6 = (int)(Math.random() * 45) + 1;
		
		System.out.printf("오늘의 운세 ~ %d, %d, %d, %d, %d, %d",
						   num1, num2, num3, num4, num5, num6);
	}
	
	/*
	 * 탈출문
	 * 
	 * break => break;를 만나는 순간 가장 가까운 반복문 "한겹"을 빠져나감
	 * 
	 * switch문 내부에 작성하는 break;문과 구별해야한다!!!
	 */
	
	public void callByMethod() {
		System.out.println("메소드에서 메소드를 호출");
		// method4();
	}
	public void method4() {
		// 무한 반복을 돌리면서
		// 매 번 사용자에게 문자열을 입력받은 후
		// 입력받은 문자열의 길이를 출력
		// 단, 사용자가 입력한 문자열이 "exit"과 같다면 반복을 종료
		callByMethod();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("글자수 체크(그만하고 싶으시면 exit을 입력하세요) > ");
			String keyword = sc.nextLine();
			System.out.println(keyword + "은(는) " + keyword.length() + "글자입니다.");
			
			// 사용자가 exit을 입력했다면 반복문을 종료시키고 싶음
			if(keyword.equals("exit")) {
				//break;
				return;
			}
		}
		// System.out.println("다음에 또 만나요~~");
	}
	/*
	 * continue
	 */
	public void checkId() {
		System.out.println("회원가입 서비스입니다.");
		Scanner sc = new Scanner(System.in);
		// 사용자에게 아이디를 입력받을 것
		// 사용자가 입력한 아이디가 10글자가 넘는다! 다시 입력하게 할 것
		// 사용자가 입력한 아이디가 10글자가 안 넘는다! 다음파트로 넘어갈 것
		
		while(true) {
			System.out.println("아이디를 입력해주세요(10글자를 넘기지 말아주세요) > ");
			String userId = sc.nextLine();
			
			if(10 < userId.length()) {
				System.out.println("아이디는 10글자 이하만 사용 가능합니다.");
				continue;
			} 
			
			System.out.println("사용 가능한 아이디입니다.");
			break;
			
		}
		System.out.println("비밀번호를 입력해보세요~~");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
