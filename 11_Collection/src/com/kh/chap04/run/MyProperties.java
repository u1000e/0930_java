package com.kh.chap04.run;

import java.util.Map;
import java.util.TreeMap;

public class MyProperties {
	private Map<String, String> map = new TreeMap();
	
	public void put(String key, String value) {
		map.put(key, value);
	}
}
