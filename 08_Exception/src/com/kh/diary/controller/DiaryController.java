package com.kh.diary.controller;

import com.kh.diary.dto.Diary;
import com.kh.diary.exception.DiaryBoomException;

public class DiaryController {
	private Diary d;
	
	public void decoDiary(String logo, String title, String signature) {
		Diary diary = new Diary(logo, title, signature);
		/*
		 * 1. 유효값검증 => 값이 존재하는가, 적절한값인가... 검증
		 * 2. 중복검사 
		 * 아직은 패스
		 * 얕은 복사
		 */
		d = diary;
	}
	
	public Diary getD() {
		return d;
	}
	
	public void boom() {
		// 90%확률로 문제없음 , 10%확률로 대폭발하면 다이어리 꾸미기한거 다 날아감
		int rand = (int)(Math.random() * 100) + 1;
		
		if(rand < 11) {
			d = null;
			throw new DiaryBoomException("다이어리가 폭발했습니다.");
		}
	}
	
	// 오늘부터 시작
	// Diary라는 껍데기를 바꿔서 무엇이든 만들기
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
