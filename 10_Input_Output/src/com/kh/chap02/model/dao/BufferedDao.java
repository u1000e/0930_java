package com.kh.chap02.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	// 속도 향상이 목적인 보조스트림
	// 임시 공간을 제공해서 한 번에 입/출력
	
	// 기반스트림 input / output => 보조스트림 input / output
	// 기반스트림 Reader / Writer => 보조스트림 Reader / Writer
	
	// FileWriter / FileReader
	// BufferedWriter / BufferedReader
	public void outputFile() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("d.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("음하하~");
			bw.newLine();
			bw.write("쿄쿄쿄쿄쿜");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// 자원반납은 항상 생성의 역순으로 진행해야함
			try {
				bw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
			try {
				fw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void inputFile() {
		try(BufferedReader brf = new BufferedReader(new FileReader("d.txt"))){
			String str = "";
			while((str = brf.readLine()) != null) {
				System.out.println(str);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	

}
