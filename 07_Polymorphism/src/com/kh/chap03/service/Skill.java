package com.kh.chap03.service;

public interface Skill { // 계약서
	
	int num = 1;
	// 명세
	// 갑 / 을
	// 무엇을무엇을 해야함, 어떻게 해야하는지는 안 써있음
	// 이행의무사항
	// 이 계약서에 서명을 하는순간 계약서에 명시된 모든 사항을 수행해야함
	// 이 인터페이스를 구현하는 클래스는 반드시 명시된 모든 메소드를 구현해야함
	void delivery();
}
