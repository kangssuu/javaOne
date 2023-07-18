package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class BaseBallServer {

	public static void main(String[] args) {
//		서버소켓을 생성하였습니다.
//		2023-07-18 12:04:56:15
//		클라이언트의 접속을 기다립니다.
//		클라이언트가 접속했습니다.
//		서버 숫자 -> 7 3 8
//		서버 준비 완료
//		받기 : 4 2 1
//		0스트라이크 0볼
//		받기 : 1 2 3
//		0스트라이크 1볼
//		받기 : 2 3 4
//		1스트라이크 0볼
//		받기 : 5 3 8
//		2스트라이크 0볼
//		받기 : 5 3 7
//		1스트라이크 1볼
//		받기 : 7 3 8
//		3스트라이크 0볼
//		아웃! 게임종료
		ServerSocket serverSocket = null;
		int port = 9999;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("서버소켓을 생성하였습니다.");
			Thread.sleep(1500);
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			System.out.print("서버 숫자 -> ");
			for (int i = 0; i < 3; i++) {
				// 중복없이 추출하기
				numbers[i] = (int)(Math.random() * 9+1);
				for (int j = 0; j < i; j++) {
					// #1 skip
					//         j             i
					// #2
					// numbers[0] == numbers[1]
					// #3
					// numbers[0] == numbers[2]
					// numbers[1] == numbers[2]
					if(numbers[j] == numbers[i]) {
						i--;
						break;
					}
				}
			}
			System.out.printf("%d %d %d\n", numbers[0],numbers[1],numbers[2]);
			System.out.println();
			System.out.println("서버 준비 완료");
			// 보낸거 받아주기
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			while(true) {
				String recvMsg = dis.readUTF();
				System.out.printf("받기 : %s\n",recvMsg);  //ctrl + shift + x : 대문자로 변환
				// 결과 알려주기 (보내기)
				// numbers배열과 입력한 값으로 만든 배열과 비교
				// 정답과 비교해서 스트라이크, 볼 알려주기
				String[] inputNums = recvMsg.split(" ");
				int strike = 0;
				int ball = 0;
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if(numbers[i] == Integer.parseInt(inputNums[j])) {
							if(i == j) {	// 값이 같은 상태에서 인덱스가 같으면 스트라이크임
								strike ++;
							}
							else {	// 값이 같은 상태에서 인덱스가 다르면 볼임
								ball++;
							}
						}
					}
				}
				// numbers[0] == Integer.parseInt(inputNums[0])
				// -> 스트라이크 + 1
				// numbers[0] == Integer.parseInt(inputNums[1])
				// numbers[0] == Integer.parseInt(inputNums[2])
				
				// numbers[1] == Integer.parseInt(inputNums[0])
				// -> 볼 + 1
				// numbers[1] == Integer.parseInt(inputNums[1])
				// numbers[1] == Integer.parseInt(inputNums[2])
				
				// numbers[2] == Integer.parseInt(inputNums[0])
				// numbers[2] == Integer.parseInt(inputNums[1])
				// numbers[2] == Integer.parseInt(inputNums[2])
				
				String result = strike + "스트라이크 " + ball + "볼";
				dos.writeUTF(result);
				dos.flush();
				if (strike == 3) {
					System.out.println("아웃! 게임종료");
					break;
				}
			}
			
			
			// ========== 내가 작성해보던 코드 ========== (강사님꺼랑 거의 비슷함!!)
			
//			System.out.println("서버 숫자 -> ");      ┓
//			String num = sc.nextLine();				  ┃
//			String[] numArrs = num.split(" ");		  ┃ ==> 랜덤으로 받아야 하는 거였음
//			System.out.println("서버 준비 완료");	  ┛
//			
//			while(true) {
//				String recvMsg = dis.readUTF();
//				System.out.printf("받기 : %s\n",recvMsg);
//				String[] msgArrs = recvMsg.split(" ");
//				int strike = 0;
//				int ball = 0;
//			
//				for (int i = 0; i < numArrs.length; i++) {
//					for (int j = 0; j < msgArrs.length; j++) {
//						if(String.valueOf(numArrs[i]).equals(msgArrs[j])) {  // numArrs를 String으로 변환하는게 아닌 msgArrs를 int로 변환했어야 하나봄?
//						// 아니 그냥 equals말고 == 로 비교했어야 하나?
//							if ((String.valueOf(numbers[i]).indexOf(numbers[i])) == (msgArrs[i].indexOf(msgArrs[i]))) {  // 인덱스 이거 그냥 i == j 했으면 됨;;
//								strike ++;
//							}
//							else {
//								ball++;
//							}
//						}
//					}
//				}
//				String result = strike + "스트라이크 " + ball + "볼";
//				System.out.println(result);
//				dos.writeUTF(result);
//				dos.flush();
//				if(strike == 3) {
//					System.out.println("아웃! 게임종료");
//					break;
//				}
//			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
