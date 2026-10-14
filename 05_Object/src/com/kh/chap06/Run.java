package com.kh.chap06;

import com.kh.chap06.controller.MethodController;

public class Run {
	
	public static void main(String[] args) {
		MethodController m1 = new MethodController();
		/*
		// 학습방법 => 읽기를 좀 잘해보자 => 소리내어 입으로 읽는 것
		MethodController m2 = new MethodController();
		MethodController m3 = new MethodController();
		int a = m1.add(2, 3);
		int b = m2.add(3, 5);
		System.out.println(a);
		System.out.println(b);
		System.out.println(m3.fn(3));
		System.out.println(m3.fn2());
		*/
		/*
		System.out.println(1);
		System.out.println(1.0);
		System.out.println('a');
		System.out.println("a");
		System.out.println(true);
		*/
		m1.method();
		m1.method(1);
		m1.method(1, 2);
		m1.method("s");
		
	}
}





