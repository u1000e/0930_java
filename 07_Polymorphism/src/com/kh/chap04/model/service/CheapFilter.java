package com.kh.chap04.model.service;

import com.kh.chap04.model.dto.Gimbap;

public class CheapFilter implements GimbapFilter {
	@Override
	public boolean filter(Gimbap b) {
		return b.getPrice() <= 1500;
	}
}
