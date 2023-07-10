package com.kh.day11.iostream.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFileCopy {
	//문자 스트림 FileReader와 FileWriter를 이용하여 
	// C:\windows\system.ini를  c:\Temp\system.txt파일로 복사하는 프로그램을 작성하여라
	public static void main(String[] args) {
		Reader reader = null;
		Writer writer =null;
		File src = new File("C:\\windows\\system.ini");  // 원본 파일 경로 명
		File dest = new File("c:\\Temp\\system.txt");  // 복사 파일 경로 명
		
		try {
			reader = new FileReader(src);
			// 파일 입출력을 이용한 폴더 만들기
			File folderMake = new File("c:\\Temp");
			if(!folderMake.exists()) {  // Temp폴더가 존재하지 않으면   ✿ exists : 존재한다 ✿
				folderMake.mkdir();  // 폴더 생성
			}
//			folderMake.mkdir();  //mkdirs()메소드는 폴더를 만드는 메소드인데 계층형 폴더를 한번에 만들어주는 메소드임 
//			System.out.println("폴더가 만들어졌습니다.");
			writer = new FileWriter(dest);
			int readChar;
			while(true) {
				readChar = reader.read();
				if(readChar == -1) break;
				// write메소드 자리임. 왜냐하면 읽은 값을 써서 파일에 저장해야되기 때문
				writer.write((char)readChar);
			}
			System.out.println("복사 됨");
//			char[] cBuf = new char[1024];
//			int readCharCount;
//			while((readCharCount = reader.read(cBuf)) != -1) {  // reader.read() => 한 글자씩 읽는거, reader.read(cBuf) => 문자배열 써서 1024 글자씩 읽는 거 
//				writer.write(cBuf, 0, readCharCount);
//				writer.flush();
//			};
//			System.out.println("복사함");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
}
