package com.kh.chap02.run;

import com.kh.chap02.model.dao.BufferedDao;
import com.kh.chap02.model.dao.ObjectDao;

public class Run {

	public static void main(String[] args) {

		// FileByteDao fbd = new FileByteDao();
		// fbd.outputToFile();
		// fbd.inputFromFile();
		
		// FileCharDao fcd = new FileCharDao();
		// fcd.outputToFile();
		// fcd.myDiary();
		
		BufferedDao bd = new BufferedDao();
		// bd.inputFile();
		
		String text = "텍스트를 여러줄 쓰고 싶다. \n 이러면 두 줄 \n 이러면세줄";
		
		//System.out.println(text);
		
		String text1 = """
							하하 그러면
							이렇게 여러 줄을 작성해야지
					   """;
		
		//System.out.println(text1);
		
		ObjectDao od = new ObjectDao();
		od.inputFile();
		
	}
	
	
	
	
	
	
	
	
	
	

}
