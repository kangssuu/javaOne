package com.kh.day02.conditionexercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String [] args) {
		//점수와 학년을 입력 받아 60점 이상이면 합격, 
		//미만이면 불합격을 출력한다. 4학년의 경우 70점 이상이어야 합격이다.
		System.out.println("점수를 입력하세요 : ");
		System.out.println("학년을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int grade = sc.nextInt();
		
		if (grade == 4) {
			if (num >= 70) {
				System.out.println("합격");
			}
			else {
				System.out.println("불합격");
			}
		}
		else {
			if (num >= 60) {
			System.out.println("합격");
			}
			else {
			System.out.println("불합격");
			}
		}
	}
}
