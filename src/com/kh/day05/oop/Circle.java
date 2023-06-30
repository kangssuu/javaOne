package com.kh.day05.oop;

public class Circle {  // 객체를 찍어내기 위한 틀 같은 느낌(객체에게 클래스라는 껍데기를 입혀 캡슐화 한다)
	public int radius;	// 원의 반지름
	public String name;  // 원의 이름
	// 객체의 특성(객체가 가지고있어야 할 특징)
	// public : 접근지정자로 다른 모든 클래스의 접근을 허용한다는 의미
	// ===================================> 필드(변수)  
	
	public Circle() {  // 생성자(기본 생성자)
		// 초기화
		radius = 1;
		name = "아무개";  // 필드에 값을 넣음 -> 객체 초기화
		// 반환값 없음. 반환값 없지만 void안써도 됨
		// 생성자 이름은 클래스 이름이랑 똑같아야 함
		// 기본 생성자는 생략 가능 함. 컴파일러가 자동으로 생성해 줌
		// 매개변수 있는 생성자가 있으면 생략 안됨
	}
	// 매개변수가 있는 생성자 => 전달받는 값이 있는 생성자
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	// ===================================> 생성자
	
	public double getArea() {  // 원의 넓이를 구해주는 메소드
		return 3.14*radius*radius;
		// 객체의 행동
	}
	// ===================================> 메소드  


// 클래스 구성

// 클래스 선언 클래스 이름 {
// --------------
//|   필드       |
// --------------
//|   메소드     |
// --------------
// }

//	public static void main(String[] args) {
//		Circle pizza;
//		pizza = new Circle();
//		pizza.radius = 10;
//		pizza.name = "청년피자";
//		double area = pizza.getArea();
//		System.out.println(pizza.name + "의 면적은 " + area);
//	}
}