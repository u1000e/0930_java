package com.kh.chap01.run;

import com.kh.chap01.Integers;

public class Run {

	public static void main(String[] args) {
		// 정수값을 "여러 개" 한번에 다루고 싶음
		// 정확히 몇 개 일지 알 수 없음
		// int num1 = 10;
		// int num5000 = 20;
		// int[] nums = new int[5];
		// nums[0] = 10;
		Integers i = new Integers();
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(10);
		i.add(50);
		System.out.println(i);
		
		System.out.println(i.get(0));
		System.out.println(i.get(3));
	}

}
