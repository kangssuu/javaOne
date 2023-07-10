package com.kh.day11.iostream.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {
	// 바이트 스트림을 이용하여 바이너리 파일을 복사하는 프로그램을 작성하라
	// c:\Windows\Web\Wallpaper\Theme1\img1.jpg를 c:\Temp\copyimg.jpg로 복사하였습니다.
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		File src = new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");  // ✿ Theme : 주제 ✿
		File dest = new File("c:\\Temp\\copyimg.jpg");
		int readByte;
		byte[] readBytes = new byte[1024 * 10]; 
		
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			while(true) {
//				readByte = is.read();
				readByte = is.read(readBytes);
//				if(readByte == -1) break;
//				os.write((char)readByte);
				os.write(readBytes, 0, readByte);
				if(readByte < readBytes.length) break;
			}
			is.close();
			os.close();
			System.out.printf("%s를 %s로 복사하였습니다.", src.getPath(), dest.getPath());  // ✿ path : 경로 ✿
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
