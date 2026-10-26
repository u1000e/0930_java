package com.kh.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {
		/*
		 * 네트워크(Network)
		 * 
		 * 통신 가능한 두 대 이상의 장치들을 물리적 또는 논리적으로 연결해놓은 환경
		 * 통신이 가능한 장치 == Host
		 * 네트워크의 목적 : 데이터의 교환
		 * 종단간 실제 통신 장치 => EndPoint
		 * 
		 * IP(Internet Protocol) Address / MAC(Media Access Controller) Address
		 * 
		 * - MAC Address : NIC(Network Interface Card)에 제조 시 붙여지는 물리 주소
		 * 
		 * - IP Address : Internet상에서 각 Host를 식별할 수 있는 논리 주소
		 * 
		 * - Port Number : Host내부에서 작동하는 Proccess를 식별할 때 사용하는 내부 번호
		 * 
		 * => IP주소랑 Port번호는 변경이 가능한 유동적인값
		 * 	  바꿀 때 IP는 같은 네트워크 안에서 , Port번호는 컴퓨터 내부에서 겹치면 충돌남!!
		 * 
		 * - Server와 Client
		 * 
		 * Server : Client(사용자)에게 서비스를 제공해주는 물리적인 컴퓨터 또는 프로그램
		 * 
		 * Client : Server에게 서비스를 요청하는 물리적인 컴퓨터 또는 프로그램
		 * 
		 * => 서버는 자기 혼자 응답할 수 없음! => 클라이언트의 요청이 들어와야만 응답을 보낼 수 있음
		 * => 클라이언트는 서버에 요청을 보내기 위해서 서버의 IP주소와 Port번호를 알아야함 
		 */
		try {
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println(localHost);
			System.out.println("====================================");
			
			// 도메인 네임을 이용해서 서버컴퓨터와 관련된 정보를 얻어낼 수 있음
			// DomainName : 숫자를 외우기 쉬운 구조로 사용자에게 제공하는 이름
			
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			
			System.out.println(googleHost); // 서버는 분산 구조로 이루어져 있음
			
			/*
			 * Client - Server
			 * 
			 * 현재 구동중인 서버가 존재한다면 클라이언트는 언제든 서버로 요청을 보낼 수 있음
			 * => 서버는 무조건 응답 결과를 돌려 주어야함
			 * 
			 * 요청(request)과 응답(response)으로 프로그램이 동작(통신) 함
			 * 웹 통신 : HTTPS(Hyper Text Transfer Protocol Secure) 
			 * 
			 * 자바만 가지고 클라이언트와 서버의 간단한 통신을 구현
			 * 
			 * 소켓(Socket)
			 * 
			 * Process(프로그램이 메모리에 적재된 상태) 간의 통신을 담당
			 */
			
			
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}
