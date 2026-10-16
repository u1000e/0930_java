package com.kh.chap02.model.dto;
//		부모클래스		자식클래스
//		슈퍼클래스		서브클래스
//		상위클래스		하위클래스
//		조상클래스		후손클래스
//		확장클래스		파생클래스
public class PrinceGoldCrown extends Treasure {
	private String source;

	public PrinceGoldCrown() {
		// super(); Treasure();
		System.out.println("나는 자식");
		//super();
	}
	public PrinceGoldCrown(String source) {
		this.source = source;
	}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
}
