package com.kh.khworld.model.dto;

public class Attraction { // 오늘의 가정 : 놀이기구명은 중복될 수 없음
	private String name;  // 이름 저장할필드 => 자료형 => 실제 들어갈 값
	private String heightLimit;
	private String location;
	
	
	public Attraction(String name, String heightLimit, String location) {
		this.name = name;
		this.heightLimit = heightLimit;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeightLimit() {
		return heightLimit;
	}
	public void setHeightLimit(String heightLimit) {
		this.heightLimit = heightLimit;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Attraction [name=" + name + ", heightLimit=" + heightLimit + ", location=" + location + "]";
	}
	
}
