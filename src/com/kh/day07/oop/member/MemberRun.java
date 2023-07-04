package com.kh.day07.oop.member;

public class MemberRun {  // 실행파트
	public static void main(String[] args) {
		MemberFunction mFunc = new MemberFunction();
		finish: 
			while (true) {
				int choice = mFunc.printMenu();
				switch (choice) {
				case 1: 
					 mFunc.inputInfor();
					break;
				case 2: 
					 mFunc.printInfor();
					break;
				case 3: 
					System.out.println("\n프로그램이 종료되었습니다.");
					break finish;
				default:
					System.out.println("\n해당 메뉴는 존재하지 않습니다.");
					break;
				}
			}
	}
}

