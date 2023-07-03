package com.kh.day06.oop.objectarray;

public class Circle {
	int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {  // void : 반환 값 없음
		// 반환 값 있을 땐 return 써줘야 함
		double area = 3.14 * radius * radius;
		return area;
	}
}
