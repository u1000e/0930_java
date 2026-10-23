package com.kh.chap02.model.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileCharDao {
	
	// 출력 => 문자스트림
	public void outputToFile() {
		/*
		FileWriter fw = null;
		try {
			fw = new FileWriter("b.txt");
			fw.write("어쩌고저쩌고~~");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		/* try ~ with ~ resource 구문
		 * 
		 * try(FileWriter fw = new FileWriter("머시기머시기")){
		 * 		머시기머시기
		 * } catch(예외클래스 e){
		 * 		예외처리구문
		 * }
		 * 블럭이 종료되는 시점에 close()를 호출해서 자동으로 자원반납
		 */
		try(FileWriter fw = new FileWriter("b.txt")) {
			fw.write("한 줄 단위로 쭉쭉쭉 출력이 가능");
			fw.write("한글도 아주 잘 출력할 수 있음");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void myDiary() {
		// 사용자에게 다이어리에 쓸 내용을 입력받아서
		// 외부 파일로 출력
		// 파일명 : 2026년 10월 21일 오늘의 다이어리.txt
		Date now = new Date();
		// System.out.println(now);
		String title = new SimpleDateFormat("yyyy년 MM월 dd일").format(now);
		// System.out.println(title);
		StringBuilder sb = new StringBuilder();
		sb.append(title);
		sb.append(" 오늘의 다이어리.txt");
		try(FileWriter fw = new FileWriter(sb.toString());
			Scanner sc = new Scanner(System.in)){
			
			System.out.print("내용을 입력해주세요 > ");
			String content = sc.nextLine();
			
			fw.write("오늘의 다이어리 내용 : \t" + content);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
