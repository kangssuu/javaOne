package com.kh.day09.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
	public static void main(String[] args) {
		// 홍길동/장화/홍련/콩쥐/팥쥐 의 문자열 데이터를
		// '/' 기준으로 잘라서 홍련만 출력하시오
		String data = "홍길동/장화/홍련/콩쥐/팥쥐";
		// 1. 전체 출력
		// 2. 홍련만 출력
		StringTokenizer st = new StringTokenizer(data, "/"); 
		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
			String token = st.nextToken();  // nextToken() : 다음꺼 실행
			if(token.equals("홍련")) {  // token의 내용과 "홍련"을 비교
				System.out.println(token);
			}
		}
	}
}
