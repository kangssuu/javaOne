package com.kh.day10.collection.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFunction {
//	Student[] students;
//	int index;
	List<Student> stdList;
	
	public StudentFunction() {
//		students = new Student[100];
//		index = 0;
		stdList = new ArrayList<Student>();
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 성적관리 프로그램");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 출력");
		System.out.println("3. 재평가 대상 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.println("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void inputInfor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 입력");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("2차 점수 : ");
		int score2 = sc.nextInt();
		Student std = new Student(name, score1, score2);
		stdList.add(std);
//		students[index] = std;
//		index++;
		
	}
	public void printInfor() {
		for (Student student : stdList) {  //stdList에 있는 값을 student에 넣어줌
			System.out.println(student.toString());
		}
//		for(int i = 0; i < stdList.size(); i++) {
//			System.out.println(student[i].getName() + "/");
//			System.out.println(stdList.get(i).getName() + "/");  // 내용 좀 꾸며서 출력할 때
//			System.out.println(stdList.get(i).toString());  // 단순출력(근데 출력용은 아니고 확인용임)
//		}
	}
	public void checkPass() {
		for (Student student : stdList) {
			int score1 = student.getScore1();
			int score2 = student.getScore2();
		}
	}
	public void searchInforByName() {
		System.out.println("학생 정보 이름 검색");
		Scanner sc =new Scanner(System.in);
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		for (Student std : stdList) {
			if(std.getName().equals(searchName)) {
				System.out.println(std.toString());
				break;
			}
		}
	}
	
}
