package com.kh.diary.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.diary.controller.DiaryController;
import com.kh.diary.dto.Diary;
import com.kh.diary.exception.DiaryBoomException;

// View 입력 / 출력 : 지금 단계에서 어쩔 수 없음
public class DiaryView {
	private Scanner sc = new Scanner(System.in);
	private DiaryController dc = new DiaryController();
	
	public void mainMenu() {
		System.out.println("🥰다이어리 꾸미기 프로그램에 오신것을 환영합니다");
		while(true) {
			System.out.println("메뉴를 선택해주세요 :)");
			System.out.println("1. 다이어리 꾸미기 📕");
			System.out.println("2. 다이어리 작성하기 🖋");
			System.out.print(" > ");
			int menuNo = 0;
			
			try {
				menuNo = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("이 괘씸한녀석 숫자를 입력해주세요!!!");
				continue;
			} finally {
				sc.nextLine();
			}
			
			switch(menuNo) {
			case 1 : decoDiary(); break;
			case 2 : writeDiary(); break;
			default : System.out.println("존재하지 않는 메뉴입니다.");
			}
		}
	}
	
	// 다이어리를 꾸밀 수 있는 요소를 입력할 수 있는 화면
	private void decoDiary() {
		System.out.print("상단 로고를 입력하세요 > ");
		String logo = sc.nextLine();
		System.out.print("상단 타이틀을 입력하세요 > ");
		String title = sc.nextLine();
		System.out.print("하단 서명을 입력하세요 > ");
		String signature = sc.nextLine();
		// 이 친구의 할 일은 일단 끝
		// 값들을 저장
		dc.decoDiary(logo, title, signature);
		
		System.out.println("다이어리 꾸미기 성공!");
	}
	
	// 다이어리를 작성할 수 있는 화면을 보여주는 기능
	private void writeDiary() {
		System.out.print("내용을 작성해주세요 > ");
		String content = sc.nextLine();
		// 다이어리 작성 시 10%확률로 다이어리가 폭발할 수 있음
		try {
			dc.boom();
		} catch(DiaryBoomException e) {
			System.out.println("다이어리가 대 폭발 해버리고 말았습니다~");
			System.out.println("새롭게 다이어리를 꾸며주세요.");
			return;
		}
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		
		Diary diary = dc.getD();
		if(diary == null) {
			System.out.println("다이어리 꾸미기를 먼저 진행해주세요~");
			return;
		}
		
		System.out.print(diary.getLogo());
		System.out.print("\t" + diary.getTitle());
		
		System.out.println("\n\n--------- 본문 ---------");
		System.out.println(content);
		System.out.print("서명 : \t\t" + diary.getSignature());
		System.out.println();
	}
	
	
	
	
	
	

}
