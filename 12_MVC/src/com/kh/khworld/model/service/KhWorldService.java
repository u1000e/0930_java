package com.kh.khworld.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.khworld.exception.DuplicateNameException;
import com.kh.khworld.model.dto.Attraction;

// 머시기머시기~~
// 어트랙션 저장된걸가지고 어쩌고저쩌고~~
public class KhWorldService {
	// 1. 어트랙션의 이름은 반드시 3글자 이상 20글자 이하일 것
	// 2. 키제한 필드에는 null값이 아닌 값이 반드시 존재할 것 / 위치도 동일
	// 비즈니스 로직 == 의사 결정 코드
	// 정석코스 => DAO를 호출해서 => 입/출력 => 시간이 너무 오래 걸리므로 2주 뒤에 해볼 예정
	private List<Attraction> attractions = new ArrayList<>();

	{
		// 초기화 블럭
		//System.out.println("초기화 블럭");
		attractions.add(new Attraction("콩 X 고질라 더 라이드", "110cm ~ 195cm 탑승 가능", "3F 게임빌리지/스낵바 앞"));
		attractions.add(new Attraction("귀담", "제한없음", "매직아일랜드 매직캐슬 뒷편"));
		attractions.add(new Attraction("회전바구니", "110cm이상 탑승가능", "후룸라이드 좌측"));
	}
	
	static {
		// 스태틱 블럭
		// System.out.println("스태틱 블럭");
	}
	
	public KhWorldService() {
		//System.out.println("생성자 블럭");
	}

	public List<Attraction> readAttractions() {
		return attractions;
	}
	
	/**
	 * @param a : 사용자가 입력한 name, limit, location이 담겨있는 Attraction
	 * @author 이승철짱
	 * @since 2026-10-23
	 * 
	 * 입력받은 값을 가지고 name 중복체크 후 리스트의 요소로 추가해주는 메소드
	 */
	public void save(Attraction a) {
		// 절대로 name필드가 중복되선 안됨!
		// 전달받은 name필드값과 List의 모든 요소 name필드값을 비교!
		/*
		for(Attraction att : attractions) {
			if(att.getName().equals(a.getName())) {
				// 추가 안되게하기 + 사용자에게 메시지 알려주기(중복이다)
				throw new DuplicateNameException("중복된 이름입니다.");
			}
		}
		*/
		nameCheck(a.getName()); // 네임체크메소드를 호출하면서 a의 네임필드값을 전달
		attractions.add(a);
	}
	// Single Responsibility Principle
	private void nameCheck(String name) {
		for(Attraction att : attractions) {
			if(att.getName().equals(name)) {
				throw new DuplicateNameException("와장창창 이름중복");
			}
		}
	}
	
	public void deleteAttraction(String name) {
		
		// 첫번째 요소랑 비교해봐야지
		/*
		if(attractions.get(0).getName().equals(name)) {
			// 인덱스 0번
			attractions.remove(0);
		}
		if(attractions.get(1).getName().equals(name)) {
			// 인덱스 1번
			attractions.remove(1);
		}
		if(attractions.get(2).getName().equals(name)) {
			// 인덱스 2번
			attractions.remove(2);
		}
		*/
		for(int i = 0; i < attractions.size(); i++) {
			if(attractions.get(i).getName().equals(name)) {
				attractions.remove(i);
				break;
			}
		}
		// name필드값이 동일한 객체의 인덱스
	}
	
	
	
	
	
	
	

}
