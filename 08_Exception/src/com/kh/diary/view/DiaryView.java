package com.kh.diary.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.diary.controller.DiaryController;

// View 입력 / 출력 : 지금 단계에서 어쩔 수 없음
public class DiaryView {
	private Scanner sc = new Scanner(System.in);
	private DiaryController dc = new DiaryController();
	
	public void mainMenu() {
		System.out.println("🥰다이어리 꾸미기 프로그램에 오신것을 환영합니다");
		while(true) {
			System.out.println("메뉴를 선택해주세요 :)");
			System.out.println("1. 다이어리 꾸미기 📕");
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
			
			}
			
		}
	}
	
	

}
