package com.kh.day11.iostream.Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
	public static void main(String[] args) {
		Reader reader = null;

		try {
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			int readCharCount;
			char[] cBuf = new char[3];
//			int i = 0;
			String result = "";
			while (true) {

				readCharCount = reader.read(cBuf);
//				System.out.println(readCharCount);
				if (readCharCount == -1)
					break;
				result += new String(cBuf, 0, readCharCount); // cBuf의 값을 0부터 readCharCount까지
//				for(char c : cBuf) {
//					System.out.print(c);
//				}
//				System.out.println();
////				i++;
				// 마지막에 cdb나오는 이유는 앞에 출력한 것에서 덮어씌우는 것이기 때문에 c를 덮어쓰고 나머지 db는 덮어쓸게 없어서 그대로 출력됨
			}
			System.out.println(result);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // finally : 예외발생 여부에 상관없이 무조건 실행함
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
