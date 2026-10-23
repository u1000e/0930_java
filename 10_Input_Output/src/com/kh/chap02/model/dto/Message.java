package com.kh.chap02.model.dto;

import java.io.Serializable;

public class Message implements Serializable {
	private String message;
	public Message(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Message [message=" + message + "]";
	}
}