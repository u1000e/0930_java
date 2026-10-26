package com.kh.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServerSocket server = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		// 돌아갈 포트번호 지정
		int portNumber = 3000;
	
		try {
			// 서버소켓을 포트바인딩
			server = new ServerSocket(portNumber);
			System.out.println("요청 언제오지?... 대기 중...");
			
			Socket socket = server.accept();
			System.out.println("클라이언트와 연결 성공!");
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			
			String msg = br.readLine();
			System.out.println("클라이언트가 보낸 메시지 : " + msg);
			
			if("안녕".equals(msg)) {
				pw.println("안녕~~");
			} else {
				pw.println("잘가~~");
			}
			
			// 스트림에 있는 데이터를 강제로 내보내기
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			pw.close();
			
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			sc.close();
			
			try {
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
