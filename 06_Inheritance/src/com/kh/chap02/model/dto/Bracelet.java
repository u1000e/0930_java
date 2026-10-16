package com.kh.chap02.model.dto;
//			 자식클래스 extends 부모클래스
public class Bracelet extends Treasure {
	// 부모로부터 상속받는 부분은 작성하지 않는다.
	private double perimeter;

	public Bracelet() {}
	public Bracelet(String name, double weight, double perimeter) {
		super(name, weight);
		this.perimeter = perimeter;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	// 메소드를 상속받았는데 마음에 안듭니다. => 발전을 시켜야겠다!!!
	// 다시 쓸수 있음
	public String info() {
		return super.info() + ", 지름 : " + perimeter;
	}
	
}
