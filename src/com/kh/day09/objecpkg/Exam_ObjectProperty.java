package com.kh.day09.objecpkg;

public class Exam_ObjectProperty {  // 클래스
	
	public static void print(Object obj) {  // 메소드
		System.out.println("클래스 이름 : " + obj.getClass().getName());
		System.out.println("해시 코드 값 : " + obj.hashCode());  // 해시코드 값 : 고유 값
		System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
		System.out.println("객체 출력 : " + obj);
	}
	
	public static void main(String[] args) {  // main 메소드
		Point p = new Point(2, 3); 
		Point p2 = new Point(2, 3); 
		print(p);
		print(p2);
		
		// Object 클래스의 equals() 메소드 : 내용 비교
		String javaStr = "Java";
		String javaStr2 = "Java";
		String javaStr3 = new String("Java");  // new하면서 새로만들어져서 주소가 달라져버림
		// 그동안 문자열을 비교한게 아님. 주소를 비교했던거임
		String[] strArrs = new String[10];
		strArrs[0] = "Java";
		strArrs[1] = "Java";
//		if(javaStr == "Java") {
//		if(javaStr == javaStr2) {
//		if(strArrs[0] == strArrs[1]) {
//		if(javaStr == javaStr3) {
		if(javaStr.equals(javaStr3)) {
			System.out.println("같습니다.");
		}
		else {
			System.out.println("다릅니다.");
		}
	}
}
