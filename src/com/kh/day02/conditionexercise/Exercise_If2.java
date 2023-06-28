package com.kh.day02.conditionexercise;

import java.util.Scanner;

public class Exercise_If2 {
	public static void main(String [] args) {
		// switch 문을 이용하여 커피 메뉴의 가격을 알려주는 프로그램을 작성하라. 
		// 에스프레소, 카푸치노, 카페라떼는 3500원이고, 아메리카노는 2000원이다.
		System.out.println("메뉴 : 에스프레소, 카푸치노, 카페라떼, 아메리카노");
		System.out.println("메뉴를 선택하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		String menu = sc.next();
		switch (menu) {
			case "에스프레소" :
				System.out.println("3500원 입니다.");
				break;
			case "카푸치노" :
				System.out.println("3500원 입니다.");
				break;
			case "카페라떼" :
				System.out.println("3500원 입니다.");
				break;
			case "아메리카노" :
				System.out.println("2000원 입니다.");
				break;
			default :
				System.out.println("없는 메뉴입니다.");
				
		}
		
//		// 다른방법
//		int price = 0;
//		switch (menu) {
//		case "에스프레소" :
//		case "카푸치노" :
//		case "카페라떼" : price = 3500; break;
//		// 가격이 같으면 한줄만 써도 에스프레소나 카푸치노가 여기까지 내려옴 -> break문이 없기 때문에
//		case "아메리카노" : price = 2000; break;
//		default :
//			System.out.println("없는 메뉴입니다.");
//		}
//		System.out.println(price + "원입니다.");
		
	}
}
