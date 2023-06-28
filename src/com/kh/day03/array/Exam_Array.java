package com.kh.day03.array;

public class Exam_Array {
	public static void main(String [] args) {
		int num;  // 변수의 선언
		num = 0;  // 변수의 초기화
		// int num = 0;
		int nums [];  // int[] nums;  // 배열의 선언
		nums = new int[10];  // 배열의 할당
		// new하면 메모리에 공간이 할당됨(?)
		// nums는 배열의 주소이다. 
		// []는 연산이고 숫자가 들어가서 1칸씩 이동하여 값을 가져옴.
		nums[0] = 2;  // 값 초기화
		System.out.println(nums[0]);
		System.out.println("배열의 크기 : " + nums.length);
		// 배열의 할당 후 값을 초기화하지 않으면 자료형의 기본값이 들어감
		// int의 기본값 : 0, String의 기본값 : null
		// 0은 데이터가 없음을 나타냄
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + "");
		}
	}
}
// int	 abc						[];
// 타입  배열에 대한 레퍼런스 변수  배열선언
// 레퍼런스 변수 = 참조 변수

// 참조변수
//  └─>	자료형 - 기본형 : 실제값 저장
//			   - 참조형 (String) : 주소 저장
