package com.kh.day03.array.exercise;
import java.util.Scanner;
public class Exercise_While {
	
	public void whileExercise1() {
		// while문을 이용하여 -1이 입력될 때 까지 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오
		// 정수 하나 입력 : 3
		// 정수 하나 입력 : 4
		// 정수 하나 입력 : 7
		// 정수 하나 입력 : -1
		// 입력하신 수의 합은 14입니다.
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int sum = 0;
//		
//		while (i != -1) {
//			System.out.println("정수를 입력하세요 : ");
//			i = sc.nextInt();
//				sum += i;
//		}
//		System.out.println(sum + 1);
		
//		// 첫번째 방법 
//		while(true) {
//			System.out.print("정수 하나 입력 : ");
//			i = sc.nextInt();
//			if(i != -1) {
//				sum += i;
//			}
//			else {
//				break;
//			}
//		}
//		System.out.println("입력하신 수의 합은 : " + sum);
		
//		// 두번째 방법
//		while(i != -1) {
//			System.out.print("정수 하나 입력 : ");
//			i = sc.nextInt();
//			sum += i;			
//		}
//		System.out.println("입력하신 수의 합은 : " + (sum + 1));
		
		// 세번째 방법
		System.out.print("정수 하나 입력 : ");
		i = sc.nextInt();
		while(i != -1) {
			sum += i;
		}
	}
	
	
	public void whileExercise2() {
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오
		
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			// i += 2;
			// sum += i;
			if(i % 2 == 1 ) {
				sum += i;
			}
			i++;
		}
		System.out.println("1 ~ 100사이의 홀수의 합 : " + sum);
	}
}
