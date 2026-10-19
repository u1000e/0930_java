package com.kh.homework;

import com.kh.chap04.model.dto.Payment;

public class Run {
	
	public static void main(String[] args) {
		Payment[] pays = {new Card(), new Cash(), new Point()};
		for(int i = 0; i < pays.length; i++) {
			pays[i].pay(500);
		}
	}

}
