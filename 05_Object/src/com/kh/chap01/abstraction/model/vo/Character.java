package com.kh.chap01.abstraction.model.vo;

// 게임 정하기 => 메이플스토리 => 캐릭터
public class Character {
	public String nickname; // ID
	public int level; // 레벨 => 1 ,2 ,3,4, 5
	public String job; // 직업 => 칼잽이, 총잽이
	public String hairStyle; // 머리모양 => 토벤머리
	
	public void jump() {
		System.out.println(nickname + "이(가) 점프합니다.");
		level--;
	}
	public void attack() {
		System.out.println(nickname + "이(가) 공격합니다.");
		level++;
	}
	
}
