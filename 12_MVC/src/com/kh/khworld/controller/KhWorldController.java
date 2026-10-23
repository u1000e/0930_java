package com.kh.khworld.controller;

import java.util.List;

import com.kh.khworld.model.dto.Attraction;
import com.kh.khworld.model.service.KhWorldService;

// View와 Model사이에서 제어
public class KhWorldController {
	private KhWorldService ks = new KhWorldService();

	public List<Attraction> readAttractions() {
		return ks.readAttractions();
	}
	public void save(String name, String heightLimit, String location) {
		// 가공 => DTO로 바꾸는 과정
		//Attraction a = new Attraction(name, heightLimit, location);
		ks.save(new Attraction(name, heightLimit, location));
	}
	
	public void deleteAttraction(String name) {
		ks.deleteAttraction(name);
	}
	
	
	

}
