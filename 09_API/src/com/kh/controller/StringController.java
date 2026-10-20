package com.kh.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.run.MathRun;

public class StringController {
	// 4Byte
	// 참조자료형     => 주소값
	// String 클래스 => 불변 
	public void method1() {
		String str1 = new String("hello");
		String str2 = new String("hello");
		MathRun run = new MathRun();
		
		System.out.println(run);
		System.out.println(str1);
		System.out.println(str2.toString());
		// 1. String 클래스의 toString()의 경우
		// 실제 담겨있는 문자열 값을 반환하게끔 오버라이딩
		
		MathRun run2 = new MathRun();
		System.out.println(run.equals(run2));
		System.out.println(str1.equals(str2));
		// 2. String 클래스의 equals()의 경우
		// 실제 담겨있는 문자열 값을 비교하게끔 오버라이딩
		
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("hello".hashCode());
		// 3. 주소값을 해싱하는게 아니라 실제 담긴 문자열값을 기반으로 해싱을 돌리도록 오버라이딩
		
		System.out.println(str1 == str2);
	}
	
	public void method2() {
		String str1 = "hello";
		String str2 = "hello";
		// toString
		System.out.println(str1);
		System.out.println(str2);
		// equals()
		System.out.println(str1.equals(str2));
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1 == str2);
	}
	
	public void method3() {
		String str1 = new String("hello"); // 절대 금지 문법
		String str2 = "hello";
		// 문자열 리터럴은 대입연산자를 써서 대입할 때
		// String Pool(heap)영역에 등록됨
		// String Pool : 동일한 내용의 문자열이 존재할 수 없음
		System.out.println(str2);
		str2 += "~";
		System.out.println(str2);
		
		String a = "a";
		String b = "a";
		
		System.out.println("결과 : " + (a == b));
	}
	
	
	// 문자열 더하기 하고 싶음
	// 근데 문자열 더하지말라고 함
	public void method4() {
		String str = "Hello" + " World";
		StringBuffer sb = new StringBuffer();
		// 문자열임시저장공간
		// 문자열은 불변 객체기 때문에 내용물 변경이 일어나면 새로운 공간을 계속해서 할당해서 메모리에 올림
		// 이를 해결하기 위해 임시공간(Buffer)를 준비해서 임시공간에 차곡차곡 쌓다가 한번에 처리하는 클래스
		sb.append("Hello");
		sb.append(" World");
		System.out.println(sb);
		
		StringBuilder builder = new StringBuilder();
		builder.append("Hello");
		builder.append(" World");
		System.out.println(builder);
		// 동시제어(Thread-safe)
		// Tomcat, Jetty~~
		// 내가직접 동시성제어를 구현해야겠다!가 아니면 Builder
	}
	
	public void method5() {
		String str1 = "이 또한 지나가리";
		// 1. 문자열.length() : int
		// 문자열의 길이를 반환
		System.out.println("str1의 길이 : " + str1.length());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 > ");
		String userId = "abcdefgh"; 
		
		// 아이디를 8자 ~ 15자이내로 적어주세요~
		if(!(8 <= userId.length() && userId.length() <= 15)) {
			throw new RuntimeException("아이디를 글자수를 어쩌고저쩌고~~");
		}
		
		// 2. 문자열.charAt(index) : char
		char ch = str1.charAt(0);
		System.out.println(ch);
		
		// 이 또한 지나가리
		// 3. 문자열.substring(int index) : String
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5, 7));
		
		// 4. 문자열.indexOf(String) : int
		System.out.println(str1.indexOf("지나가"));
		
		String[] emails = {"hong@naver.com", "kim@kh.com", "lee@google.com", "hahahoho@kh.com"};
		// System.out.println(emails[0].substring(0, 4));
		// System.out.println(emails[1].substring(0, 3));
		
		for(String e : emails) {
			//System.out.println(emails[3].substring(0, emails[3].indexOf("@")));
			System.out.println(e.substring(0, e.indexOf("@")));
		}
		
		String fileName = "flower.jpg";
		System.out.println(fileName.substring(fileName.indexOf(".") + 1));
		
		String name = "sdf.sd.sdf.sd.sd.sdf.sdf.sdf.png";
		System.out.println(name.substring(name.lastIndexOf(".") + 1));
		
		char[] chArr = str1.toCharArray();
		// System.out.println(Arrays.toString(chArr));
		//new String(chArr).chars().mapToObj(c -> (char)c).forEach(System.out::println);
		for(char c : chArr) {
			System.out.println(c);
		}
		
		// char[] -> String
		System.out.println(String.valueOf(chArr));
		
		String replaceStr = "엄마손식당";
		System.out.println(replaceStr.replace("엄마", "아빠"));
		
		System.out.println("abcd".toUpperCase());
		System.out.println("ABCD".toLowerCase());
		
		// 분리하기
		String device = "냉장고,세탁기,식기세척기,청소기";
		
		String[] devices = device.split(",");
		for(String d : devices) {
			System.out.println(d);
		}
		
		System.out.println("-------------------토큰뽑기--------------------------");
		StringTokenizer stn = new StringTokenizer(device, ",");
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		*/
		
		while(stn.hasMoreTokens()) { // 토큰이 남아있으면 true, 없으면 false
			System.out.println(stn.nextToken());
		}
	}

}
