package com.kh.day11.iostream.fileio;

import java.io.File;

public class Exam_ShowfileList {
	public static void main(String[] args) {
		File file = new File("C:\\windows");
		File[] subFiles = file.listFiles();  // 서브파일들을 불러옴
		for(int i = 0; i < subFiles.length; i++) {
			File fOne = subFiles[i];
			long time = fOne.lastModified();
			System.out.printf("%-35s", fOne.getName());
			System.out.print("파일크기 : " + fOne.length()+ " \t");
			// %tb : 현재의 날짜를 영문 약자(월)형시으로 출력 (한글은 숫자 + 월 출력)
			// %td : 현재의 날짜를 01 ~ 31(일) 형식으로 출력
			// %ta : 현재의 날짜를 요일 영문 약자 형식으로 출력(한글 월/화/수 ... 출력)
			// %tT : 현재의 시간을 몇시:몇분:몇초 형식으로 출력
			System.out.printf("\t수정한 시간 : %tb %tb %ta %tTs\n"
					,time, time, time, time);
		}
//		Reader reader = null;
//		File file =  new File("C:\\windows");
//		String fileName = file.getName();
//		String path = file.getPath();
//		String parent = file.getParent();
//		System.out.printf("%s, %s, %s" , fileName, path, parent);
//		System.out.printf("------ %s의 서브 리스트 입니다. ------", fileName);
//		
//		try {
//			reader = new FileReader("C:\\windows");
//			char[] cBuf = new char[1024];
//			int readCharCount;
//			String result = "";
//			
//			while((readCharCount = reader.read(cBuf)) != -1) {
//				
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
