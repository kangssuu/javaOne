package com.kh.day06.oop.member;

public class MemberRun {
	public static void main(String[] args) {
		Member[] memArrs
		finish: 
			while (true) {
				int choice = printMenu();
				switch (choice) {
				case 1: // 학생성적입력
					inputScore(std);
					break;
				case 2: // 학생성적 출력
					printScore(std);
					break;
				case 3: // 재평가여부
					checkPass(std);
					break;
				case 4:
					System.out.println(" 프로그램이 종료되었습니다.");
					break finish;
				default:
					System.out.println("잘못입력하셨습니다. 메뉴를 선택해 주세요");
				}
			}
	}
	private int printMenu() {
		// TODO Auto-generated method stub
		return 0;
	}
}

