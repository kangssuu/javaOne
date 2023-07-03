package com.kh.day03.array.run;

import java.util.Scanner;
import java.util.Random;

import com.kh.day03.array.exercise.Exercise_Array1; // 다른 클래스에서 만든 함수 불러오기 위함
import com.kh.day03.array.exercise.Exercise_For;

public class Run {
	public static void main(String[] args) {
		// Exercise_Array1 cannot be resolved to a type : Run은 Exercise_Array1가 어디있는지 알지
		// 못 함
//		Scanner
//		Random
//		Exercise_Array1 exArr = new Exercise_Array1();  //new : 메모리 할당한다
//		exArr.exercise1();  // Exercise_Array1클래스 파일 안에 있는 exercise1()함수 불러오기
//		exArr.exercise2();
//		exArr.arryCopyExercise();
//		exArr.lottoExercise();

//		Exercise_For exFor = new Exercise_For();
//		exFor.forExercise2();
//		exFor.forDouble1Exercise1();

		// 반복문_실습문제_01
		// 1번
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		// 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
//			System.out.println("숫자를 입력해주세요 : ");
//			Scanner sc = new Scanner(System.in);
//			int input = sc.nextInt();
//			if(input < 1) { 
//				System.out.print("1 이상의 숫자를 입력해주세요");
//			}
//			for(int i = 1; i <= input; i++) {
//				System.out.print(i + " ");
//			}

		// 2번
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
//			System.out.println("숫자를 입력해주세요 : ");
//			Scanner sc = new Scanner(System.in);
//			int input = sc.nextInt();
//			if(input < 1) { 
//				System.out.print("1 이상의 숫자를 입력해주세요");
//			}
//			for(int i = input; i >= 1; i--) {
//				System.out.print(i + " ");
//			}

		// 3번
		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
//			System.out.println("숫자를 입력해주세요 : ");
//			Scanner sc = new Scanner(System.in);
//			int input = sc.nextInt();
//			int sum = 0;
//			if(input >= 0) {	// 양수일 때
//				for(int i = 1; i <= input; i++) {
//					sum += i; 
//				}
//			}
//			else {		// 음수일 때
//				for(int i = input; i <= 1; i++) {
//					sum += i; 
//				}
//			}
//			System.out.print(sum);

		// 4번
		// 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
//			System.out.println("숫자를 입력해주세요 : ");
//			Scanner sc = new Scanner(System.in);
//			int input = sc.nextInt();
//			int input2 = sc.nextInt();
//			
//			if(input < 1) { 
//				System.out.print("1 이상의 숫자를 입력해주세요");
//			}
//			else if (input2 < 1) {
//				System.out.print("1 이상의 숫자를 입력해주세요");
//			}
//			else {
//				if(input < input2) {	// 처음입력 받은 숫자가 두번째 숫자보다 작을 때
//					for(int j = input+1; j < input2; j++) {
//						System.out.print(j + " ");
//					}
//				}
//				else if(input > input2) {	// 처음입력 받은 숫자가 두번째 숫자보다 클 때(역순으로 출력되게 함) 
//					for(int i = input-1; i > input2; i--) {
//						System.out.print(i + " ");
//					}
//				}
//			}

		// 5번
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
//			System.out.println("숫자를 입력하시면 해당 단을 출력합니다. : ");
//			Scanner sc = new Scanner(System.in);
//			int dan = sc.nextInt();
		//
//			for (int i = 1; i <= 9; i++) {
//				System.out.println(dan + " * " + i + " = " + dan * i);
//			}

		// 6번
		// 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		// 단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
//			System.out.println("숫자를 입력해주세요 : ");
//			Scanner sc = new Scanner(System.in);
//			int dan = sc.nextInt();
		//
//			if (dan > 9) {
//				System.out.print("9 이하의 숫자만 입력해주세요");
//			} 
//			else {
////				for (int i = dan; i <= 9; i++) {
////					System.out.println("\n");
////					for (int j = 1; j <= 9; j++) {
////						System.out.println(i + " * " + j + " = " + i * j);
////					}
////				}
//				while (dan <= 9) {  // for문 대신 while문 쓰기
////					for (int j = 1; j <= 9; j++) {  
////						System.out.println(dan + " * " + j + " = " + dan * j);
////					}
//					int j = 1;  // 중첩for문 대신 중첩 while문 쓰기
//					while (j <= 9) {
//						System.out.println(dan + " * " + j + " = " + dan * j);
//						j++;
//					}
//					dan++;
//				}
//			}

		// 반복문_실습문제_02

		// 1번
		// 1부터 사용자에게 입력 받은 수까지 중에서
		// 1) 2와 3의 배수를 모두 출력하고
		// 2) 2와 3의 공배수의 개수를 출력하세요.
//			System.out.println("숫자 하나 입력하세요 : ");
//			Scanner sc = new Scanner(System.in);
//			int input = sc.nextInt();
//			System.out.print("2의 배수는 : ");
//			for (int i = 1; i <= input; i++) {
////				if(i % 2 == 0 || i % 3 == 0) {  // 2와 3의 배수 한번에 출력
////					System.out.print(i + " ");
////				}
//				if(i % 2 == 0) {
//					System.out.print(i + " ");
//				}
//			}
//			System.out.println("입니다.");
//			System.out.print("3의 배수는 : ");
//			for (int i = 1; i <= input; i++) {
//				if(i % 3 == 0) {
//					System.out.print(i + " ");
//				}
//			}
//			System.out.println("입니다.");
//			System.out.print("2와 3의 공배수는 : ");
//			for (int i = 1; i <= input; i++) {
//				if(i % 2 == 0 && i % 3 == 0) {
//					System.out.print(i + " ");
//				}
//			}
//			System.out.println("입니다.");

		// 2번
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 *
		 * ex. 정수 입력 : 3
		 *
		 **
		 ***
		 **
		 *
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		int input = sc.nextInt();
//		int count = 0;
//		for (int j = 0; j < (input * 2) - 1; j++) { // 몇 줄 돌건지
//			if (j >= input) {
//				for (int i = count; i < input - 1; i++) { // 몇개 찍을건지 
//					System.out.print("*");
//				}
//				count++;
//			} 
//			else {
//				for (int i = 0; i < j + 1; i++) { // 몇개 찍을건지 j =4
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}   
//		// 오 이거 힘들었다

		// 3번
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 *
		 * ex. 정수 입력 : 4
		 *
		 ***
		 *****
		 *******
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		int input = sc.nextInt();
//		for (int i = 1; i < input + 1; i++) {
//			for (int j = 1; j < i * 2; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 4번
		/*
		 * 다음과 같은 실행 예제를 구현하세요.
		 *
		 * ex. 정수 입력 : 5
		 *****
		 * * * *
		 *****
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		int input = sc.nextInt();
//		for (int i = 0; i < 3; i++) {
//			if(i == 1) {
//				for(int r = 0; r < input -1; r++) {
//					System.out.print("* ");
//				}
//			}
//			else {
//				for (int k = 0; k < input; k++) {
//				System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
//		// 실행 결과가 이거 맞나?

		// 5번
		// 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		// 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("하나의 숫자를 입력해 주세요 : ");
		int number = sc.nextInt();
		if (number < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}
//		else {
//			if(number % number == 0) {
//				
//			}
//		}
		

		// 6번
		// 위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
		// “잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.

		// 7번
		// 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		// 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
	}
}
