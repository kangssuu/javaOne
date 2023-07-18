package com.kh.day16.network.exercise;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {
	public static void main(String[] args) {
		String address = "192.168.60.209";
		int port = 7777;
		
		OutputStream os = null;
		InputStream is = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("연결 요청 중...");
			// 설정된 IP, Port에 연결 요청함.
			Socket socket = new Socket(address, port);
			// 연결된 후에는 소캣 객체 생성
			System.out.println("연결 성공!!");
			
			// 데이터 보내기
			// 프로그램 기준으로 데이터가 나가니까 OutputStream
			os = socket.getOutputStream();  // 소켓에 OutputStream() 가져오기?
			is = socket.getInputStream();
			while(true) {
				System.out.print("클라이언트(나) : ");
				String message = sc.nextLine();
				byte[] bytes = message.getBytes();  // 입력받은 문자열을 바이트로 가져와서 배열에 넣기
				// 보낼때 버퍼에 씀 wirte()메소드 사용
				os.write(bytes);  // 문자열 들어있는 bytes를 socket에 OutputStream으로 출력하나?
				// 버퍼 비워주기 flush()
				os.flush();
				// ===================== 보내기 완료 ==================================
				// 데이터 받기
				bytes = new byte[1024];
				int readByteNo = is.read(bytes);
				message = new String(bytes, 0, readByteNo);
				System.out.printf("서버(상대) : %s\n", message);
				//============================== 받기 완료 ====================
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
//연결 요청중...
//연결 성공!!
//클라이언트(나) : 하이요 일용자님
//데이터 전송 성공!
//서버(상대) : 네 안녕하세요