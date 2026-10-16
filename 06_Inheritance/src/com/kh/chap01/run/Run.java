package com.kh.chap01.run;

import com.kh.chap01.model.dto.GoldBracelet;
import com.kh.chap01.model.dto.PrinceTombGoldCrown;
import com.kh.chap01.model.dto.SwedenTombGoldCrown;

public class Run {
	public static void main(String[] args) {
		// name, weight, perimeter
		GoldBracelet gb = new GoldBracelet("경주 금팔찌", 216, 8.3);
		// name, weight, purity
		SwedenTombGoldCrown gc = new SwedenTombGoldCrown("서봉총 금관", 0.8, 80);
		// name, weight, source
		PrinceTombGoldCrown pt = new PrinceTombGoldCrown("금령총 금관", 27, "신라");
		
		System.out.println(gb.info());
		System.out.println(gc.info());
		System.out.println(pt.info());
		
		/* "이론적"으로
		 * 
		 * 클래스들마다 중복된 코드들을 전부 하나하나 기술하다보면
		 * 코드를 수정하거나 추가하는 유지보수 시 전부 한땀한땀 고쳐야하는 어려움이 생김
		 * 
		 * 상속이라는 개념을 적용하면
		 * 매 클래스마다 중복된 필드, 메소드들을
		 * 하나의 클래스에 정의한 뒤
		 * 해당 클래스를 상속 받아서 중복을 없앨 수 있음 
		 */
		
		

	}
}
