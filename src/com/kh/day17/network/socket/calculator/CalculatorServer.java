package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
	public static void main(String[] args) {
//		서버 구동중입니다
//		클라이언트의 연결을 기다리고 있습니다.
//		클라이언트와 연결되었습니다
//		받은 메시지 : 23
//		받은 메시지 : 24 + 42
//		클라이언트가 종료하였습니다.
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
//			System.out.println(".");
//			Thread.sleep(1000);  // 느리게 출력하기 (괄호안에 숫자는 로딩 줄 시간)
//			System.out.println(".");
//			Thread.sleep(1000);  // 느리게 출력하기
//			System.out.println(".");
//			Thread.sleep(1000);  // 느리게 출력하기
			System.out.println("서버 구동중입니다.");
			for(int i = 1; i <= 50; i++) {
				System.out.print("=");
				Thread.sleep(10);
			}
			System.out.println("100%");
			System.out.println();
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			// 데이터 받을 준비
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			while(true) {
				// 데이터 받기
				String recvMsg = dis.readUTF();
				if (recvMsg.equalsIgnoreCase("exit")) {  //  equalsIgnoreCase : 대소문자 구분하지 않음
					System.out.println("클라이언트가 종료하였습니다.");
					break;
					
				}
				System.out.printf("받은 메시지 : %s\n", recvMsg);
				// 24 + 42 -> 띄어쓰기 기준으로 문자열 배열을 만듦
				String[] msgArrs = recvMsg.split(" ");
				if (msgArrs.length != 3) {
					String errMsg = "end";
					dos.writeUTF(errMsg);
					continue;
				}
				
				// 24 / + / 42
				int num1 = Integer.parseInt(msgArrs[0]);
				int num2 = Integer.parseInt(msgArrs[2]);
				String operator = msgArrs[1];
//				1번 방법 => int result = 0;
				String result = "";
				switch(operator) {
				case "+" : result = String.valueOf(num1 + num2);  // 2번 방법 => 변환해도 되고 
					break;
				case "-" : result = String.valueOf(num1 - num2);
					break;
				case "*" : result = num1 * num2 + "";  // 3번 방법 => 문자열 추가해도 되고 -> 숫자 + "문자/열" => 문자열이기 때문에
					break;
				case "/" : result = num1 / num2 + "";
					break;
				case "%" : result = num1 % num2 + "";
					break;
				}
				// 결과 보내고 끝
//				1번 방법 => dos.writeUTF(Integer.toString(result));
				dos.writeUTF(result);
				dos.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
