package com.kh.chap04.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class AnotherMap {

	public static void main(String[] args) { // properties
		
		Properties prop = new Properties(); // Map
		// .properties => 변경하지 않는 설정정보
		//                해당 프로그램이 기본적으로 가져야할 정보들을 담는 용도로 많이 사용
		//prop.put("왕향수", new Perfume("450", "프루티"));
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Map", "HashMap");
		// MyProperties p = new MyProperties();
		// p.put
		
		try {
			prop.storeToXML(new FileOutputStream("test.xml"), "2026-10-22 만든이 뭔파일인지");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
