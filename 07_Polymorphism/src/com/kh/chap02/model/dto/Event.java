package com.kh.chap02.model.dto;

public class Event extends Cook {
	public Event(String name) {
		super(name);
	}
	@Override
	public void cooking() {
		System.out.println("이벤트~~~");
	}
}
