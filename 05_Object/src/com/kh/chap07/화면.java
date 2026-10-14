package com.kh.chap07;

import java.util.Scanner;

public class 화면 {
	private 엄마 mom = new 엄마(100000);
	
	public void 양파심부름시키기시뮬레이터() {
		
		while(true) {
			System.out.println("심부름을 시켜보세요 ~ ");
			System.out.println("1. 심부름 시키기");
			System.out.println("2. 잔액확인");
			System.out.println("3. 종료");
			System.out.print("메뉴를 선택하세요 > ");
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : mom.심부름시키기(); 
			case 2 : System.out.println("남은 잔고 : " + mom.getCash()); break;
			case 3 : return;
			}
		}
	}
}
