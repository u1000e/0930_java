package com.kh.chap01.abstraction.model.vo;


public class Dog {
	// [ 필드부 ]
	// 이름, 종, 나이, 성별, 중성화여부
	public String name;    // 개의 이름을 저장해야겠는데?
	public String species; // 종을 저장해야겠는데?
	public int age; // 나이를 저장해야겠는데?
	public char gender; // 성별을 저장해야겠는데 => M / F, 남자 / 여자
	public boolean neuter;
	
	// [ 생성자부 ]
	
	// [ 메소드부 ] => Dog가 수행할 수 있는 행위(기능)
	public void walk() { // 걸을 때 나의 이름을 좀 말하면서 걷고 싶다. 
						 // => walk메소드입장에서 나의 이름은? 내부 / 외부
		System.out.println(name + "이(가) 걸어요");
	}
	
	public void swingTail() {
		if(age < 10) {
			
			System.out.println(name + "이(가) 꼬리를 흔듭니다.");
			age++;
		} else {
			System.out.println("이제 힘들어서 꼬리 안흔들어요");
		}
	}

}
