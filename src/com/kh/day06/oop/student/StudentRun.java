package com.kh.day06.oop.student;

import java.util.Scanner;

public class StudentRun {
//	static int index = 0;
	public static void main(String[] args) {
		Student[] std = new Student[2];
		finish: 
			while (true) {
				int choice = printMenu();
				switch (choice) {
				case 1: // 학생성적입력
					inputScore(std);
					break;
				case 2: // 학생성적 출력
					printScore(std);
					break;
				case 3: // 재평가여부
					checkPass(std);
					break;
				case 4:
					System.out.println(" 프로그램이 종료되었습니다.");
					break finish;
				default:
					System.out.println("잘못입력하셨습니다. 메뉴를 선택해 주세요");
				}
		}
	}

	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("학생 성적 확인 프로그램");
		System.out.println();
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택  : ");
		int choice = sc.nextInt();
		// 오버로딩
//		System.out.println('A');
//		System.out.println("Hello Java");
//		System.out.println(true);
		return choice;
	}

	public static void inputScore(Student std[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < std.length; i++) {
			System.out.println((i + 1) + "번째 학생 정보 입력");
			System.out.print("학생 이름 입력 : ");
			String name = sc.next();
			System.out.println("1차 점수 입력 : ");
			int score = sc.nextInt();
			System.out.println("2차 점수 입력 : ");
			int score2 = sc.nextInt();

			std[i] = new Student();
			std[i].name = name;
			std[i].score = score;
			std[i].score2 = score2;
		}
	}

	public static void printScore(Student std[]) {
		for (int i = 0; i < std.length; i++) {
			System.out.println((i + 1) + "번째 학생 정보 출력");
			System.out.println(
					std[i].name + " 학생의 점수는 : 1차 점수 : " + std[i].score + "점, 2차 점수 : " + std[i].score2 + "점 입니다.");
		}
	}

	public static void checkPass(Student std[]) {
		for (int i = 0; i < std.length; i++) {
			System.out.println(std[i].name + "학생의 확인결과");
			if (std[i].getAvg() >= 60) {
				if (std[i].score >= 40 && std[i].score2 >= 40) {
					System.out.println("통과입니다.");
				} 
				else if (std[i].score < 40) {
					System.out.println("1차 시험 재평가 대상입니다.");
				} 
				else if (std[i].score2 < 40)
					System.out.println("2차 시험 재평가 대상입니다.");
			} 
			else if (std[i].getAvg() < 60) {
				if (std[i].score < 60) {
					if(std[i].score2 < 60) {
						System.out.println("1차 시험 재평가 대상입니다.");
						System.out.println("2차 시험 재평가 대상입니다.");
					}
					else {
						System.out.println("1차 시험 재평가 대상입니다.");
					}
				} 
				else if (std[i].score2 < 60) {
					System.out.println("2차 시험 재평가 대상입니다.");
				}
			}
		}
	}
}
