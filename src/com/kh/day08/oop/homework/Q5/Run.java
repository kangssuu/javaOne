package com.kh.day08.oop.homework.Q5;

public class Run {
	public static void main(String[] args) {
		Person kim = new Person("김씨", 10000);
		kim.buyCoffee(new StarCaffe(), 5500);
		kim.printInfor();
		Person lee = new Person("이씨", 20000);
		lee.buyCoffee(new BeanCaffe(), 4500);
		lee.printInfor();
	}
}
