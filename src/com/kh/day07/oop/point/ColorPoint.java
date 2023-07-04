package com.kh.day07.oop.point;

public class ColorPoint extends Point { // Point클래스를 상속받아 Point클래스의 메소드를 사용할 수 있음
	private String color;

	public ColorPoint() {
		super();  // 슈퍼클래스 생성자인듯
	}

	public ColorPoint(int x, int y, String color) {
//		super.x = x;
//		super.y = y;
		super(x, y);  // 부모클래스에서 가져옴
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() {
		System.out.print(color);
		showPoint(); // 부모클래스에서 상속받음
	}
}
