package com.kh.variable;

public class Casting {
	/*
	 * Type Casting(자료형변환) : 자료형을 바꾸는 개념
	 * 
	 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 * 					  매 우 중 요
	 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
	 * 
	 * 1. =(대입 연산자)를 기준으로 왼쪽 / 오른쪽 같은 자료형이어야 한다.
	 * => 같은 자료형에 해당하는 리터럴값만 대입할 수 있음
	 * => 자료형이 다를 경우? => 바꿔야됨
	 * 
	 * 2. 같은 자료형들끼리만 연산이 가능함
	 * => 자료형이 다른데 연산이 하고 싶다?? 둘 중 하나를 나머지 하나와 동일하게 맞춤
	 * 
	 * 3. 연산의 결과물도 동일한 자료형이어야 한다.
	 * => 1 + 1 = 2(정수), 1.1 + 1.1 = 2.2(실수)
	 */
	
	// Promotion 자동형변환
	public void autoCasting() {
		/*
		 * boolean : 1Byte
		 * char : 2Byte
		 * byte : 1Byte, short : 2Byte, int : 4Byte, long : 8Byte
		 * float : 4Byte, double : 8Byte
		 */
		int intNum = 10;
		System.out.println(intNum);
		double doubleNum = (double)intNum; // -> 자동형변환
		System.out.println(doubleNum);
		System.out.println(intNum);
		
		intNum = (int)doubleNum; // -> 강제형변환
		
		int bigInt = 120;
		long smallLong = bigInt;
		System.out.println(smallLong);
		
		double d = 11.34234;
		System.out.println((int)d);
		
		// long(정수, 8Byte) -> float(실수, 4Byte) -> 예외상황
		long longNumber = 1000L;
		// int num = longNumber;
		float floatNumber = longNumber;
		System.out.println(floatNumber);
		// 4Byte의 float형이 long형보다 표현할 수 있는 값의 범위가 더 넓잖아요!!
		// 1 2 3
		// 1.00000001, 1.000000002, 1.000000003~~
		
		// char(2Byte, 문자) <-> int(4Byte, 정수)
		
		char ch = 'a';
		System.out.println(ch);
		int num = ch;
		System.out.println(num);
		char character = 97;
		System.out.println(character);
		
		// ---------------------------------------------------------------------------
		
		System.out.println("퀴즈퀴즈 퀴즈쇼~~~");
		System.out.println('a'); // a
		System.out.println((int)'a'); // 97
		System.out.println('a' + 3); // 100
		System.out.println(11.0 + 11);
		System.out.println('a' + 'b');
		System.out.println('가' + '葒');
		System.out.println((char)'a' + (char)'b');
		System.out.println('a' + '3'); // 148
						  // 97 + 51
		System.out.println('a' + "3");
		
		System.out.println("-------------------------------");
		
		System.out.println('3');			// 00110011
		System.out.println((char)3);		// 00000011
		System.out.println((char)'3' + (char)3); // 54
		// -128 ~ 127
		// byte b = 128;
		
		byte b2 = 126;
		byte b3 = 3;
		
		//System.out.println(b2 + b3);
		
		// 비교연산자
		System.out.println(1 == 1); // t
		System.out.println(1 == 2); // f
		System.out.println(2 == (int)'2'); // f
		System.out.println((char)2 == '2'); // f
		System.out.println((int)'2' == '2');
	}

}
