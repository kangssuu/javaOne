package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {
	public static void main(String[] args) {
		OutputStream os = null;

		try {
			os = new FileOutputStream("src/com/kh/day11/iostream/outputting.txt");
			byte[] data = "헬로우 입출력".getBytes(); // 바이트 기반 스트림이라 바이트 배열 사용하는 거
			for (int i = 0; i < data.length; i++) {
				os.write(data[i]);
			}
			os.flush(); // 버퍼 비우기. 버퍼를 비워야 파일에 내용이 써짐
			System.out.println("파일쓰기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();  // 자원을 닫으면 버퍼의 내용이 나옴(?)
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
