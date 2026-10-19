package com.kh.chap03.run;

import java.util.Scanner;

import com.kh.chap03.service.BlackBeanSauceNoodles;
import com.kh.chap03.service.DeliveryService;
import com.kh.chap03.service.EightZeroRestaurant;
import com.kh.chap03.service.HongChineseRestaurant;
import com.kh.chap03.service.Skill;

public class Run {
	
	public static void main(String[] args) {
		//blackBeanSauceNoodles
		// 짜장면 시키기 프로그램
		System.out.println("짜장면 주문 서비스에 오신것을 환영합니다~");
		System.out.println("주문하실 중국집을 선택하시기 바랍니다.");
		System.out.println("1. 홍반점");
		System.out.println("2. 팔공반점");
		System.out.print("메뉴를 선택해주세요 > ");
		Scanner sc = new Scanner(System.in);
		int menuNo = sc.nextInt();
		BlackBeanSauceNoodles bbsn = null;
		DeliveryService d = null;
		
		System.out.println(DeliveryService.num);
		System.out.println(Skill.num);
		switch(menuNo) {
		case 1 : bbsn = new HongChineseRestaurant();
				 d = new HongChineseRestaurant();
				 break;
		case 2 : bbsn = new EightZeroRestaurant(); 
				 d = new EightZeroRestaurant();
				 break;
		}
		bbsn.makeNoodles();
		d.delivery();
		
		
	}

}
