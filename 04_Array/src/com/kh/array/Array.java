package com.kh.array;

import java.util.Arrays;

public class Array {
	
	// 변수(Variable)
	// 메모리(RAM) 공간에 Data(VALUE)값을 저장하는 공간
	
	// 특징
	// 초기화(Initialize)해야만 사용할 수 있음, 선언된 Scope에서만 쓸 수 있음
	// 하나의 변수에는 하나의 값만 대입할 수 있음, 자료형은 크기가 정해져 있음
	
	/*
	 * 배열 : 하나의 배열에 여러 개의 값을 담을 수 있음
	 * 		 단, "같은 자료형의 값들"만 담을 수 있음
	 * 		 동종모음(homogeneous collection)이라고도 부름
	 * 
	 * => 배열의 각 공간에 접근할 때 사용하는 개념 index  / index는 0부터 시작한다.
	 */
	
	public void method0() { // switch, else if, for, while, break, continue, return 
		// 다섯개의 정수를 변수에 대입한 뒤 정수값을 모두 더한 값을 출력
		int num1 = 15;
		int num2 = 19;
		int num3 = 33;
		int num4 = 22;
		int num5 = 5;
		System.out.println(num1 + 
						   num2 + 
						   num3 + 
						   num4 + 
						   num5);
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
			//sum += numi;
		}
	}
	
	
	public void method1() {
		
		// 배열
		// 배열 선언
		
		// 변수 선언 => 자료형 변수식별자;
		// 배열 선언 =>
		// 1) 자료형 배열식별자[];
		// 2) 자료형[] 배열식별자; => 두 번째 방법 당첨
		// int[] nums;

		// 2. 배열 할당
		/*
		 * 배열에 몇 개의 값이 들어갈 것인지 배열의 크기를 정해주는 과정
		 * 
		 * int[] nums; <-- 배열 선언
		 * nums = new int[3]; <-- 할당
		 * 
		 * int[] arr = new int[3]; <-- 선언과 동시에 할당
		 * 
		 * 배열은 참조자료형이다.
		 */
		// nums라는 정수형 배열을 선언하고 3칸을 할당받기~~
		int[] nums = new int[3];
		
		System.out.println(nums);
		nums[0] = 10;
		nums[1] = 21;
		nums[2] = 30;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
	}
	
	public void method2() {
		
		// 1. 배열 선언 및 할당
		int[] nums = new int[3]; // 
		//int i;
		
		//System.out.println(i);
		System.out.println(nums[2]);
		
		System.out.println("\n\n\n\n\n");
		
		// KH정보교육원 사무실, 301, 302, 501, 502
		//String[] KH정보교육원 = new String[5];
		// System.out.println(KH정보교육원);
		//KH정보교육원[0] = "사무실";
		//KH정보교육원[1] = "301강의실";
		//KH정보교육원[2] = "302강의실";
		//KH정보교육원[3] = "501강의실";
		//KH정보교육원[4] = "502강의실";
		
		// 도달하고자 하는 목적지 
		/*
		 * 서울특별시 종로구 우정국로2길 21 대왕빌딩 501 강의실
		 */
		//System.out.println(KH정보교육원);
		//System.out.println(KH정보교육원[3]);
		
		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double
		 * 			=> 변수공간에 실제 값을 바로 담을 수 있음
		 * 
		 * 참조자료형 : int[], String[], boolean[], char[], byte[]... String
		 * 			=> 변수공간에 주소값을 담을 수 있음
		 */
		
		int number1 = 3;
		int number2 = 3;
		System.out.println(number1 == number2);
		
		int[] nums1 = new int[3];
		int[] nums2 = new int[3];
		System.out.println(nums1 == nums2);
		
		System.out.println(nums1.hashCode());
		System.out.println(nums2.hashCode());
		
		System.out.println(nums1.length);
	}
	
	public void method3() {
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 15;
		nums[2] = 20;
		System.out.println("흐흐");
		// nums[3] = 1; // 문법적으로는 아무런 문제가 없음
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
					at com.kh.array.Array.method3(Array.java:135)
					at com.kh.run.Run.main(Run.java:11)
			배열의 인덱스 범위를 벗어나면 이런 문제가 퍼퍼펑 터지는구나
		 */
		System.out.printf("[%d, %d, %d]\n", nums[0], nums[1], nums[2]); 
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println(Arrays.toString(nums));
	}
	
	public void method4() {
		// 배열 언제씀??
		// 사용해야하는 값과 개수가 명확한 경우에만 사용
		// 임시비밀번호 발급, 인증코드 발급
		
		// 실제로 배열을 소스코드 작업 시 사용한다면...
		int[] arr = {100, 200, 300, 400, 500, 600};
		System.out.println(Arrays.toString(arr));
	}
	
	public void method5() {
		// 잘 기억하기
		// 중독
		char[] addiction = new char[2];
		addiction[0] = '중';
		addiction[1] = '독';
		System.out.println(Arrays.toString(addiction));
		addiction = new char[3];
		addiction[2] = '성';
		System.out.println(Arrays.toString(addiction));
		/*
		 * 연결이 끊긴 기존의 배열은 일정시간이 지나면 GarbegeCollection(G.C)가 알아서 삭제
		 * 자동 메모리 관리
		 * 기존 배열 식별자에 할당만 새롭게 한다면 => 기존에 참조하고있던 연결이 끊기면서 새로운 배열을 가리킴 
		 */
		// 차형 배열 => 차형배열의 주소값 => 자격증
		addiction = null; // 아무것도 존재하지 않음을 의미하는 값
		System.out.println(addiction);
	}
	
	public void method6() {
		// 복사
		// 얕은복사, 깊은복사
		int[] origin = {1, 2, 3};
		// new int[3];
		// origin[0] = 1; origin[1] = 2; origin[2] = 3;
		System.out.println(Arrays.toString(origin));
		
		int[] copy = origin;
		System.out.println(Arrays.toString(copy));
		
		origin[2] = 33;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		// 얕은 복사 => 주소값을 대입하는 것이기 때문에 가리키고 있는 대상이 같다.
	}
	
	// 깊은복사 => 기존 배열의 크기보다 큰 배열로 복사하는 경우
	public void method7() {
		
		int[] origin = {1, 2, 3};
		int[] copy = new int[6];
		
		/*
		copy[0] = origin[0];
		copy[1] = origin[1];
		copy[2] = origin[2];
		for(int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		 */
		System.out.println(Arrays.toString(copy));
		
		int[] copy2 = new int[10];
		// 클래스 / 인터페이스 == 네이밍컨벤션 == 첫글자가 대문자
		System.arraycopy(origin, 0, copy2, 0, 3);
		System.out.println(Arrays.toString(copy2));
		// arraycopy(원본배열, 원본배열에서복사를시작할인덱스번호, 복사본배열, 
		//			  복사본에서복사될인덱스, 복사할요소의개수)
		
		int[] copy3 = Arrays.copyOf(origin, 15);
		System.out.println(Arrays.toString(copy3));
		
		int[] copy4 = origin.clone();
		System.out.println(Arrays.toString(copy4));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
