package com.kh.day09.objecpkg;

public class Point {
	private int x, y;

	public Point() {}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 눈으로 보이지 않는 것을 봐야 할 때 많이 사용 함
	@Override
	public String toString() {
		return "x : " + this.x + ", y : " + this.y;
	}
	
	public boolean equals(Object obj) {
	Point point = (Point)obj;
	if(x == point.x && y == point.y) {
		return true;
	}
	else {
		return false;
	}
}
}
