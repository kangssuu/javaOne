package com.kh.day11.iostream.fileio;

import java.io.File;
import java.io.IOException;

public class Exam_File {
	public static void main(String[] args) {
		File file = new File("E:\\test\\top.jpg");
		String fileName = file.getName();
		String path   =   file.getPath();
		String parent = file.getParent();
		System.out.printf("파일 이름 : %s \n파일경로 : %s \n부모폴더 : %s\n"
				, fileName, path, parent);
		
		System.out.printf("파일이 존재하는가? : %d\n파일이 맞는가? : %d\n폴더가 맞는가? : %d"
				, file.exists()
				, file.isFile()
				, file.isDirectory());
		
	}
	public void folderMake() {
		
		File folderMake = new File("src/com/kh/day11/iostream/fileio/newfolder");
		folderMake.mkdir();  //mkdirs()메소드는 폴더를 만드는 메소드인데 계층형 폴더를 한번에 만들어주는 메소드임 
		System.out.println("폴더가 만들어졌습니다.");
	}
	public void fileMake() {
		try {
			File fileMake = new File("src/com/kh/day11/iostream/file1.txt");
			fileMake.createNewFile();
			System.out.println("파일이 만들어졌습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
