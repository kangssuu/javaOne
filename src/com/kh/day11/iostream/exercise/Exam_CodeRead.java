package com.kh.day11.iostream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_CodeRead {
	public static void main(String[] args) {
		//Exam_FileCopy.java파일을 읽어서 콘솔에 출력해보기
		InputStream is = null;
		try {
			is = new FileInputStream("src\\com\\kh\\day11\\iostream\\exercise\\Exam_FileCopy.java");
			int readByteCount;
			byte[] readBytes = new byte[1024];
			String result = "";
			while((readByteCount = is.read(readBytes)) != -1) {
				result += new String(readBytes, 0 ,readByteCount);
			}
			System.out.println(result);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
