package com.kh.chap03.model.dto;
// Data Transfer Object
//	값	전송용	 객체

public class Juice /* extends Object */{
	private String name;
	private int price;
	/*
	 * public Juice(){
	 *  	super();
	 *      return;
	 * }
	 */
	public Juice() {
		//super();
	}
	public Juice(String name, int price) {
		//super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	/*
	 * Overriding
	 * 
	 * - 자식클래스에서 상속받고 있는 부모클래스의 메소드를 재정의(다시씀)하는 것
	 * - 자식클래스에 존재하는 메소드테이블에 새로운 내용으로 덮어씀
	 * 
	 * 오버라이딩의 성립조건
	 * 
	 * 1. 부모클래스의 메소드와 메소드명이 동일
	 * 2. 매개변수가 완전히 동일해야함(자료형, 개수, 순서)
	 * 3. 반환형이 동일해야함
	 * 4. 부모메소드의 접근제한자보다 공유범위가 같거나 넓어야함
	 * 
	 * -- 개발자들끼리의 암묵적인 약속 : 오버라이딩한 메소드는 반드시 @Override를 붙여주자
	 * 
	 * @Annotation
	 * 
	 * 1. 실수를 줄일 수 있음
	 * 2. 누가봐도 오버라이딩한 메소드다!
	 * 
	 * 애노테이션 없어도 오버라이딩 잘 구현가능하지만 약속을 꼭 지키자!
	 */
	@Override
	public String toString() {
		return "1";
	}
	
	


}
