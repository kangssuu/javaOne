package com.kh.day11.iostream.Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Reader {
	public static void main(String[] args) {
		Reader reader = null;
		// Cannot instantiate the type Reader => 추상클래스는 객체로 만들 수 없음

		try {
			// 이런 것들은 Checked Exception이라고 함
			// Unhandled exception type FileNotFoundException => try-catch문 써라(쓰라고 강제하는 중 =>
			// 예외처리 해야하기 때문임)
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");

			while (true) {
				// Unhandled exception type IOException => IOException에 대비해야 함
				int readData = reader.read();
				if (readData == -1) {break;}
				System.out.print((char) readData);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();  // 스트림은 항상 자원을 해제해 줘야 다른 애들이 쓸 수 있음
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
