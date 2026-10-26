package com.kh.subway.model.service;

import com.kh.subway.model.dto.Sandwich;

@FunctionalInterface // 이 인터페이스는 함수형이야 람다를 쓸용도다
public interface SandwichFilter {
	boolean test(Sandwich s);
	// void aaa();
}
