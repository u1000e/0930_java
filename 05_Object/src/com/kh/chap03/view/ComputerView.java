package com.kh.chap03.view;

import java.util.Scanner;

import com.kh.chap03.model.dto.Computer;

// 화면 담당(사용자에게 값을 입력 / 값을 출력)
public class ComputerView {
	
	// 프로그램을 처음 실행했을 때 제일 먼저 나오는 화면을 보여주는 메소드
	public void mainMenu() {
		//System.out.println("하이~~~");
		// 사용자에게 컴퓨터의 정보를 입력받고
		// 입력받은 컴퓨터의 정보를 콘솔창에 출력해주는 프로그램
		Scanner sc = new Scanner(System.in);
		
		// 램이 몇 G, SSD 크기, 메인보드..
		Computer c = new Computer();
					// 객체(Object) => 추상적인 개념
					// Instance    => 실제 메모리에 올라간 데이터
		
		// Computer 클래스 => Type
		// 참조자료형 => 클래스를 만든다는 행위
		// => 개발자가 자신에게 필요한 사용자 정의 자료형을 만들겠다.
		// => 여러 자료형에 각각 여러 개의 값을 보관 + 기능
		
		// 오늘의 숙제 : 나만의 클래스 3개 만들기 => 필드 접근제한자 private => getter/setter 까지 구현하기
		
	}
	
	

}
