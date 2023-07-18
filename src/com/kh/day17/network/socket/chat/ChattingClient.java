package com.kh.day17.network.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {
	public static void main(String[] args) {
		// 서버에 연결중입니다.
		// 채팅서버에 접속하였습니다.
		// 서버와의 채팅을 시작합니다.
		// 서버(상대) : 하이
		// 클라이언트(나) : 네네
		String address = "127.0.0.1";
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;  // 보조스트림, 기본 데이터타입 입출력
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			// =============== 서버 연결 =======================
 			System.out.println("서버에 연결중입니다.");
			// 클라이언트에서 만든 socket과 서버에서 만든 socket은 같은 소켓임.
			Socket socket = new Socket(address, port);  // new Socket(address, port); -> try-catch문 필요
			System.out.println("채팅서버에 접속하였습니다.");
			
			// =============== 채팅 준비 =======================
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("서버와의 채팅을 시작합니다.");
			while(true) {  // 보내면 받아오기.
				// =============== 문자 받기 =======================
				String recvMsg = dis.readUTF();  // 받기
				// 읽어들일 땐 .read()종류 사용
				System.out.printf("서버(상대) : %s\n", recvMsg);
				// =============== 문자 보내기 =======================
				System.out.print("클라이언트(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);  // 보내기
				dos.flush();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
