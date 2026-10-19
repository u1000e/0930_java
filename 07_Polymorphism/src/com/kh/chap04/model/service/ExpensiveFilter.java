package com.kh.chap04.model.service;

import com.kh.chap04.model.dto.Gimbap;

public class ExpensiveFilter implements GimbapFilter {
	
	@Override
	public boolean filter(Gimbap g) {
		return g.getPrice() >= 2000;
	}

}
