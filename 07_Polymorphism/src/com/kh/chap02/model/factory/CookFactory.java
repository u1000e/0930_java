package com.kh.chap02.model.factory;

import com.kh.chap02.model.fried.Fried;
import com.kh.chap02.model.fried.FriedPork;
import com.kh.chap02.model.fried.FriedRice;

public class CookFactory {
	private Fried createRice() {
		return new FriedRice();
	}
	private Fried createPork() {
		return new FriedPork();
	}
	public Fried create() {
		return createPork();
	}
}
