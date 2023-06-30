package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram2 {
	Student student = new Student();
	public static void main(String[] args) {
//		====== 메인 메뉴 ======
//		1. 성적입력
//		2. 성적출력
//		3. 종료
//		선택 : 1
		finish: 
		while (true) {
			Scanner sc = new Scanner(System.in);
			printMenu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Student.inputScore();
				break;
			case 2:
				Student.printStudentScore();
				break;
			case 3:
				showGoodBye();
				break finish;
			default:
				printException();
			}
		}
	}

	public static void printMenu() {
		System.out.println("========= 메인 메뉴 =========");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}
	
	public static void printScore() {
		int sum = Student.kor + Student.eng + Student.math;
		System.out.println("========= 성적 출력 =========");
		System.out.printf("국어 : %d\n", Student.kor);
		System.out.printf("영어 : %d\n", Student.eng);
		System.out.printf("수학 : %d\n", Student.math);
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", (double)sum / 3);
	}

	public static void showGoodBye() {
		System.out.println("프로그램이 종료되었습니다.");
	}

	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴를 선택해 주세요");
	}
}
