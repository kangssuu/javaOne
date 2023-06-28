package com.kh.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
//		// 입력한 정수가 1~100 사이의 숫자인지 확인하세요!
//		// 변수 num에 초기화
//		// 1부터 100사이의 숫자인가? : true
//		System.out.println("1 ~ 100사이의 정수를 입력하세요 : ");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		boolean result;
//		result = ((num >= 1) && (num <= 100)); 
//		System.out.println("1 ~ 100사이의 숫자 입니까? : " + result);
		
//		int a = 50;
//		int b = 30;
//		boolean result = (a != b && a < b);
//		System.out.println(result);
//		result = (a < b || a == b);
//		System.out.println(result);
//		 result = (a > b && a != b);
//		System.out.println(result);
//		 result = (a > b || a == b);
//		System.out.println(result);
		
		int a = 70;
		int b = 55;
		boolean result;
		// &&의 경우 앞이 false면 뒤는 수행하지 않음
		// ||의 경우 앞이 true면 뒤는 수행하지 않음
		result = (a == b || a++ < 100);  //a = 70, b = 55 
		System.out.println(a);  // a = 71
		System.out.println(b);  // b = 55
		System.out.println(result);
		result = (a < b && --b < 55);  // a = 71, b = 55 : and연산에서 앞 조건이 false이므로 뒤는 수행하지 않아 --b는 실행되지 않음
		System.out.println(a);  // a = 71
		System.out.println(b);  // b = 55 
		System.out.println(result);
		result = (a != b && b-- < a++);  // a = 71, b = 55
		System.out.println(a);  // a = 72 : 후치연산 실행 된 결과 값 출력 됨
		System.out.println(b);  // b = 54 : 후치연산 실행 된 결과 값 출력 됨
		System.out.println(result);
		result = (a++ != b || b++ >= 85);  // a = 72, b = 54 : or연산에서 앞 조건이 true이므로 뒤는 수행하지 않아 b++은 실행되지 않음
		System.out.println(a);  // a = 73
		System.out.println(b);  // b = 54
		System.out.println(result);
		
		// a = ?
		System.out.println(a);  // a = 73
		// b = ?
		System.out.println(b);  // b = 54
		
		
	
	}
}
