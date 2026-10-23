package com.kh.khworld.run;

import com.kh.khworld.view.KhWorldView;

public class KhWorldRun {

	public static void main(String[] args) {
		// MVC(Model - View - Controller)
		// 소프트웨어를 개발할 때 구조를 세 가지 요소로 분리하자
		// 라는 소프트웨어 개발방법론 / 디자인 패턴
		
		// 1. Model => 데이터 담당
		// VO => 값을 담당
		// DAO => 외부매체와의 상호작용
		// DTO => 레이어간 데이터 전송 
		// Service => 비즈니스로직
		// Entity => 테이블과 매핑
		// Domain => VO + Service
		// ...
		
		// 2. View => 사용자 인터페이스 담당
		// 사용자에게 정보 표시 / 입력값을 받음
		// 모델에서 만들어진 데이터를 시각적으로 표현(프레젠테이션 로직)
		
		// 3. Controller
		// Model하고 View의 중간다리 
		// 사용자가 View에서 입력한 값을 Model에 전달
		// Model에서 일어난 처리 결과를 View로 반환
		
		// 놀이공원 어트랙션 CRUD 구현
		// Create(생성) : View에서 어트랙션의 정보를 입력받아서 어트랙션 모양으로 만들어서 많이 저장
		// Read(조회)   : 저장된 어트랙션 정보들을 조회해서 출력 / 특정 조건을 통해 오트랙션들을 출력
		// Update(수정) : 저장된 어트랙션의 정보(값)을 갱신
		// Delete(삭제) : 저장된 어트랙션의 정보를 삭제
		
		/*
		 * 게시판(C : 게시글 작성, R : 게시글 목록 조회(상세조회), U : 게시글 수정, D : 게시글 삭제)
		 * 상품(C : 상품 등록, R : 상품 조회, U : 상품 수정, D : 상품 삭제)
		 * 
		 * public class Board {
		 * 		private String boardNo;
		 * 		private String boardTitle;
		 * 		private String boardContent;
		 * 		private String boardWriter;
		 * 		private String category;
		 * }
		 * 
		 * public class Product {
		 * 		private Long productNo;
		 * 		private String productName;
		 * 		private String description;
		 * 		private int price;
		 * }
		 * 
		 * public class Reply {
		 * 		private Long replyNo;
		 * 		private String replyContent;
		 * 		private String replyWriter;
		 * 		private LocalDate createDate;
		 * 		private Long videoNo;
		 * }
		 * 
		 * public class Likes {
		 * 		private Long replyNo;
		 * 		private String writer;
		 * }
		 * 
		 * public class User {
		 * 		아이디젖아필드;
		 *  	비밀번호 저장필드;
		 *  	머시머심기;
		 * }
		 */
		
		new KhWorldView().mainMenu();
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
