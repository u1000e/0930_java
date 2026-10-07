package com.kh.operator.controller;

import java.util.Scanner;

public class OperatorController {
	
	public void arithmetic() {
		// 산술연산자 -> 이항연산자
		// +, -, *, / => 우선순위가 수학익힘책이랑 똑같음
		// % : 모듈러(Modular) => 나눗셈에서의 나머지를 구하는 연산
		int firstNum = 10;
		int secondNum = 3;
		System.out.println("first : " + firstNum);
		System.out.println("second : " + secondNum);
		// * 실습 -> com.kh.run 패키지를 만든 후 Run클래스 및 main메소드를 선언한 뒤 
		//          main메소드에서 arithmetic메소드를 호출하여 콘솔에 위 두 줄을 출력하기 시작!
		
		System.out.println("first + second : " + firstNum + secondNum);
		
		System.out.println("first + second : " + (firstNum + secondNum));
		int sum = firstNum + secondNum;
		System.out.println("first + second : " + sum);
		System.out.print("first + second : ");
		System.out.println(firstNum + secondNum);
		System.out.printf("%d + %d : %d",firstNum, secondNum, firstNum + secondNum);
		System.out.println();
		
		System.out.println("first - second : " + (firstNum - secondNum));
		
		System.out.println("first X second : " + (firstNum * secondNum));
		System.out.println("first / second : " + (firstNum / secondNum));
		System.out.println("first mod second : " + (firstNum % secondNum));
		
		
		System.out.println(10 / 0);
	}
	
	// 고려은단 개수 구하기 프로그램 구현하기 실습
	// 메소드명 : presentToStudent()
	
	// 1. 출력문을 이용하여 사용자에게 값을 입력받으세요. <= Scanner
	// 1_1. 고려은단 비타민씨를 받을 학생의 수
	// 1_2. 나눠줄 수 있는 비타민의 개수
	
	// 2. 방금 배운 산술연산자를 이용하여 결과값을 출력하세요.
	// 2_1. 1인당 받을 수 있는 비타민의 개수
	// 2_2. 남은 비타민의 개수
	
	// 실습 시작
	public void presentToStudent() {
		// System.out.println("잘됨??");
		Scanner sc = new Scanner(System.in);
		// 몇 명한테 비타민을 나눠줄 것인가??
		System.out.println("학생 수를 입력하세요 > ");
		int studentCount = sc.nextInt();
		// System.out.println("입력받은 학생 수 : " + studentCount);
		
		System.out.println("나눠줄 비타민 개수를 입력하세요 > ");
		int vitaminCount = sc.nextInt();
		// System.out.println("입력받은 비타민 수 : " + vitaminCount);
		System.out.println("한 사람 당 받을 수 있는 비타민의 개수 : " + (vitaminCount / studentCount));
		System.out.println("남는 비타민의 개수 : " + (vitaminCount % studentCount));
	}
	
	public void increase() {
		/*
		 * 증감연산자 : 단항연산자로 한 번에 1증가하거나 / 1감소하는 연산을 함
		 * 
		 * [ 표현법 ] : ++ 값을 1증가 시킴
		 * 			  -- 값을 1감소 시킴
		 * 
		 * 증감을 먼저 할건지, 아니면 나중에 할건지에 따라서 연산자의 위치가 달라짐
		 * 전위연산 / 후위연산
		 */
//		int num = 10;
//		System.out.println(num);
//		num++;
//		System.out.println(num);
//		num--;
//		System.out.println(num);
//		System.out.println(num++);
//		System.out.println(num);
		
		int a = 10;
		int b = a++;
		// 변수에 대해서 얼마나 잘 이해하고 있는가?
		System.out.println("a : " + a); // 11
		System.out.println("b : " + b); // 10
		
		// 1번 84행
		// 1. a라는 식별자를 가진 int형 변수공간을 할당
		// 2. 정수형 리터럴 값 10
		// 3. 대입
		
		// 2번 85행
		// 1. b라는 식별자를 가진 int형 변수공간을 할당
		// 2. a라는 변수공간에 대입된 리터럴 값을 가져옴
		// 3. a라는 변수공간의 값을 1증가
		// 4. 가져온 리터럴 값을 b공간에 초기화
		int c = 10;
		int d = ++c;
		
		System.out.println(c); // 11
		System.out.println(d); // 11
	}
	
	public void compound() {
		// = 대입연산자
		long veryBigNumberCount = 1000L;
		veryBigNumberCount = veryBigNumberCount + 1658;
		// 복합 대입 연산자 => +=, -=, *=, /=, %=
		// 자기자신과 해당 산술연산을 수행한 후 그 결과를 자기자신에게 다시 대입하는 용도
		veryBigNumberCount += 1;
		System.out.println(veryBigNumberCount);
	}
	
	public void logicalNagation() {
		// 논리 부정 연산자 : 논리값 (true, false)을 반대로 바꿔주는 연산자
		System.out.println(!!!true);
	}
	
	public void comparison() {
		/*
		 * 관계연산자(비교 연산자)
		 *
		 * 두 개의 값을 가지고 비교하는 이항 연산자
		 * 비교연산을 한 결과 -> true, false
		 * 특정 조건을 제시할 수 있는 조건문에서 조건식으로 사용할 것
		 * 
		 * 종류
		 * 
		 * 1. 동등비교 : 일치함을 비교
		 * a == b : a와 b가 일치합니까?
		 * a != b : a와 b가 일치하지 않습니까?
		 * 
		 * 2. 대소비교 : 크고작음을 비교
		 * a < b  : a가 b보다 작습니까?
		 * a > b  : a가 b보다 큽니까?
		 * a <= b : a가 b보다 작거나 같습니까? 
		 * a >= b : a가 b보다 크거나 같습니까?
		 * 
		 * 결과값은 항상 true / false
		 */
		// System.out.println(1 == 2);
		
		int firstNum = 10;
		int secondNum = 25;
		
		System.out.println(firstNum < secondNum);
		System.out.println(firstNum == secondNum);
		
		System.out.println("firstNumber가 짝수입니까?");
		// true
		// 1번 짝수 확인방법 => 연산
		// 짝수 홀수 구분법 ==> 제일 쉬운방법 ==> 2로 나눴을 때 나머지가 0과 같음 ==> 짝수
		
		//System.out.println(true);
		System.out.println((firstNum % 2) == 0);
	}
	
	public void logical() {
		/*
		 * 논리 연산자 : 두 개의 논리값을 연산하는 연산자
		 * 
		 * [ 표현법 ]
		 * 
		 * 논리값 논리연산자 논리값 => 논리값
		 * 
		 * 종류
		 * 
		 * 1. AND 연산
		 * 좌항과 우항의 값이 모두 true여야만 최종 결과값이 true
		 * 
		 * 2. OR 연산
		 * 좌항과 우항의 값이 하나라도 true일 경우 최종 결과값이 true
		 */
		// 사용자에게 한 개의 정수값을 입력받음
		// 입력한 정수 값이 0보다 크면서 짝수인지 판별
		// 결과를 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 > ");
		int num = sc.nextInt();
		//System.out.println(num > 0);
		//System.out.println(num % 2 == 0);
		boolean result = (num > 0) && (num % 2 == 0);
		System.out.print("입력값이 0보다 크면서 짝수입니까? > " + result);
	}
	
	public void andOper() {
		// 사용자에게 값을 입력받을 때 필요한 도구를 선언
		Scanner sc = new Scanner(System.in);
		// 사용자에게 정수값을 하나 입력 받은 후
		System.out.println("정수 값을 하나만 입력해보아요~~ > ");
		// 입력받은 정수값을 변수에 대입하고
		int num = sc.nextInt();
		// 콘솔창에 출력해보세요.
		System.out.println("입력한 정수값 : " + num);
		// 사용자가 입력한 정수가 1 ~ 5 사이의 값인지 확인해서 출력하기
		// 1. 값, 2. 연산
		// 1 : 사용자가 입력한 값, 1, 5
		// 2 : 대소비교연산  1 <= 사용자가 입력한 값 <= 5
		// System.out.println(1 <= num <= 5);
		boolean result = num >= 1 && num <= 5;
		System.out.println("입력값이 1부터 5사이의 값인가요 > " + result);
	}
	
	public void orOper() {
		// 사용자에게 한 글자를 입력 받아서
		// 입력받은 글자가 'A' 또는 'a'인지 확인해서 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("한 글자만 입력하세요 > ");
		char letter = sc.nextLine().charAt(0); // index : 0부터시작
		System.out.println(letter);
		
		// 1. 값  => 'a', 'A', 사용자가입력한 한 글자
		// 2. 연산 => 동등비교연산 == 
		boolean result = (letter == 'a') || (letter == 'A');
		System.out.println("사용자가 입력한 값이 에이인가요 > " + result);
	}
	public void tip() {
		int num = 10;
		boolean result = false && (num > 0);
		boolean result2 = num < 0 && num == 10;
	}
	/*
	 * 삼항 연산자 : 피 연산자가 3개
	 * => 3개의 값과 1개의 연산자로 구성됨(조건문의 형식으로 사용됨)
	 * 
	 * 조건문 : 값에 따라 연산을 처리하는 방식
	 * 		   결과값이 true일 경우 첫 문장을 처리~~
	 *         결과값이 false일 경우 다음 문장을 처리~~
	 */
	public void triple() {
		// 조건식 ? 조건식이 true일경우 결과값 : 조건식이 false일 경우 결과값
		// 영화루 => 메뉴판
		System.out.println("영화루에 오신것을 환영합니다.");
		System.out.println("--- 메뉴를 선택해주세요 ---");
		System.out.println("1. 고추간짜장");
		System.out.println("2. 고추짬뽕");
		System.out.print("번호를 입력해주세요 > ");
		// 계획
		// 사용자가 메뉴번호로
		// 1번을 입력하면 고추간짜장을 주문하셨습니다.
		// 2번을 입력하면 고추짬뽕을 주문하셨습니다.
		// 하고 출력
		Scanner sc = new Scanner(System.in);
		int menuNo = sc.nextInt();
		// System.out.println(menuNo);
		
		String selected = menuNo == 1 ? "고추간짜장을 주문하셨습니다."
						: menuNo == 2 ? "고추짬뽕을 주문하셨습니다."
						: "없는 메뉴입니다.";
		
		System.out.println(selected);
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
