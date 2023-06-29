package com.kh.day04.dimarray.exercise;

import java.util.Random;

public class Exercise_DimArray {
	public void exercise1() {
		int[][] arrs = new int[5][5];
		int count = 1;
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 4; j <= 4; j--) {
				arrs[i][j] = count;
				count++;
				if (j == 0) {
					break;
				}
			}
		}
		// 출력
		for (int n = 0; n < arrs.length; n++) {
			for (int p = 0; p < arrs[n].length; p++) {
				System.out.print(arrs[n][p] + " ");
			}
			System.out.println();
		}
	}

	public void exercise2() {
		int[][] arrs = new int[5][5];
		int count = 1;
		for (int j = 0; j < arrs.length; j++) {
			for (int h = arrs.length - 1; h >= 0; h++) {
				arrs[h][j] = count;
				count++;
			}
		}
//		for (int i = 0; i < arrs.length; i++) {
//			for( int j = 0; j < arrs[i].length; j++) {
//				arrs[j][i] = count;
//				count ++;
//			}
//		}
//		for (int i = 0; i < arrs.length; i++) {
//			for (int j = 0; j < arrs[i].length; j++) {
//				System.out.print(arrs[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

	public void exercise3() {
		int[][] arrs = new int[5][5];
		int count = 1;

		for (int h = 0; h < arrs.length; h++) {
			for (int s = 0; s < arrs.length; s++) {
				arrs[s][h] = count;
				count++;
			}
		}
//		for (int i = 0; i < arrs.length; i++) {
//			for( int j = 4; j <= 4; j--) {
//				arrs[j][i] = count;
//				count ++;
//				if(j == 0) {
//					break;
//				}
//			}
//		}
		// 출력
		for (int n = 0; n < arrs.length; n++) {
			for (int p = 0; p < arrs[n].length; p++) {
				System.out.print(arrs[n][p] + " ");
			}
			System.out.println();
		}
	}

	public void exercise4() {
		int[][] arrs = new int[5][5];
		int count = 1;
		for (int i = 0; i < 5; i++) {
			if(i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					arrs[i][j] = count;
					count++;
				}
			}
			else {
				for (int j = 4; j >= 0; j--) {
					arrs[i][j] = count;
					count++;
				}
			}
//			if (i == 0) {
//				for (int j = 0; j < arrs[i].length; j++) {
//					arrs[i][j] = count;
//					count++;
//				}
//			} else if (i % 2 == 1) {
//				for (int j = 4; j <= 4; j--) {
//					arrs[i][j] = count;
//					count++;
//					if (j == 0) {
//						break;
//					}
//				}
//			} else {
//				for (int j = 0; j < arrs[i].length; j++) {
//					arrs[i][j] = count;
//					count++;
//				}
//			}
		}
		// 출력
		for (int n = 0; n < arrs.length; n++) {
			for (int p = 0; p < arrs[n].length; p++) {
				System.out.print(arrs[n][p] + " ");
			}
			System.out.println();
		}
	}

	public void exercise5() {
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		double sum = 0;
		double[][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		for(int i = 0; i < score.length; i++) {
			for(int g = 0; g < score[i].length; g++) {
//				System.out.printf("%2.1f ", score[i][g]);
				sum += score[i][g];
			}
//			System.out.println();
		}
		int frontLength = score.length;
		int backLength = score[0].length;
		double result = sum / (frontLength * backLength);
		System.out.printf("4년 전체 평점 평균은 : %2.1f\n", result);
	}	
}
