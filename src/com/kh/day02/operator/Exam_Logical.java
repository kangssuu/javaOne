package com.kh.day02.operator;

public class Exam_Logical {
	public static void main(String [] args) {
		System.out.println("논리연산자 예제");
		int num1 = 50;
		int num2 = 30;
		boolean result1, result2, result3, result4;
		// 남자이면서 평균평좀 4.3이상인 사람
		// 컴퓨터공학과 또는 경영학과인 사람  같은 조건있을 때 사
		result1 = (num1 < num2) && (num1 == num2) ;  // false
		result2 = (num1 < num2) || (num1 == num2);  // false
		result3 = (num1 > num2) && (num1 != num2);  // true
		result4 = (num1 > num2) || (num1 == num2);  // true
		
		System.out.println("result1의 결과 값 : " + result1);
		System.out.println("result2의 결과 값 : " + result2);
		System.out.println("result3의 결과 값 : " + result3);
		System.out.println("result4의 결과 값 : " + result4);
	}
}
