package com.kh.day08.oop.homework.Q5;

public abstract class Cafe {
	// Q5. 아침 출근길에 김 씨는 4,000원을 내고 별다방에서 아메리카노를 사 마셨습니다.
	// 이 씨는 콩다방에서 4,500원을 내고 라테를 사 마셨습니다. 
	// '06-2 객체간 협력'을 참고하여 이 과정을 객체 지향으로 프로그래밍 해보세요.
	
	String name;
	
	public Cafe() {}
	public Cafe(String name) {
		this.name = name;
	}
	
	// 커피를 만들어줌
	abstract public void makeCoffee(int money);
}
