package com.kh.day02.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {
	public static void main(String [] args) {
		// 동전 앞뒤 맞추기!!
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 1
//		맞췄습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 2
//		맞췄습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 2
//		틀렸습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 1
//		틀렸습니다.
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		 
//		int num = 0;
//		int coin = 0;
//		for(int i = 1; i < 5; i ++) {
//			System.out.println("☆★☆★☆★☆★☆★ 동전 앞 뒤 맞♪추♩기♪ ★☆★☆★☆★☆★☆");
//			System.out.println("숫자를 입력해주세요! (1. 앞면 / 2. 뒷면) :");
//			num = sc.nextInt();
//			coin = rand.nextInt(2) + 1;
//			if(num == coin) {
//				System.out.println("맞췄습니다.♧\n");
//			}
//			else if (num >= 3) {
//				System.out.println("1 과 2 중에 입력해 주세요\n");
//			}
//			else {
//				System.out.println("틀렸습니다.♨\n");
//			}
//		}
		
		System.out.println("☆★☆★☆★☆★☆★ 동전 앞 뒤 맞♪추♩기♪ ★☆★☆★☆★☆★☆");
		while(true) {
			System.out.println("숫자를 입력해주세요! (1. 앞면 / 2. 뒷면) :");
			int num = sc.nextInt();
			if (num < 0 || num > 2) {
				System.out.println("1 과 2 중에 입력해 주세요\n");
				continue;  // 반복문을 빠져나와서 다시 위에 부터 실행
				
//				do {
//					System.out.println("숫자를 입력해주세요! (1. 앞면 / 2. 뒷면) :");
//					num = sc.nextInt();
//				}
//				while(num < 0 || num > 2);
			}
			int coin = rand.nextInt(2) + 1;
			// 1부터 2까지의 랜덤한 수
			// 0부터 1까지의 랜덤한 수 -> nextInt(2)
			// 1부터 2까지의 랜덤한 수 -> nextInt(2) + 1
			
			if (num == coin) {
				System.out.println("맞췄습니다.♧\n");
			}
			else {
				System.out.println("틀렸습니다.♨\n");
			}
		}
	}
}
