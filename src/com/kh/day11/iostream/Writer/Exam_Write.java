package com.kh.day11.iostream.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {  // 파일 생성하고 내용도 입력해 줌 
	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			// Unhandled exception type IOException
			writer = new FileWriter("src/com/kh/day11/iostream/writing.txt");
			char[] data = "Java/Oracle/JDBC".toCharArray();
			for(int i= 0; i < data.length; i++) {
				writer.write(data[i]);
			}
			writer.flush();  // 버퍼를 비워주는 메소드. 버퍼를 비워야 내용이 파일에 들어감.
			System.out.println("!!파일 쓰기 완료!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		} finally {
//			try {
//				writer.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
	}
}
