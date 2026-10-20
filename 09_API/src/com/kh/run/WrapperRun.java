package com.kh.run;

public class WrapperRun {

	public static void main(String[] args) {
		// Wrapper Class
		// => 기본자료형을 참조자료형으로 포장해주는 클래스들을 뢔퍼클래스라고 함
		/*
		 * 기본자료형					Wrapper Class
		 * 				<---->
		 * boolean					Boolean
		 * char						Character
		 * byte						Byte
		 * short					Short
		 * int						Integer
		 * long						Long
		 * float					Float
		 * double					Double
		 */
		// 기본자료형을 객체로 취급해야하는 경우
		// 다형성을 적용시키고 싶은 경우
		// 매개변수 자료형이 기본자료형은 못받는 경우
		
		// 값들을 어딘가에 담고 싶음
		
		// 1, 1.0, 3, 3.3, 6, 7.5 같이 담고싶음
		
		/*
		Money m = new Money();
		long balance = m.getBalance();
		System.out.println(balance);	// 잔고가 0인지 / 조회하는데 실패해서 0이 나온건지
		Long amount = m.getAmount();
		System.out.println(amount);
		*/
		/*
		Integer i = new Integer(10);
		System.out.println(i);
		*/
		Integer i1 = 15;
		Double d1 = 2.2;
		
		String str1 = "11";
		String str2 = "1.1";
		//System.out.println(i1 + str1);
		
		// 파싱(parsing) == 특정 데이터를 규칙에 따라서 분석하고 해석하는 과정
		
		int num = Integer.parseInt(str1);
		System.out.println(num);
		double d = Double.parseDouble(str2);
		
		System.out.println(num + d);
		
		//String str = d + "";
		String str = String.valueOf(d);
	}
	
}
