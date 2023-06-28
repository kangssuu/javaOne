package com.kh.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 변수 word에 초기화
		// 영어 대문자 확인 : true
		System.out.println("문자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		// 문자열에서 첫번째 인덱스 값을 자르니까 문자가 됨
		char word = sc.next().charAt(0);  // .charAt(0) : 0번째 자리 문자 가져오기
		System.out.println("문자 출력 : " + word);
		boolean result;
		result = ((word >= 'A') && (word <= 'Z'));
		System.out.println("대문자입니까? : " + result);
	}
}
