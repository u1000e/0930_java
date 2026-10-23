package com.kh.chap03.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.chap03.model.vo.Shop;

public class Run {
	// private final int num;
	
	{
		// new Shop();
	}

	public static void main(String[] args) {
		// HashSet
		// Value값만 저장, index개념 없음
		// 중복 X, 순서 보장 X
		
		// 문자열만 담을 수 있는 HaseSet
		List<String> list = new ArrayList();
		System.out.println(list);
		Set<String> set = new HashSet();
		// add()
		set.add("안녕하세요");
		set.add(new String("특징"));
		set.add("반갑습니다");
		set.add(new String("특징"));
		set.add("안녕하세요");
		set.add(new String("반갑습니다"));
		set.add("특징");
		set.add(new String("안녕하세요"));
		set.add("특징");
		System.out.println(set); // 중복 X, 순서보장 X
		// 저장소, 특징
		// User lee = new User("이승철");
		// User hong = new User("홍길동");
		// 1번 : 배열, 2번 : 리스트, 3번 : 셋
		
		// 요소 개수
		System.out.println(set.size());
		Set<Shop> shops = new HashSet();
		shops.add(new Shop("누구나", "커피", 4000));
		shops.add(new Shop("서브웨이", "클럽샌드위치", 7500));
		shops.add(new Shop("사거리포차", "한식뷔페", 6000));
		shops.add(new Shop("영춘옥", "곰탕", 13000));
		shops.add(new Shop("영춘옥", "곰탕", 13000));
		
		System.out.println(shops);
		
		// equals, hashCode
		// HashSet의 특징 : Object클래스에게 상속받아 사용할 수 있는
		//				   equals메소드의 결과가 true이고
		//				   hashCode메소드의 반환값이 일치하다면
		//				   동일한 객체로 판단함
		
		String s1 = new String("예시");
		String s2 = "예시";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Shop p1 = new Shop("KH", "자바", 100);
		Shop p2 = new Shop("KH", "자바", 100);
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		/*
		 * equals()의 호출결과가 true이고 hashCode()의 반환값을 동등비교 했을 때 true가 나온다면
		 * => 동일객체로 판단(중복저장을 하지 않음)
		 * 
		 * VO클래스는 일반적으로 반드시 내부에 equals()와 hashCode()를 오버라이딩
		 */
		System.out.println("============================================");
		/*
		for(int i = 0; i < shops.size(); i++) {
			System.out.println(shops.get(i));
		}
		*/
		//List li = new ArrayList();
		//li.addAll(shops);
		//List li = new ArrayList(shops);
		//System.out.println(li);
		for(Shop shop : shops) {
			System.out.println(shop);
		}
		System.out.println("=============================================");
		// Iterator(반복자)
		// ArrayList -> 배열, LinkedList -> 노드를 연결, -> HashSet -> 테이블...
		// 개발자가 구체적인 자료구즈롤 모드러다로 반복을 시킬 수 있게 만들어준 인터페이스
		
		Iterator<Shop> it = shops.iterator();
		// new ArrayList().iter
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// List계열, Set계열 전부 iterator()로 호출해서 반복시킬 수 있음
	}
	
	
	
	
	
	
	
	
	
}
