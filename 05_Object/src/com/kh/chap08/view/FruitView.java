package com.kh.chap08.view;

import java.util.Scanner;

import com.kh.chap08.controller.FruitController;
import com.kh.chap08.model.dto.Fruit;

public class FruitView { // 화면의 입출력을 담당
	private Scanner sc = new Scanner(System.in);
	private FruitController fc = new FruitController();
	
	// 프로그램 시작 시 메인메뉴를 출력해주는 메소드
	public void mainMenu() {
		while(true) {
			System.out.println("과수원 관리 프로그램입니다.");
			System.out.println("1. 과일심기");
			System.out.println("2. 과일정보확인하기");
			System.out.println("3. 비료주기");
			System.out.println("4. 과일수확하기");
			System.out.println("5. 프로그램 종료하기");
			System.out.print("원하시는 메뉴를 선택해주세요 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : saveFruit(); break;
			case 2 : findFruit(); break;
			case 3 : fertilize(); break;
			case 4 : harvest(); break;
			case 5 : System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("없는 메뉴를 선택했습니다.");
			}
		}
	}
	// 과일을 심을 수 있는 화면을 출력해주는 기능
	private void saveFruit() {
		// 과일이 이미 존재하는가?
		//if(fc.findFruit() != null) {
		//	System.out.println("과일이 존재합니다!!");
		//	System.out.println("먼저 과일을 재배해주세요~!");
		//	return;
		//}
		System.out.print("과일명을 입력하시오 > ");
		String name = sc.nextLine();
		System.out.print("품종을 입력하시오 > ");
		String species = sc.nextLine();
		//fc.사과가져오기(name);
		fc.saveFruit(name, species);
	}
	
	// 과일의 정보를 출력해주는 기능
	private void findFruit() {
		Fruit[] fruits = fc.findFruit();
		//if(fruit != null) {
		//	String info = fruit.info();
		//	System.out.println(info);	
		//} else {
		//	printFailMessage();
		//}
		
		/*
		if(fruits[0] != null) {
			System.out.println(fruits[0].info());
		}
		if(fruits[1] != null) {
			System.out.println(fruits[1].info());
		}
		if(fruits[2] != null) {
			System.out.println(fruits[2].info());
		}
		*/
		
		for(int i = 0; i < fruits.length; i++) {
			if(fruits[i] != null) {
				System.out.println(fruits[i].info());
			}
		}
	}
	
	private void fertilize() {
		// 음.. 비료를 주면 당도가 올라가게 해야겠다.
		// 이 기능을 호출한다면 당도를 + 1해버리겠다.
		if(fc.findFruit() != null) {
			// 과일이 있다
			fc.fertilize();
			System.out.println("비료로 인해 당도가 1증가했어요~");
		} else {
			// 과일이 없다
			// 과일이 없어요~
			printFailMessage();
		}
	}
	
	private void printFailMessage() {
		System.out.println("아직 과일이 존재하지 않습니다~");
		System.out.println("과일을 먼저 심어보세요~");
	}
	
	private void harvest() {
		// 기획 => 뭘 만들지?
		// 설계 => 어떻게 만들지?
		if(fc.findFruit() != null) {
			// 수확할래요?
			System.out.println("정말 수확을 하고 싶으신가요?");
			findFruit();
			System.out.print("수확을 원하신다면 수확하기를 입력하세요 > ");
			String answer = sc.nextLine();
			
			if(answer.equals("수확하기")) {
				fc.harvest();
				
			} else {
				System.out.println("메인메뉴로 돌아갑니다.");
			}
		} else {
			System.out.println("아직 과일이 존재하지 않습니다.");
			System.out.println("과일을 먼저 심어보세요~");
		}
	}
	
	
	
	
	
	

}
