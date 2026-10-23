package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kh.chap02.model.dto.Mall;

public class Run {
	public static void main(String[] args) {
		/*
		 * 추상적 자료형(Abstract Data Type) => Interface
		 * +
		 * 구현 => Class
		 * +
		 * 알고리즘 => method
		 * 
		 * ===========================================
		 * Collection Framework
		 */
		Mall[] m = new Mall[3];
		ArrayList malls = new ArrayList();
		System.out.println(m); 		// 배열
		System.out.println(malls);	// 어레이리스트
		
		m[0] = new Mall("스타필드", "하남");
		m[1] = new Mall("스타필드", "고양");
		m[2] = new Mall("스타필드", "안성");
		// m[3] = new Mall("더현대", "여의도");
		System.out.println(Arrays.toString(m));
		
		//malls.add(true);
		malls.add(new Mall("스타필드", "하남"));
		//malls.add("ㄴㅇㄹㅇㄴ");
		malls.add(new Mall("스타필드", "고양"));
		malls.add(new Mall("스타필드", "안성"));
		malls.add(new Mall("더현대", "여의도"));
		//malls.add(1);
		System.out.println(malls);
		// 기존 Object[]의 크기를 넘어서는 요소를 추가할 경우
		// System.arraycopy메소드를 호출해서 깊은 복사로 더 큰 배열을 할당함
		// Object 타입으로 요소를 관리하기 때문에 여러 자료형의 요소를 하나의 리스트로 요소로 사용할 수 있음
		// LinkedList
		
		// add메소드 오버로딩
		// add(int index, E e) : List의 index에 전달한 요소를 추가
		malls.add(0, new Mall("롯데백화점", "소공동"));
		System.out.println(malls);
		// 요소를 추가했을 때 기존 요소를 한 칸씩 뒤로 밀어주는 코드가 구현되어있음
		
		// 2. 요소를 수정하는 메소드
		// set(int index, E e) : List의 index 값을 요소(e)로 set해주는 기능
		malls.set(0, new Mall("신세계백화점", "회현동"));
		System.out.println(malls);
		
		// 3. 요소 삭제
		// remove(int index) : List의 index위치 요소를 삭제하는 메소드
		malls.remove(0);
		//malls.remove(4);
		System.out.println(malls);
		
		// 방어적 코드작성
		String msg = "123";
		if("123".equals(msg)) {
			System.out.println("쏼라쏼라");
		}
		
		// 4. 리스트 크기 반환
		// size() : 요소 개수 반환
		System.out.println(malls.size());
		
		// 5. List의 요소를 반환받는 메소드
		// get(int index) : E
		System.out.println(malls);
		Mall goyang = (Mall)malls.get(1);
		System.out.println(goyang);
		
		// 6. 리스트 자르기
		// subList(int index1, int index2) : List
		List sub = malls.subList(0, 2);
		System.out.println(sub);
		
		// 7. 요소 한꺼번에 추가하기
		// addAll(Collection c)
		malls.addAll(sub);
		System.out.println(malls); // 리스트는 데이터가 중복될 수 있음
		
		((Mall)malls.get(1)).setAddress("고양시");
		System.out.println(malls);
		
		// 8. 리스트에 요소가 있는지 없는지 판별하는 기능 => ☆
		// isEmpty() : 리스트에 요소가 없다면 true / 하나라도 있다면 false
		System.out.println(malls.isEmpty());
		
		malls.clear();
		
		System.out.println(malls);
		System.out.println(malls.isEmpty());
		
		/*
		 * 리스트 
		 * 
		 * 배열과의 차이점
		 * 
		 * 1. 배열을 사용하려고하면 무조건 크기 할당 => 한 번 지정된 크기는 못바꿈
		 * 	  => 크기의 제약에서 자유롭다
		 * 	  => 만약 요소가 추가되면서 부족해진다 => 알아서 확장
		 * 
		 * 2. 배열은 중간 위치에 요소를 추가하거나 삭제할 때 기존값을 밀거나 땡기는 코드를 작성해야함
		 * 	  => 밀고 땡기기 코드들이 이미 다 구현되어있음
		 *    => 그때그때 필요한 메소드들을 찾아서 호출하면됨
		 * 
		 * 3. 배열은 같은 타입의 자료형만 사용할 수 있음
		 * 	  => 다른 타입의 자료형을 한 번에 사용할 수 있음 => 보완할 수 있는 개념이 존재
		 * 
		 * 사용할 데이터의 개수가 명확함 => 배열
		 * 
		 * List의 특징 : Value만 저장, 저장 시 순서 유지(index), 중복값 허용
		 * 
		 */
		// new ArrayList(3);
		
		Mall[] arr = {new Mall("1", "2"), new Mall("1", "2"), new Mall("1", "2")};
		ArrayList li = new ArrayList();
		li.add(true);
		li.add(new Mall("1", "2"));
		li.add(new Mall("1", "2"));
		
		Mall m1 = arr[0];
		Mall m2 = arr[1];
		Mall m3 = arr[2];
		System.out.println(m1);
		
		//Mall l1 = l1.get(0);
		
		
	}
	
	
	
	
	
	
}
