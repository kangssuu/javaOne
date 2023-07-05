package com.kh.day07.oop.polymorphism.exercise;

class SuperClass {
	void paint() {
		draw();  // 8번줄을 실행할 지 18번줄을 실행할지 정해지지 않은 상태임.
		// sub클래스에도 draw가 있어서 subclass에 있는 draw를 실행했나?
		// -> sub클래스에 있는 draw가 오버라이딩 되어 있어 동적바인딩으로 인해 우선 실행 됨
	}
	void draw() {
		System.out.println("Super Object");
	}
}

class SubClass extends SuperClass{
	void paint() {
		super.paint();
		super.draw();
	}
	void draw() {
		System.out.println("Sub Object");
	}
}

public class Exercise_Overriding{
	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint();
	}
}