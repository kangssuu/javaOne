package com.kh.day13.swing.student.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day13.swing.student.model.vo.Student;

// 입력받는 부분
public class StudentView {
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 성적관리 프로그램");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 출력");
		System.out.println("3. 학생 정보 이름 검색");
		System.out.println("4. 재평가 대상 여부 확인");
		System.out.println("5. 이름 오름차순 정렬");
		System.out.println("6. 프로그램 종료");
		System.out.println("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}

	public Student inputInfor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 입력");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("2차 점수 : ");
		int score2 = sc.nextInt();
		Student std = new Student(name, score1, score2);
		return std;
	}
	
	public void printInfor(List<Student> allList) {
		for (Student student : allList) {  //allList에 있는 값을 student에 넣어줌
			System.out.printf("이름 : %s, 1차 점수 : %d, 2차 점수 : %d", student.getName(), student.getScore1(), student.getScore2());
		}
	}
	
	public void searchInforByName(List<Student> searchList) {
		System.out.println("학생 정보 이름 검색");
		Scanner sc =new Scanner(System.in);
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		for (Student std : searchList) {
			if(std.getName().equals(searchName)) {
				System.out.printf("이름 : %s, 1차 점수 : %d, 2차 점수 : %d", std.getName(), std.getScore1(), std.getScore2());
				break;
			}
		}
	}
	
	public void checkPass(List<Student> checkList) {
		for (Student student : checkList) {
			System.out.println(student.getName() + "학생의 확인결과");
			if ((student.getScore1() + student.getScore2()) / 2  >= 60) {
				if (student.getScore1() >= 40 && student.getScore2() >= 40) {
					System.out.println("통과입니다.\n");
				} 
				else if (student.getScore1() < 40) {
					System.out.println("1차 시험 재평가 대상입니다.\n");
				} 
				else if (student.getScore2() < 40)
					System.out.println("2차 시험 재평가 대상입니다.\n");
			} 
			else if ((student.getScore1() + student.getScore2()) / 2 < 60) {
				if (student.getScore1() < 60) {
					if(student.getScore2() < 60) {
						System.out.println("1차 시험 재평가 대상입니다.");
						System.out.println("2차 시험 재평가 대상입니다.\n");
					}
					else {
						System.out.println("1차 시험 재평가 대상입니다.\n");
					}
				} 
				else if (student.getScore2() < 60) {
					System.out.println("2차 시험 재평가 대상입니다.\n");
				}
			}
		}
	}
	
}
