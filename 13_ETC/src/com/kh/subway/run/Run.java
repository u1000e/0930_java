package com.kh.subway.run;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.kh.subway.model.dto.Sandwich;
import com.kh.subway.model.service.SandwichFilter;

public class Run {

	public static void main(String[] args) {
		List<Sandwich> bin = List.of(new Sandwich("램", 8000, "양고기")
									,new Sandwich("에그마요", 5500, "달걀")
									,new Sandwich("스파이시 쉬림프", 7500, "새우")
									,new Sandwich("풀드포크 바비큐", 7000, "돼지고기")
									,new Sandwich("스파이시 이탈리안", 6500, "페퍼로니")
									,new Sandwich("로티세리 바비큐 치킨", 7000, "돼지고기")
									,new Sandwich("이탈리안 비엠티", 6000, "페퍼로니")
									,new Sandwich("안창비프 & 머쉬룸", 8000, "소고기")
									,new Sandwich("스테이크 & 치즈", 8000, "소고기")
									);
		
		// 소고기가 들어간 샌드위치만 걸러내고 싶다.
		SandwichFilter beefFilter = s -> s.getMaterial().contains("소고기");
		for(Sandwich s : bin) {
			if(beefFilter.test(s)) {
				System.out.println(s.getName());
			}
		}
		
		SandwichFilter expensiveFilter = s -> s.getPrice() >= 7500;
		for(Sandwich s : bin) {
			if(expensiveFilter.test(s)) {
				System.out.println(s.getName());
			}
		}
		
		// Predicate<T> - 판별 T -> boolean
		Predicate<Sandwich> isPork = s -> s.getMaterial().equals("돼지고기");
		for(Sandwich s : bin) {
			if(isPork.test(s)) {
				System.out.println(s.getName());
			}
		}
		
		// Function<T, R> -> 변환 T -> R(리턴타입)
		// 샌드위치를 받아서 샌드위치의 이름을 반환
		Function<Sandwich, String> getName = s -> s.getName() + "는 " + s.getPrice() + "원 입니다.";
		System.out.println(getName.apply(new Sandwich("에그마요", 3400, "에그")));
		
		// Consumer<T> -> 소비 T -> void
		Consumer<Sandwich> print = s -> System.out.println(s.getMaterial());
		print.accept(new Sandwich("에그마요", 5000, "초 고급 계란"));
		
		// Supplier<T> -> 공급 () -> T
		Supplier<Sandwich> defaultSand = () -> new Sandwich("기본", 1000, "없음");
		Sandwich d = defaultSand.get();
		System.out.println(d);
		
		/*
		 * T   -> boolean
		 * T   -> R
		 * T   -> 없음
		 * 없음 -> T
		 */
		
		// 재료가 페퍼로니인 샌드위치들만 따로 관리를 하고 싶어요
		List<Sandwich> reds = new ArrayList<>();
		for(int i = 0; i < bin.size(); i++) {
			if(bin.get(i).getMaterial().equals("페퍼로니")) {
				reds.add(bin.get(i));
			}
		}
		System.out.println(reds);
		
		List<Sandwich> red = bin.stream()
								.filter(s -> s.getMaterial().equals("페퍼로니"))
								.toList();
		System.out.println(red);
		
		List<String> names = bin.stream()
								.filter(s -> s.getMaterial().equals("페퍼로니"))
								.map(s -> s.getName())
								.toList();
		System.out.println(names);
		
		List<String> materials = bin.stream()
									.map(s -> s.getMaterial())
									.distinct()
									.toList();
		System.out.println(materials);
		
		bin.stream()
		   .map(Sandwich::getMaterial)
		   .collect(Collectors.toSet());
		
		String sands = bin.stream()
						   .map(Sandwich::getName)
						   .collect(Collectors.joining(","));
		
		System.out.println(sands);
		
		// 오늘부터 해야 할 일 : 11월 1일까지 매일 
		// 자바 복습하기 : 최소 퀴즈풀기, 자기전에 책읽기
		// 코드작성 -> MVC -> 최소 1일 1회, C / R / D -> 30분 컷 목표
		
		// 자바라는 프로그래밍 언어 => "값"
		
		
		Sandwich s = bin.stream()
						.filter(san -> san.getPrice() > 7000)
						.findFirst()
						.orElse(null);
		// 7000원이 넘는 샌드위치 중 가장 첫번째 샌드위치를 찾는 코드
		
		bin.stream()
		   .filter(san -> san.getPrice() > 7000)
		   .map(san -> san.getPrice());
		   //.count();
		   // reduce
		   //.forEach(System.out::println);
	}

}