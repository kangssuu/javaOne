package com.kh.day07.oop.member;

import java.util.Scanner;

public class MemberFunction {  // 메소드 정의
	private Member[] memArrs;
	private int index;
	
	public MemberFunction() {
		memArrs = new Member[3];
		index = 0;
	}
	
	public int printMenu() {
		// 회원관리 프로그램
		// 1. 회원정보입력
		// 2. 회원정보출력
		// 3. 프로그램 종료
		// 메뉴 입력 : 
		Scanner sc = new Scanner(System.in);
		System.out.println("\n회원 관리 프로그램");
		System.out.println("1. 회원 정보 입력");
		System.out.println("2. 회원 정보 출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴 입력  : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void inputInfor() {
//		for (int i = 0; i < memArrs.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n😝😝😝😝😝😝 회원 정보 입력 😝😝😝😝😝😝");
			System.out.print("아이디 : ");
			String memberId = sc.next();
			System.out.print("비밀번호 : ");
			String memberPw = sc.next();
			System.out.print("이메일 : ");
			String email = sc.next();
			System.out.print("주소 : ");
			sc.nextLine(); // 주소를 받기위해 개행 제거 (이메일 입력부분에서 친 엔터를 얘가 받는 듯)
			String address = sc.nextLine();  // 공백도 입력 받음 (enter도 공백으로 받음)
			
//			memArrs[i] = new Member();
//			memArrs[i].setMemberId(memberId);
//			memArrs[i].setMemberPw(memberPw);
//			memArrs[i].setMemberEmail(email);
//			memArrs[i].setMemberAddress(address);
			memArrs[index] = new Member(memberId, memberPw, email, address);
			index++;
//		}
	}
	
	public void printInfor() {
		System.out.println("\n♬ ⋒( ˙◡˙)⋑ ♫ ⋐( • ω • )⋑ ♫ ⋐( ˊᵕˋ )⋒ 회원 정보 출력 ♬ ⋒( ˙◡˙)⋑ ♫ ⋐( • ω • )⋑ ♫ ⋐( ˊᵕˋ )⋒");
		for (int i = 0; i < index; i++) {
			System.out.printf("%s님의 비밀번호는 %s이고, 이메일은 %s이며, 주소는 %s입니다.\n"
					, memArrs[i].getMemberId()
					, memArrs[i].getMemberPw()
					, memArrs[i].getMemberEmail()
					, memArrs[i].getMemberAddress());
		}
	}
}
