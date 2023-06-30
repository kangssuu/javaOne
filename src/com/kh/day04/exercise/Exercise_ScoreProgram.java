package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	public static void main(String[] args) {
//		int kor = 0;
//		int eng = 0;
//		int math = 0;
//		int sum = 0;
//		finish :
//		while (true) {
////			====== 메인 메뉴 ======
////			1. 성적입력
////			2. 성적출력
////			3. 종료
////			선택 : 1
//			Scanner sc = new Scanner(System.in);
//			System.out.println("========= 메인 메뉴 =========");
//			System.out.println("1. 성적입력");
//			System.out.println("2. 성적출력");
//			System.out.println("3. 종료");
//			System.out.print("선택 : ");
//			int choice = sc.nextInt();
////			int[] score = new int[3];
//			switch (choice) {
//			case 1:
////				====== 성적 입력 =======
////				국어 : 100
////				영어 : 90
////				수학 : 80
//
//				System.out.println("========= 성적 입력 =========");
//				System.out.print("국어 : ");
//				kor = sc.nextInt();
//				System.out.print("영어 : ");
//				eng = sc.nextInt();
//				System.out.print("수학 : ");
//				math = sc.nextInt();
//
////				for(int i = 0; i < score.length; i++ ) {
////					score[i] = sc.nextInt();
////				}  for문 안 되나 봄 -> 될 듯
//				break;
//			case 2:
////				====== 성적 출력 ======
////				국어 : 100
////				영어 : 90
////				수학 : 80
////				총점 : 270
////				평균 : 90.00
//				System.out.println("========= 성적 출력 =========");
////				for(int i = 0; i < score.length; i++) {
////					sum += score[i];
////				}  
////				System.out.println("국어 : " + score[0]);
////				System.out.println("영어 : " + score[1]);
////				System.out.println("수학 : " + score[2]);
////				System.out.println("총점 : " + sum);
////				System.out.println("평균 : " + sum / score.length);
//				// for문 안되나봥 (-> 될거같음)
//				
//				sum = kor + eng+ math;
//				System.out.printf("국어 : %d\n", kor);
//				System.out.printf("영어 : %d\n", eng);
//				System.out.printf("수학 : %d\n", math);
//				System.out.printf("총점 : %d\n", sum);
//				System.out.printf("평균 : %.2f\n", (double)sum / 3);
//				break;
//
//			case 3:
//				System.out.println("프로그램이 종료되었습니다.");
//				break finish;
//
//			default:
//				System.out.println("잘못입력하셨습니다. 메뉴를 선택해 주세요");
//			}
//		}
			
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		int[] score = new int[3];
		finish :
		while (true) {
//			====== 메인 메뉴 ======
//			1. 성적입력
//			2. 성적출력
//			3. 종료
//			선택 : 1
			Scanner sc = new Scanner(System.in);
			System.out.println("========= 메인 메뉴 =========");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
//				====== 성적 입력 =======
//				국어 : 100
//				영어 : 90
//				수학 : 80
				System.out.println("========= 성적 입력 =========");
				System.out.println("국어 : ");
				System.out.println("영어 : ");
				System.out.println("수학 : ");

				for(int i = 0; i < score.length; i++ ) {
					score[i] = sc.nextInt();
				}  
				
				break;
			case 2:
//				====== 성적 출력 ======
//				국어 : 100
//				영어 : 90
//				수학 : 80
//				총점 : 270
//				평균 : 90.00
				System.out.println("========= 성적 출력 =========");
				for(int i = 0; i < score.length; i++) {
					sum += score[i];
				}  
				System.out.println("국어 : " + score[0]);
				System.out.println("영어 : " + score[1]);
				System.out.println("수학 : " + score[2]);
				System.out.println("총점 : " + sum);
				System.out.printf("평균 : %.2f\n", (double)sum / score.length);
				sum = 0;
				break;

			case 3:
				System.out.println("프로그램이 종료되었습니다.");
				break finish;

			default:
				System.out.println("잘못입력하셨습니다. 메뉴를 선택해 주세요");
			}
		}
	}
}
