package com.kh.variable;

public class Variable {
	
	// 변수 : RAM에 값을 저장하기 위한 공간
	public void printNumber() {
		
		// System.out.println(number);
		int number = 8;
		//   = 대입 연산자를 기준으로 왼쪽의 공간에 오른쪽의 값을 넣겠다.
		// System.out.println(number);
		
		// 변수를 사용하는 방법
		
		/*
		 * 변수 선언
		 * 
		 * int number;
		 * 
		 * 자료형(DataType) 변수식별자;
		 * 
		 * 권장하는 방법은 아니지만 동일한 타입의 변수를 선언할 때 한 번에 선언할 수 있음
		 */
		/*
		 * 식별자(Identifier)
		 * 
		 * 클래스명, 메소드명, 변수명 등 개발자가 만들어서 이용하는 이름
		 * 
		 * - 식별자를 만들 때 꼭 지켜야하는 규칙!
		 * 
		 * 1. keyword(예약어)는 식별자로 사용할 수 없음
		 * 2. 공백문자는 포함할 수 없음
		 * 3. 문자, 숫자, _, $을 포함할 수 있지만 숫자로는 시작할 수 없음
		 * 4. 대, 소문자를 구분하고 길이제한은 없음
		 * 
		 * - 개발자들끼리의 암묵적인 약속
		 * 
		 * 1. 클래스 / 인터페이스 명명 규칙
		 * 
		 * - 첫 글자는 반드시 대문자로 표기
		 * - 연결된 단어들의 첫 글자도 대문자로 표기
		 * - 명사, 형용사를 서술적으로 연결해서 사용
		 * 
		 * -> WelcomeToJavaWorld
		 * 
		 * 2. 변수 명명 규칙
		 * 
		 * - 명사적 의미를 갖게 만들어줌
		 * - 첫 글자를 소문자로 표기, 연결된 단어들의 첫 글자를 대문자로 표기
		 * 
		 * -> phoneNumber
		 * 
		 * 3. 메소드 명명 규칙
		 * 
		 * - 동사적 의미를 갖게 만들어줌
		 * - 첫 글자를 소문자로 표기, 연결된 단어들의 첫글자를 대문자로 표기
		 * - 메소드 식별자의 경우 식별자 뒤에 반드시 한쌍의 "()"를 붙임
		 * - 메소드 식별자에는 _를 사용하지 않음
		 * 
		 * -> signUp(), signIn(), join()
		 * 
		 * 4. 상수 명명 규칙(아직 안배움)
		 * 
		 * - 모든 문자를 대문자로 표기
		 * - 단어와 단어 사이를 _를 사용해서 구분함
		 * 
		 * -> LOGIN_OK
		 */
		
		// 자료형(DataType)
		// Java의 기본자료형, 원시자료형
		// 정수, 실수, 문자, 논리        |      문자열
		
		// 1. 논리자료형 => 논리값 : true / false
		// 자료형 식별자;
		
		boolean isTrue; // 변수 선언    1Byte
		// System.out.println(isTrue);
		// 지역변수(local variable)는 
		// 초기화(Initialized)를 하지 않으면 사용할 수 없음
		
		// 초기화 하는 방법
		isTrue = true; // 초기화
		System.out.println(isTrue);
		isTrue = false; // 대입
		System.out.println(isTrue);
		
		/*
		 * 2. 숫자 자료형
		 * 
		 * 정수형
		 *
		 * 정수형에는 4가지 자료형이 존재함
		 * byte, short, int, long형이 존재함
		 * int형을 사용
		 * long형을 사용할 때는 대입할 숫자뒤에 "L"을 붙임
		 * 
		 */
		
		// 2_1. 정수형
		byte byteNum = 1;		// 1Byte
		short shortNum = 2;		// 2Byte
		int intNum = 3;			// 4Byte
		long longNum = 4L;		// 8Byte
		
		System.out.println(byteNum);
		System.out.println(shortNum);
		System.out.println(intNum);
		System.out.println(longNum);
		
		/*
		 * 실수형
		 * 
		 * 실수형에는 2가지 자료형이 존재함
		 * float, double(기본)형이 있음
		 */
		
		float floatNum = 2.22F;   // 4Byte
		double doubleNum = 3.33; // 8Byte
		
		System.out.println(floatNum);
		System.out.println(doubleNum);
		
		// 3. (단일)문자형
		char gold = '금'; // 2Byte
		// 단일문자에는 반~~~~~~~~드시 앞뒤로 홑따옴표를 붙여줍니다
		
		System.out.println(gold);
		
		// ----- 여기까지가 기본자료형 -----
		
		// 4. 문자열 : 참조자료형
		String fruit = "사과"; // 문자열 같은 경우 반드시 쌍따옴표를 앞 뒤로 붙여줍니다
		System.out.println(fruit);
		
		// String특 : 다른 자료형들과 붙여서 사용할 수 있음
		String source = "출력값은 : ";
		
		System.out.println(source + gold); // "출력값은 : 금"
		System.out.println(source + fruit); // "출력값은 : 사과"
		System.out.println(source + intNum); // "출력값은 : 3"
		
		// 상수 => 프로그래밍 언어
		// => 값을 변경하지 않을 변수
		
		// 1998 KH처음 생겨난 연도
		int startYear = 1998;
		System.out.println("KH 설립연도 : " + startYear);
		startYear = 2003;
		System.out.println(startYear);
		
		final int START_YEAR = 1998;
		
		//year = 2003;
	}
	
	
	public void localFn() {
		int num = 1;
		System.out.println(num);
	}
	
	public void fn() {
		// System.out.println(num);
	}
	
	

	
	
	

}

/*
 * 새로운 패키지 및 새로운 클래스와 메서드를 선언한 뒤
 * 
 * 기존의 Run클래스에서 새로운 클래스에 존재하는 메소드를 호출하시오.
 * 
 * 숙제 : 집에가서 새 프로젝트를 생성한 뒤
 * 		  1. 메인메소드 20번 지웠다 써보기
 * 		  2. 새 클래스 10개 만들어보기(패키지포함)
 * 		  3. 메소드 다섯개 만들어서 메인메소드에서 호출해보기
 */















