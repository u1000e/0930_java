package com.kh.chap04.model.service;

import com.kh.chap04.model.dto.Gimbap;

public class PorkFilter implements GimbapFilter {

	// 재료에 제육이 포함되어있는가?
	@Override
	public boolean filter(Gimbap g) {
								// contains는 포함되어있는가
		return g.getMainMenu().contains("제육");
	}

}