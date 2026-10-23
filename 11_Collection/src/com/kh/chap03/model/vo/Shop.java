package com.kh.chap03.model.vo;

import java.util.Objects;

import com.kh.chap03.run.Run;

// Value Object		==> 불변성
//   값	   객체
public class Shop {
	private final String name;
	private final String menu;
	private final int price;
	
	{
		// new Run();
	}
	
	// 매개변수 생성자 + 게터 + toString 구현하시오~
	public Shop(String name, String menu, int price) {
		this.name = name;
		this.menu = menu;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public String getMenu() {
		return menu;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Shop [name=" + name + ", menu=" + menu + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(menu, name, Integer.valueOf(price));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shop other = (Shop) obj;
		return Objects.equals(menu, other.menu) && Objects.equals(name, other.name) && price == other.price;
	}

	
	/*
	// equals 오버라이딩하기
	@Override
	public boolean equals(Object obj) {
		// System.out.println(obj);
		// 전달받은 obj객체의 필드값이
		// 현재 equals를 호출한 객체의 필드값과
		// 모두 동일하다면 true를 반환
		Shop shop = (Shop)obj;
		if(this.price == shop.price 
		&& this.name.equals(shop.name)
		&& this.menu.equals(shop.menu)) {
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		// 객체가지고 뭐어쩌고저쩌고 이러쿵저러쿵해서 10진수 내놔
		// 필드값이 모두 동일하다면 동일한 해시코드값이 나오게 하고 싶음!
		// "영춘옥" "곰탕" 100
		return (name + menu + price).hashCode(); 
	}
	*/
	
	
	
	
	
	
	
	
	
}
