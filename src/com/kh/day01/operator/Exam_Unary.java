package com.kh.day01.operator;

public class Exam_Unary {
	public static void main(String [] args) {
		// 단항 연산자
//		int a = 1;
//		System.out.println(a++);  // 후위연산(나중연산) 식 먼저 수행 후 +함
//		System.out.println(++a);  // 전위연산(먼저연산) +먼저 하고 식 수행 함
	
		int a = 10, b = 20, c = 30;
		a++;
		System.out.println(a);
		b = (--a) + b;
		System.out.println(b);
		c = (a++) + (--b);
		System.out.println(c);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
	
		boolean flag = true;
		flag = !!!!flag;
		System.out.println("flag : " + flag);
	
		int x = 100, y = 33, z = 0;
		x--;
		System.out.println(x);  // x = 99, y = 33, z = 0
		z = x-- + --y;  // x = 99, y = 32, z = 131
		System.out.println(z);  // x = 98, y = 32, z = 131
		x = 99 + x++ + x;  // x = 98 -> 99 
		System.out.println(x);  // x = 296
		y = y-- + y + ++y;  // y = 32 -> 31 -> 32
		System.out.println(y);  // y = 95
		System.out.println("x : " + x);  // x = 296
		System.out.println("y : " + y);  // y = 95
		System.out.println("z : " + z);  // z = 131
	}
}
