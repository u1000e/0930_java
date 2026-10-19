package com.kh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedException {
	
	public void readString() {
		System.out.println("나는 체크드 익셉션");
		// 사용자에게 문자열을 받아서 입력받은 문자열의 길이를 출력
		//Scanner sc = new Scanner(System.in);
		//String str = sc.nextLine();
		// System.out.println(str.length());
		// if(str.equals("exit")) break;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		 * CheckedException
		 * 
		 * 예외처리를 해야한다는 사실을 체크 해주는 예외들! => 문법적으로 반드시 예외처리를 해야함!!
		 */
		try {
			System.out.print("문자열을 입력하시오 > ");
			String str = br.readLine();
			System.out.println(str.length());
		} catch(IOException e) { // 주로 외부매체 입/출력 시
			
		}
	}
	
	public void bang() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
	}
	
	public void a() {
		// bang();
	}
	
	/*
	 * 내가 만드는 프로그램은 절대 단 하나의 에러도 발생해선 안됨!!!!
	 * 
	 * 내가 만드는건 완벽해야해 절대 하나의 오점도 있을 수 없어
	 * 
	 * 하나의 틀림도 있을 수 없고 최고로 정확하게 동작해야하고 성능도 최고로 완벽해야하고
	 * 
	 * ==> 이런건 불가능해요
	 * 
	 * 저는 최고의 개발자가 될건데요? 코드를 잘짜는 방법이 뭔가요? 좋은 코드가 뭔가요?
	 * 
	 * 1. 협업이 되는 코드
	 * 
	 * 2. 예외처리 잘된 코드
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
