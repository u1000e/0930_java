package com.kh.chap01.abstraction.run;

import java.util.Scanner;

import com.kh.chap01.abstraction.model.vo.Character;

public class MapleStory {
	
	public static void main(String[] args) {
		
		System.out.println("메이플 스토리 시 ~  작!!!");
		// 아 메이플 캐릭터 만들어야지~~~
		// 이승철, 홍길동, 고길동
		//String nickNameLee = "ㄴㅇㄹㅇㄴ";
		//int levelLee = 1;
		//String hairStyleLee = "ㄴㅇㄹㄴㅇㄹㅇㄴ";
		//...
		//...
		//c.nickname = "머시기머시기";
		//System.out.println("캐릭터명 : " + c.nickname);
		Character c = new Character();
		// 스캐너 타입의 변수 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("캐릭터의 닉네임을 입력해주세요 > ");
		c.nickname = sc.nextLine();
		System.out.print("캐릭터의 직업을 입력해주세요(히어로, 아크메이지, 보우마스터) > ");
		c.job = sc.nextLine();
		System.out.print("헤어스타일을 입력해주세요 > ");
		c.hairStyle = sc.nextLine();
		
		while(true) {
			System.out.println();
			System.out.println(c.nickname + "의 정보!");
			System.out.println("직업 : " + c.job);
			System.out.println("헤어스타일 : " + c.hairStyle);
			System.out.println("레벨 : " + c.level);
			System.out.println();
			System.out.println("메뉴를 선택해주세요 > ");
			System.out.print("1. 때리기 /  2. 점프하기 / 3. 프로그램 종료 > ");
			int menuNo = sc.nextInt();
			// sc.nextLine();
			
			switch(menuNo) {
			case 1 : c.attack(); break;
			case 2 : c.jump(); break;
			case 3 : return;
			}
		}
	}
	// 실습
	// 오전에 수업한 MapleStory를 참고하여
	// 자유주제로 무언가 만들기
	
	// => 많이치자
	
	
	

}
