package com.kh.day09.wrapperpkg;

public class Exam_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Integer su = Integer.valueOf(0); // static 메소드
//		su = new Integer(0);
		// The constructor Integer(int) has been deprecated since version 9 and marked
		// for removal
//		없어질 거니까 쓰지 말라는 뜻
//		su = null;
		// 박싱과 언박싱
		su = Integer.valueOf(1026);
		su = 1026; // 오토 - 박싱
		
		int suNum = su.intValue();
		suNum = su; // 오토 - 언박싱
		
		String openDay = "20230515";
		int openDate = Integer.parseInt(openDay);
		System.out.println(openDate);
		System.out.println(Character.toLowerCase('A'));  //toLowerCase('문자') => 소문자로 만들기
		System.out.println(Character.toLowerCase('B'));
		
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "은 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "는 영문자");
		}
	}

}
