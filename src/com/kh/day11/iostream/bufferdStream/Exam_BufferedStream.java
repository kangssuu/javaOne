package com.kh.day11.iostream.bufferdStream;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.prefs.BackingStoreException;

public class Exam_BufferedStream {

	public static void main(String[] args) {
		// 버퍼크기를 5로 표준출력 스트림(System.in)과 연결함.
		// 버퍼 출력 스트림을 생성하기
		FileReader fir = null;
		int readCharCount;
		BufferedOutputStream bout = new BufferedOutputStream(System.out, 5);
		Scanner sc =new Scanner(System.in);
		// system.out.println("전달값");
		try {
			fir = new FileReader("src/com/kh/day11/iostream/javascript_cookie.txt");
			while((readCharCount = fir.read()) != -1) {
				bout.write(readCharCount);
			}
			bout.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
