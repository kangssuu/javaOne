package com.kh.day08.oop.homework.Q5;

public class Person {
	// 이름
	private String name;
	// 돈
	int money;
	// 커피 사먹기
	
	public Person() {}
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyCoffee(Cafe caffe, int money) {
		// 돈을 가지고 커피가 나와야 함
//		this.money = this.money - money;
		this.money -= money;
//		sum = sum + num;
//		sum += num;
		caffe.makeCoffee(money);
	}			
	
	public void printInfor() {
		System.out.println(this.name + "님의 잔액은 " + this.money + "원 입니다.\n");
	}
}
