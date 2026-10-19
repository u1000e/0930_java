package com.kh.run;

import com.kh.controller.CheckedException;
import com.kh.controller.UncheckedException;

public class Run {
	public static void main(String[] args) {
		// 1. 타이핑이 느림 => 타자연습
		//				 => {}, (), ;, = < > "" 따라치기 
		//				 => 자동완성 잘쓰자
		//				 => sysout + ctrl + space => 출력문
		//				 => main + ctrl + space   => main메소드
		//				 => Ctrl + Shift + f	  => 정렬
		// 2. 뭘 쳐야하지? => 한 줄씩 주석으로 설명달기 => 수업이 끝나면 영상 돌려보기
		//				 => 타이핑은 끝나고 치기     => 머릿속에서 순서가 생긴다? => 1번으로
		/*
		 * 에러(Error)
		 * 
		 * - 시스템 에러 : 컴퓨터의 오작동으로 발생
		 * 				 => (심각) 개발자가 해결할 수 없음 
		 * 
		 * - 컴파일 에러 : 프로그램 실행 전 소스코드상에서 문법적인 문제로 발생하는 에러
		 * 				=> 소스코드를 수정해서 해결이 가능(빨간줄로 알려줌)
		 * 
		 * - 런타임 에러 : 프로그램 실행 중 발생하는 에러 문법적으로는 문제가 없음
		 * 				=> 사용자가 개발자가 의도한대로 값을 입력하지 않았을 가능성이 높지만...
		 * 				=> 개발자가 이러한 상황을 미리 예측해서 처리해주는것이 원칙
		 * 
		 * - 로지컬 에러 : 소스코드 상 문제 없음, 실행했을 때도 문제 없이 잘 돌아감
		 * 				 => 의도와는 다르게 동작
		 * 
		 * 예외(Exception) : 시스템 에러를 제외한 나머지 컴파일, 런타임, 로지컬...
		 *					주로 런타임에러를 의미함 
		 */
		UncheckedException ue = new UncheckedException();
		// ue.divZero();
		// ue.input();
		// ue.multiCatch();
		// ue.orderByCatch();
		// ue.bomb();
		CheckedException ce = new CheckedException();
		// ce.readString();
		// ce.bang();
		// + 앞에서 수업했던 코드 중 Scanner사용 코드에 try / catch 추가하기(InputMismatchException)
		
		// 뭐 하나 만들어보기 VS String클래스 배우기
		// 다꾸
	}
	
	
}
