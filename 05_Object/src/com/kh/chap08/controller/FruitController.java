package com.kh.chap08.controller;

import com.kh.chap08.model.dto.Fruit;
import com.kh.chap08.model.service.FruitService;

public class FruitController { // View랑 Service의 중간다리
	private FruitService fs = new FruitService();

	public void saveFruit(String name, String species) {
		//System.out.println("view로 부터 전달받은 name : " + name);
		//System.out.println("view로 부터 전달받은 species : " + species);
		Fruit f = new Fruit(name, species);
		fs.saveFruit(f);
	}
	
	public Fruit[] findFruit() {
		return fs.findFruit();
	}
	
	public void fertilize() {
		fs.fertilize();
	}
	
	public void harvest() {
		fs.harvest();
	}
	
	
	
	// 오늘 숙제 
	
	// 1. 주말 숙제에 뭐 만들건지 기획하기
	// 2. 기획한거 토대로 기획도 그림 그려오기 => 내일 아침에 검사하겠음
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
