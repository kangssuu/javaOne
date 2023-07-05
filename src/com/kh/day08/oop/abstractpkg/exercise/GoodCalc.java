package com.kh.day08.oop.abstractpkg.exercise;

import java.util.Scanner;

public class GoodCalc extends Calculator{
	// The type GoodClac must implement the inherited abstract method Calculator.add(int, int)
	int sum = 0;
//	int[] arrs = new int[2];
//	double avg;
	@Override
	public int add(int a, int b) {
		// a와 b를 합하여 리턴
		sum = a + b;
		return sum;
	}

	@Override
	public int substract(int a, int b) {
		// a와 b를 빼서 리턴
//		sum = a - b;
//		return sum;
		return a - b;
	}

	@Override
	public double average(int[] a) {
		// 배열을 입력받아 평균을 구한뒤 그 값을 리턴
		for(int i = 0; i < a.length; i++)
			sum += a[i];
		double avg = sum / (double)a.length;
		return avg;
//		for(int i = 0; i < arrs.length; i++) {
//			Scanner sc = new Scanner(System.in);
//			arrs[i] = sc.nextInt();
//			for (int j = 0; j < 1; j++) {
//				sum += arrs[i];
//			}
//		}
//		avg = (double)sum / arrs.length;
//		return avg;
	}
	
}