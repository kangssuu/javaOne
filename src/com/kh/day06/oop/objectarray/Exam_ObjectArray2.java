package com.kh.day06.oop.objectarray;

import java.util.Scanner;

public class Exam_ObjectArray2 {
	public static void main(String[] args) {
		Book[] books = new Book[2];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < books.length; i++) {
			System.out.print("제목 >> ");
			String title = sc.nextLine();
			System.out.print("저자 >> ");
			String author = sc.nextLine();
			books[i] = new Book(title, author);
			System.out.println("(" + books[i].title + "," + books[i].author + ")");
		}

//		System.out.print("제목 >> ");
//		title = sc.nextLine();
//		System.out.print("저자 >> ");
//		author = sc.nextLine();
//		books[1] = new Book(title, author); // 기본생성자가 없어서 빨간줄이 뜸. 매개변수 값을 넣어주면 해결 됨
//		// 기본생성자는 생략 가능하지만 매개변수 있는 생성자를 선언했을 땐 생략불가함
////		books[0].title = title;
////		books[0].author = author;
//
//		System.out.println("(" + books[1].title + "," + books[1].author + ")");
	}
}
