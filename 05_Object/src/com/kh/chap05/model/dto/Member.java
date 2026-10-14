package com.kh.chap05.model.dto;

public class Member {
	// 필드
	private String userId;
	private String userPwd;
	private String nickName;
	// 생성자 => 이제 배울 것
	// 생성자(Constructor) : 객체 생성 시 초기화를 담당하는 요소
	/*
	 * 생성자에 대한 두 가지 관점
	 *
	 * 기술 : 객체가 생성될 때 어떤 상태로 시작을 해야하는가?
	 * 개념 : 객체가 생성이 될거면 처음부터 유효해야 하지않아?
	 */
//	public Member(String userId, String userPwd, String nickName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.nickName = nickName;
//	}
	
	// 기본생성자(매개변수가 존재하지 않음)
	// 클래스 내부에 생성자가 하나도 없으면 기본생성자를 자동으로 만들어줌!
	
	/*
	 * 접근제한자 클래스식별자() {
	 * 
	 * }
	 */
	public Member() {
		System.out.println("기본 생성자 호출~~");
	}
	
	public Member(String userId) {
		System.out.println("아이디 값 초기화~");
		this.userId = userId;
	}
	
	public Member(String userId, String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
	}
	
	public Member(String userId, String userPwd, String nickName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.nickName = nickName;
	}
	/*
	 * 1. 생성자는 반드시 클래스 명과 동일해야함!(대/소문자)
	 * 2. 반환형이 존재해선 안됨!!
	 * 3. 매개변수생성자를 명시적으로 작성하면 기본생성자를 만들어주지 않음!
	 * 4. 생성자는 동일한 이름으로 여러 개 만들 수 있지만 매개변수는 중복되면 안됨!
	 * => 생성자 오버로딩
	 */
	
	
	
	
	
	
	
	
	// 메소드 getter, setter, info => 만들기 시작
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getNickName() {
		return nickName;
	}
	public String info() {
		return "아이디 : " + userId + ", 비밀번호 : " + userPwd + ", 닉네임 : " + nickName;
	}

}
