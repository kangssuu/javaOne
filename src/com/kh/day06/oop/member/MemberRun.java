package com.kh.day06.oop.member;

import java.util.Scanner;

import com.kh.day06.oop.student.Student;

public class MemberRun {
	public static void main(String[] args) {
		Member[] memArrs = new Member[2];
		finish: 
			while (true) {
				int choice = printMenu();
				switch (choice) {
				case 1: 
					inputInfor(memArrs);
					break;
				case 2: 
					printInfor(memArrs);
					break;
				case 3: 
					System.out.println(" 프로그램이 종료되었습니다.");
					break finish;
				default:
					System.out.println("잘못입력하셨습니다. 메뉴를 선택해 주세요");
				}
			}
	}
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("회원 정보 확인 프로그램");
		System.out.println();
		System.out.println("1. 회원 정보 입력");
		System.out.println("2. 회원 정보 출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("선택  : ");
		int choice = sc.nextInt();
		return choice;
	}
	public static void inputInfor(Member[] memArrs) {
		for (int i = 0; i < memArrs.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("이름을 입력하세요 : ");
			String name = sc.next();
			System.out.println("아이디를 입력하세요 : ");
			String id = sc.next();
			System.out.println("전화번호를 입력하세요 : ");
			int phone = sc.nextInt();
			
			memArrs[i] = new Member();
			memArrs[i].setName(name);
			memArrs[i].setId(id);
			memArrs[i].setPhone(phone);
		}
	}
	public static void printInfor(Member[] memArrs) {
		for (int i = 0; i < memArrs.length; i++) {
			System.out.println("이름 : " + memArrs[i].getName());
			System.out.println("아이디 : " + memArrs[i].getId());
			System.out.println("전화번호 : " + memArrs[i].getPhone());
		}
	}
	public static void checkPass(Member[] memArrs ) {
		
	}
}

