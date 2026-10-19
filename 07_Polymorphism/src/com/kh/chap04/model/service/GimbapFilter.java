package com.kh.chap04.model.service;

import com.kh.chap04.model.dto.Gimbap;

@FunctionalInterface // 추상메소드를 하나만 가지고 있을 인터페이스에 작성
public interface GimbapFilter {
	
	boolean filter(Gimbap g);
	
}
