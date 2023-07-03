package com.kh.day03.array.exercise;

import java.util.Scanner;
import java.util.Random;

public class Exercise_Array1 {

	public void exercise1() {
		// 양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램 작성하시오.
		Scanner sc = new Scanner(System.in);
		// int num = sc.nextInt();
		int[] nums = new int[5];
		int max = 0;

		// nums에 값 5개 넣기
//		nums[0] = sc.nextInt();
//		nums[1] = sc.nextInt();
//		nums[2] = sc.nextInt();
//		nums[3] = sc.nextInt();
//		nums[4] = sc.nextInt();

		// 값 5개를 반복문으로 넣기
		for (int i = 0; i < nums.length; i++) {
			System.out.println("양수를 입력하세요 : ");
			nums[i] = sc.nextInt();
//			int num = sc.nextInt();
//			nums[i] = num;
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		// 배열에 들어간 값 확인하기
//		for(int i = 0; i < nums.length; i++) {
//			System.out.println("\n" + nums[i]);
//		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
	}

	public void exercise2() {
		// 배열의 length 필드를 이용하여 배열 크기 만큼 정수를 입력받고
		// 평균을 구하는 프로그램을 작성하라.(단, 배열의 크기는 5이다.)

		int[] nums = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		for (int j = 0; j < nums.length; j++) {
			sum += nums[j];
		}
		System.out.println("평균 : " + (double) sum / nums.length);
		// 배열에 저장된 값을 이용하여 평균구하기
		// for, nums.length, typeTrans, 누적합
	}

	public void arryCopyExercise() {
		// 사용자에게 주민번호를 입력받은 후
		// 성별자리 이루부터 *로 저장도ㅓㅣ어 출력되도록 프로ㅡ램느 작성하시오.
		// 230515-1231517 -> 230515-1******
		// 231026-1231515 -> 231026-1******

		char[] origin = new char[14];
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요 : ");
		String memberNum = sc.next();
		for (int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i);
		}
		char[] copy = new char[14];
		for (int i = 0; i < origin.length; i++) {
			if (i < 8) {
				copy[i] = origin[i];
			} else {
				copy[i] = '*'; // 성별자리 이후엔 *로 값 대입
			}
		}
		// 출력하기
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]);
		}
	}

	public void lottoExercise() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개. 로또 번호의 범위는 1 ~ 45
		int[] lottoNums = new int[6];
		Random rand = new Random();
		// rand.nextInt(10) -> 0부터 9까지
		// 1부터 45까지 -> ??
		// 0부터 44까지 => rand.next(45)+1
		
//		int count = 1;
//		int check = 1;
		// 중복없이 1 ~ 45 사이의 랜덤한 수를 6개 뽑는 것
		for(int i = 0; i < 6; i++) {
			lottoNums[i] = rand.nextInt(45)+1;
			for(int e = 0; e < i; e++){
				if(lottoNums[i] == lottoNums[e]) {
					// 다시 뽑아야지
					i--;
					break;
				}
			}
//			count++;
//			check++;
		}
		
		// 버블 정렬 해보기
//		 for의 변수가 증가하기만 하면 됨 그래서 쉬움
//		 단, 안에 있는 for문의 조건식의 최대값은 감소(-1)해야함!
		for(int i = 0; i < lottoNums.length-1; i++) {
			for(int j = 0; j < (lottoNums.length-1)-1; i++) {
				if(lottoNums[j] > lottoNums[j+1]) {
					int tmp = lottoNums[j];  // 왼쪽에 있는 값 지워지기 전에 킵해 놓음.
					lottoNums[j] = lottoNums[j+1];  // 오른쪽에 잇는 놈을 왼쪽에 대입함
					lottoNums[j+1]= tmp;  // 킵해놓은 값을 오른쪽에 대입함
				}
			}
		}
		// 배열 출력하기
		for(int i = 0; i < lottoNums.length; i++) {
			System.out.print(lottoNums[i]+" ");
		}
	}
}
