package com.kh.diary.dto;

public class Diary {
	// 다이어를 꾸민 뒤에 
	// 꾸민 모양으로 출력이 되게끔
	private String logo;
	private String title;
	private String signature;
	
	public Diary(String logo, String title, String signature) {
		this.logo = logo;
		this.title = title;
		this.signature = signature;
	}
	
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
}
