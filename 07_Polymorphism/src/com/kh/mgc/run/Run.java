package com.kh.mgc.run;

import com.kh.mgc.chap01.Choi;
import com.kh.mgc.chap01.Kim;
import com.kh.mgc.chap01.Lee;
import com.kh.mgc.chap01.Park;
import com.kh.mgc.chap02.CoffeeTimer;
import com.kh.mgc.chap02.EtcTimer;
import com.kh.mgc.chap03.CoffeePartTimer;
import com.kh.mgc.chap03.CoffeeWritingTimer;
import com.kh.mgc.chap03.DesertPartTimer;
import com.kh.mgc.chap03.PartTimer;
import com.kh.mgc.chap03.WashDishTimer;

public class Run {

	public static void main(String[] args) {
		System.out.println("MGC 문엽니다~~~");
		// 첫번째 단계
		Lee lee = new Lee("이승철");
		Park park = new Park("박신우");
		Choi choi = new Choi("최선영");
		Kim kim = new Kim("김가현");
		
		lee.working();
		park.working();
		choi.working();
		kim.working();
		
		lee.breakTime();
		park.breakTime();
		choi.breakTime();
		kim.breakTime();
		
		System.out.println("============================");
		
		/*
		CoffeeTimer ctLee = new CoffeeTimer("이승철");
		CoffeeTimer ctPark = new CoffeeTimer("박신우");
		EtcTimer etcChoi = new EtcTimer("최선영");
		EtcTimer etcKim = new EtcTimer("김가현");
		*/
		//ctLee.coffeeWork();
		//ctPark.coffeeWork();
		
		CoffeeTimer[] coffeeTimers = {new CoffeeTimer("이승철"), new CoffeeTimer("박신우")};
		EtcTimer[] etcTimers = {new EtcTimer("최선영"), new EtcTimer("김가현")};
		
		for(int i = 0; i < coffeeTimers.length; i++) {
			coffeeTimers[i].coffeeWork();
			coffeeTimers[i].breakTime();
		}
		for(int i = 0; i < etcTimers.length; i++) {
			etcTimers[i].etcWork();
			etcTimers[i].breakTime();
		}
		
		System.out.println("===============================================");
		// 다형성 적용
		
		PartTimer[] timers = {new CoffeePartTimer("홍길동"),
							  new CoffeeWritingTimer("이승철"),
							  new WashDishTimer("고길동"),
							  new DesertPartTimer("박신우")};
		
		for(int i = 0; i < timers.length; i++) {
			timers[i].working();
			timers[i].breakTime();
		}

	}

}
