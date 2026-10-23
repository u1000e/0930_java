package com.kh.chap04.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04.model.vo.Perfume;

public class Run {

	public static void main(String[] args) {
		// Map ==> 저장소
		// 이름표
		// Key + Value 세트로 저장
		// HashMap 
		
		// 키   => 식별자 => 향수 이름
		// 밸류 => 향수
		
		Map<String, Perfume> perfumes = new HashMap();
		
		// 비어있는 맵에 요소를 추가
		
		// HashMap -> put()
		// key + value 셋트로 요소로 추가해야함
		
		
		// put(K key, V value) 
		perfumes.put("잉글리시 페어 앤 프리지아 코롱", new Perfume("45", "프루티"));
		perfumes.put("N°5 오드빠르펭", new Perfume("60", "플로랄"));
		perfumes.put("취 오드퍼퓸 EP.07 쌀", new Perfume("480", "우디"));
		// 순서 보장 X
		System.out.println(perfumes);
		perfumes.put("취 오드퍼퓸 EP.05 50ml", new Perfume("480", "우디"));
		// Value의 경우 중복저장 O
		System.out.println(perfumes);
		perfumes.put("N°5 오드빠르펭", new Perfume("380", "플로랄"));
		System.out.println(perfumes); // key == 식별자 --> 중복이 발생하면 덮어씌움
		
		// 2. get(Object key) : Object
		// 인자로 전달된 key에 해당하는 value를 반환
		System.out.println(perfumes.get("취 오드퍼퓸 EP.07 쌀"));
		System.out.println(perfumes.get("잉글리시 페어 앤 프리지아 코롱"));
		System.out.println(perfumes.get("없는거")); // key값이 없을 시 null값 반환
		
		System.out.println(perfumes.size());
		System.out.println(perfumes.isEmpty());
		
		// 3. replace(K key, V value) : K로 찾아서 V를 치환해줌
		perfumes.replace("잉글리시 페어 앤 프리지아 코롱", new Perfume("180", "프루티"));
		perfumes.replace("잉글리시 페어 앤 프리지아 코", null);
		// 기존에 존재하지 않는 키값을 인자로 전달하면 아무일도 일어나지않음 => put과의 차이점
		System.out.println(perfumes);
		
		// 4.remove(Object key) -> Key값을 받아서 key + value 세트로 삭제
		perfumes.remove("잉글리시 페어 앤 프리지아 코롱");
		System.out.println(perfumes);
		
		System.out.println("----------------------------------------------------");
		
		// for X, while X, addAll(Collection c) => x, Iterator X
		
		perfumes.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
		
		System.out.println("================================================");
		
		Set<Entry<String, Perfume>> p = perfumes.entrySet();
		
		Set<String> keySet = perfumes.keySet(); // key값들로만 Set을 만들기
		// System.out.println(keySet);
		Iterator<String> itKey = keySet.iterator();
		
		while(itKey.hasNext()) {
			String key = itKey.next();
			System.out.println(key + " : " + perfumes.get(key));
		}
	}
	
}
