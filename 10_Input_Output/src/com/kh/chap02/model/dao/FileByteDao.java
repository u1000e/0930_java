package com.kh.chap02.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object)
// 데이터를 보관하는 공간에 직접 접근해서 입 / 출력하는 메소드들을 가지고 있음
public class FileByteDao {
	
	// 출력 : 프로그램내의 데이터를 밖으로 내보내겠다.
	// 프로그램 --> 외부(파일)
	public void outputToFile() {
		
		// 파일로 데이터를 출력할 때 파일과 연결하는 1Byte짜리 바이트 스트림
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("a.txt"/*, true*/);
			// 생성자 호출 시 파일명을 인자로 전달
			// 존재하지 않는 파일일 경우 파일을 새롭게 생성하면서 스트림 연결
			// 두 번째 인자값으로 true를 전달하면 이어쓰기
			
			// 스트림을 통해 데이터를 출력
			fos.write(97);
			fos.write(98);
			fos.write(99);
			
			fos.write('A');
			fos.write('B');
			
			//fos.write('이');
			//fos.write('승');
			//fos.write('철');
			
			// 1Byte의 범위 : -128 ~ 127
			// 바이트스트림으로는 한글 / 일본어 / 중국어... 해결할 수 없음
			// 문자스트림을 사용해야 해결가능
			
			// 출력 끝!
			// 스트림의 사용이 끝남
			// 꼭 지켜야하는 무조건 지켜야하는 약속이 또 있음
			// 코드상에서 전부 사용했다 끝났다 => 자원반납을 해주어야함
			
			// 자원반납
			// .close()
			// fos.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 프로그램 <= 외부매체(파일) 
	// 입력 : 데이터를 가지고 오겠다.
	public void inputFromFile() {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			/*
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println(fis.read());
			
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			*/
			// 반복문
			// 1. for / 2. while
			// while
			
				 // 1. 값
				 // 2. 연산
			/*
			while(fis.read() != -1) {
				System.out.println(fis.read());
			}
			
			while(true) {
				int value = fis.read();
				if(value != -1) {
					System.out.println((char)value);
				} else {
					break;
				}
			}
			*/
			int value = 0;
			while((value = fis.read()) != -1) {
				System.out.println((char)value);
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	

}
