package com.kh.chap08.model.service;

import com.kh.chap08.model.dto.Fruit;

public class FruitService { // 연산
//	private Fruit fruit;
//	private Fruit secondFruit;
//	private Fruit thirdFruit;
    private Fruit[] fruits = new Fruit[3];
	
	public void saveFruit(Fruit f) {
		/*
		if(fruit == null) {
			this.fruit = f;
		} else if(secondFruit == null) {
			this.secondFruit = f;
		} else if(thirdFruit == null){ // 경우의 수
			this.thirdFruit = f;
		}
		*/
		/*
		if(fruits[0] == null) {
			fruits[0] = f;
		}
		if(fruits[1] == null) {
			fruits[1] = f;
		}
		if(fruits[2] == null) {
			fruits[2] = f;
		}
		*/
		for(int i = 0; i < fruits.length; i++) {
			if(fruits[i] == null) {
				fruits[i] = f;
				return;
			}
		}
	}
	
	public Fruit[] findFruit() {
		//return fruit;
		// 빈 과일이 하나라도 존재한다면 null을 반환
		/*
		if(fruit == null || secondFruit == null || thirdFruit == null) {
			return null;
		} else if(fruit != null) {
			return fruit;
		} else if(secondFruit != null) {
			return secondFruit;
		} else {
			return thirdFruit;
		}
		*/
		
		/*
		return fruit != null ? fruit : secondFruit != null 
							 ? secondFruit : thirdFruit != null 
							 ? thirdFruit : null;
		*/
		return fruits;
	}
	
	
	public void fertilize() {
		// 당도를 1올리려고
		// 당도를 필드로 가지고 있는 과일의 주소 => fruit
		
		// 주소를 알기 때문에 -> 당도를 올리면됨 -> setBrix()
		//fruit.setBrix(fruit.getBrix() + 1);
	}
	
	public void harvest() {
		// 식물뽑기
		//fruit = null;
	}
	
	
	

}
