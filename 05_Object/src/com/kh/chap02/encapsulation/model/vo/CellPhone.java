package com.kh.chap02.encapsulation.model.vo;

// 필드부, 생성자부, 메소드부
public class CellPhone { // 스마트폰의 정보를 저장하는 클래스
	// 필드(Field)부
	/*
	 * 값을 담는 공간
	 * 
	 * 필드 == 멤버변수
	 * 
	 * 객체들이 가져야할 공통적인 속성을 기술해 놓는 영역
	 */
	// 스마트폰 == 제품명, 통신사, 사이즈, 색상
	private String productName;
	private String networkProvider;
	private double size; 
	private String color;
	
//	
//	public void hi() {
//		System.out.println("나를 불렀니?");
//	}
	
	// 객체의 속성 값을 기록 및 수정하는 기능의 메소드 : setter()
	/*
	 * DTO(Data Transfer Object)
	 * 
	 * setter만들기 규칙
	 * 
	 * 1. setter는 외부에서 접근이 가능해야 하기 때문에 접근제한자를 public을 사용
	 * 2. set필드명으로 식별자를 작성하며 낙타봉표기법(camelCase)를 꼭 지키도록한다!!
	 */
	public void setSize(double size) {
					    // Parameter, 매개변수
						// 매개변수 메소드 호출 시 초기화가 강제됨
		//System.out.println(size);
		//System.out.println("setSize 35행 : " + this);
		// 객체 내부에서 this 라는 키워드는
		// 해당 객체 자기자신의 주소값을 가리킴
		// size = size;
		// Scope안 에서는
		// 해당 영역안에 있는 지역변수가 
		// 식별자 우선권을 가짐!
		if(size > 0.0) {
			this.size = size; 
		} else {
			System.out.println("올바르지 않은 사이즈입니다.");
		}
	}

	// 데이터를 반환해주는 기능의 메소드 : getter() -> 꼭 있어야함!!!!!!!!
	/*
	 * 1. getter는 접근제한자 public을 사용함
	 * 2. get필드명으로 식별자를 작성하되, 낙타봉 표기법을 사용함
	 * 3. 꼭 만들자! 
	 */
	
	// 메소드 호출 부로 size필드 값을 돌려주고 싶음
	public double getSize() {
		return size;
	}
	
	// productName필드를 기록 및 수정할 수 있는 메소드
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/*
	 * 
	 * 관례 위반 : 두 개 이상의 필드값을 변경하는 메소드의
	 *           시작이 set으로 시작해선 안됨!!!!!!!!!!!!
	public void setColorAndNetworkProvider(String color, String networkProvider) {
		this.color = color;
		this.networkProvider = networkProvider;
	}
	하나의 메소드는 하나의 기능만을 수행해야함
	*/
	
	// color필드의 값을 기록 및 수정할 수 있는 메소드
	public void setColor(String color) {
		this.color = color;
	}
	// networkProvider필드의 값을 기록 및 수정할 수 있는 메소드
	public void setNetworkProvider(String networkProvider) {
		this.networkProvider = networkProvider;
	}
	// productName, color, networkProvider
	public String getProductName() {
		return productName;
	}
	public String getColor() {
		return color;
	}
	public String getNetworkProvider() {
		return networkProvider;
	}
	
	public String info() {
		String info = "폰 = [제품명 : " + productName + ", 색상 : " + color
					+ ", 사이즈 : " + size + ", 통신사 : " + networkProvider + "]"; 
		return info;			
	}
	
	/*
	 * AccessModifier(접근제한자 / 접근제어자)
	 * 
	 *  public => 어디서든(같은패키지, 다른패키지, 클래스 내/외부 전부 포함) 접근가능
	 * 
	 * 	protected => 같은 패키지라면 무조건 접근 가능!
	 * 			  => 다른 패키지라면 상속구조인 클래스에서만 접근 가능
	 * 			  => 상속은 chap07에서 배울 것
	 * 
	 * 	default(package friendly) => 나랑 같은 패키지에서만 접근 가능
	 * 
	 *  private => 오직 클래스 내부에서만 접근 가능
	 */
	
	

}
