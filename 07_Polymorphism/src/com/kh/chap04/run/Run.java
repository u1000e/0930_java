package com.kh.chap04.run;

import com.kh.chap04.model.dto.Gimbap;
import com.kh.chap04.model.service.ExpensiveFilter;
import com.kh.chap04.model.service.GimbapFilter;
import com.kh.chap04.model.service.PorkFilter;

public class Run {
	
	public static void main(String[] args) {
		
		Gimbap[] gimbaps = {new Gimbap("날치알마리", "날치알", 1000),
							new Gimbap("제육김치마리", "제육", 1500),
							new Gimbap("간장삼겹마리", "삼겹살", 2000),
							new Gimbap("햄치즈마리", "햄", 1000),
							new Gimbap("불닭마리", "닭고기", 2000),
							new Gimbap("땡초마리", "땡초", 1500),
							new Gimbap("종합마리", "제육, 닭고기, 땡초", 3000)};
		// GimbapFilter gf = new GimbapFilter();
		// 2000원이 넘는 꼬마김밥들만 골라줘
		GimbapFilter filter = new ExpensiveFilter();
		
		for(int i = 0; i < gimbaps.length; i++) {
			if(filter.filter(gimbaps[i])) {
				System.out.println(gimbaps[i].getName());
			}
		} // 오늘 숙제 : 11행 부터 26행까지 말로 설명하기
		
		System.out.println("포문 편하게 쓰기");
		for(Gimbap b : gimbaps) {
			if(filter.filter(b)) {
				System.out.println(b.getName());
			}
		} // => 문법
		int[] nums = {1, 2, 3};
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		for(int n : nums) {
			System.out.println(n);
		}
		// 요구사항이 증가한다~~
		// 재료에 제육이 포함되는 김밥들을 골라줘
		filter = new PorkFilter();
		for(Gimbap b : gimbaps) {
			if(filter.filter(b)) {
				System.out.println("제육이 포함된 김밥 : " + b.getName());
			}
		}
		// 요구사항이 늘어난다~~~
		// 네글자 이하인 김밥만 찾는거 만들어주세요~~
		// 1500원 이하인 김밥 찾는거 만들어주세요~~~
		
		// 클래스를 새로 만들지 않고도 필요한 시점에 인터페이스를 구현할 수 있는 방법 
		// 익명클래스
		GimbapFilter cheapFilter = new GimbapFilter() {
			@Override
			public boolean filter(Gimbap b) {
				return b.getPrice() <= 1500;
			}
		};
		for(Gimbap b : gimbaps) {
			if(cheapFilter.filter(b)) {
				System.out.println("1500원보다 저렴한 김밥 : " + b.getName());
			}
		}
		
		// 익명클래스를 써보자
		// 김밥 이름에 "치"가 포함된 김밥 찾기 프로젝트
		GimbapFilter filter1 = new GimbapFilter() {
			@Override
			public boolean filter(Gimbap g) {
				return g.getName().contains("치");
			}
		};
		
		// 2단계 : 인터페이스명, 애노테이션, 접근제한자, 반환형, 메소드명
		//         (매개변수) -> { 실행문 }
		GimbapFilter filter2 = (Gimbap g) -> {
			return g.getName().contains("치");
		};
		
		// 3단계 : 매개변수의 자료형 제거 : 타입추론 + 매개변수가 한 개라면 괄호도 생략
		GimbapFilter filter3 = g -> {
			return g.getName().contains("치");
		};
		
		// 4단계 : 중괄호 안의 실행문이 한 줄 이라면 중괄호 + return 생략
		GimbapFilter filter4 = g -> g.getName().contains("치");
		
		for(Gimbap b : gimbaps) { 
			if(filter4.filter(b)) {
				System.out.println("이름에 치가 포함된 김밥 : " + b.getName());
			}
		}
	}
	
	
}
