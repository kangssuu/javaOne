package com.kh.day08.oop.abstractpkg;

class Line extends Shape {
	// 4. The type Line must implement the inherited abstract method Shape.draw()  => 추상메소드 오버라이딩 해. 안할거면 클래스 앞에 abstract 선언 해
	@Override
	public void draw() {
		
	}
}
public abstract class Shape {
	
	public Shape() {}  // 생성자
	
	public void paint() {}  // 메소드
	abstract public void draw();  // 메소드
	// 1. Abstract methods do not specify a body  => 몸체가 없어야 돼 (몸체{} 없애고 세미콜론 찍음)
	// 2. The abstract method draw in type Shape can only be defined by an abstract class  => 추상메소드는 추상클래스에 있어야 돼 (클래스에 abstract 선언 함)
	// 3. The type Shape must be an abstract class to define abstract methods  => 클래스 앞에 abstract 선언해 (1번 실행시 클래스선언 문에서 나오는 오류)
}
