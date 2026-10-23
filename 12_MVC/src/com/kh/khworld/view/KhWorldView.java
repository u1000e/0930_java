package com.kh.khworld.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.khworld.controller.KhWorldController;
import com.kh.khworld.exception.DuplicateNameException;
import com.kh.khworld.model.dto.Attraction;

// 시각적인 부분, 화면 입/출력
// HTML, CSS 이런걸 안배워서 어쩔수없음 자바로 진행
public class KhWorldView {
	private Scanner sc = new Scanner(System.in);
	private KhWorldController kwc = new KhWorldController();
	
	// 프로그램 실행 시 처음 보여줄 화면을 출력해주는 기능
	public void mainMenu() {
		while(true) {
			System.out.println();
			System.out.println("놀이기구 관리 프로그램입니다.");
			System.out.println("1. 놀이기구 전체 조회하기");
			System.out.println("2. 놀이기구 추가하기");
			System.out.println("3. 놀이기구 삭제하기");
			System.out.println("4. 놀이기구 검색하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.println();
			System.out.print("사용하실 메뉴번호를 입력해주세요 > ");
			int menu = 0;
			
			try {
				menu = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력해주세요.");
				continue;
			} finally {
				sc.nextLine();
			}
			switch(menu) {
			case 1 : readAttractions(); break;
			case 2 : save(); break;
			case 3 : deleteAttraction(); break;
			case 4 : findByName(); break;
			case 0 : System.out.println("프로그램을 종료합니다"); sc.close(); return;
			default : System.out.println("없는 메뉴를 선택하셨습니다.");
			}
		}
	}
	// 놀이기구의 정보를 출력해주는 메소드
	private void readAttractions() {
		// 출력하기
		// System.out.println(kwc.readAttractions().get(0).getName());
		List<Attraction> list = kwc.readAttractions();
		
		// 차근차근
		// 나 첫번째 어트랙션의 필드를 출력해봐야지
		/*
		String name = kwc.readAttractions().get(0).getName();
		String heightLimit = kwc.readAttractions().get(0).getHeightLimit();
		String location = kwc.readAttractions().get(0).getLocation();
		System.out.println(name);
		System.out.println(heightLimit);
		System.out.println(location);
		*/
		/*
		Attraction att = kwc.readAttractions().get(0);
		System.out.println(att.getName());
		System.out.println(att.getHeightLimit());
		System.out.println(att.getLocation());
		att = kwc.readAttractions().get(1);
		System.out.println(att.getName());
		System.out.println(att.getHeightLimit());
		System.out.println(att.getLocation());
		att = kwc.readAttractions().get(2);
		System.out.println(att.getName());
		System.out.println(att.getHeightLimit());
		System.out.println(att.getLocation());
		*/
		// 어트랙션이 있을 때 <=> 없을 때
		
		// list.size() != 0
		if(!list.isEmpty()) {
			// 어트랙션이 최소 한 개는 존재
			System.out.println();
			System.out.println("놀이기구의 정보를 확인하세요!");
			System.out.println();
			for(Attraction a : list) {
				System.out.println("놀이기구명 : " + a.getName());
				System.out.println("------------------------------------");
				System.out.println("키 제한 : " + a.getHeightLimit());
				System.out.println("------------------------------------");
				System.out.println("위치 : " + a.getLocation());
				System.out.println("------------------------------------");
				System.out.println();
			}
		} else {
			System.out.println("=============================");
			System.out.println("아직 어트랙션이 존재하지 않습니다.");
			System.out.println("새 어트랙션을 추가해보세요!");
			System.out.println("=============================");
		}
	}
	
	private void save() {
		// 여기서 해야할 일은 무엇인가요??
		// 입력받기
		// 무슨 값을 입력받아야하지??
		System.out.println();
		System.out.print("놀이기구의 이름을 입력해주세요 > ");
		String name = sc.nextLine();
		System.out.print("키 제약사항을 입력해주세요 > ");
		String heightLimit = sc.nextLine();
		System.out.print("위치를 입력해주세요 > ");
		String location = sc.nextLine();
		// 입력받은 값을 넘기기
		/*
		List list = new ArrayList();
		list.add(name);
		list.add(heightLimit);
		list.add(location);
		list.get(0);
		list.get(1);
		list.get(2);
		*/
		try {
			kwc.save(name, heightLimit, location);
			System.out.println("놀이기구가 등록되었습니다!");
		} catch(DuplicateNameException e) {
			System.out.println(e.getMessage());
			System.out.println("새로운 놀이기구명을 작성해주세요!");
		}
	}
	
	private void deleteAttraction() {
		System.out.println();
		System.out.println("등록된 놀이기구를 제거하겠습니다.");
		readAttractions();
		System.out.print("제거하실 놀이기구명을 입력해주세요 > ");
		String name = sc.nextLine();
		// 요기까지왔는데 사실 잘못 누른것일 수 있음 => 나갈방법
		//									 => 무조건써야함
		// 검사 값에 대한 유효성 => null여부, 빈문자열여부, 길이체크, 한글영어일본어...
		// 삭제 => 성공
		//	   => 성공하지 못할 수 있음
		
		if("".equals(name) || name.contains("바보") || name.length() <= 1
		   || name.isBlank() || name.isEmpty()) {
			System.out.println("올바르지 않은 놀이기구명 입니다.");
			return;
		}
		kwc.deleteAttraction(name);
	}
	private void findByName() {
		
		System.out.print("검색어를 입력하세요 > ");
		String keyword = sc.nextLine();
		List<Attraction> list = kwc.readAttractions();
		
		//List<Attraction> searched = new ArrayList();
		/*
		for(Attraction a : list) {
			if(a.getName().contains(keyword)) {
				searched.add(a);
			}
		}
		*/
		List<Attraction> searched = list.stream()
									    .filter(f -> f.getName().contains(keyword))
									    .toList();
		
		
		
	}
	
	
	
	
	
	
	

}
