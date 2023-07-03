package com.kh.day06.oop.student;

import java.util.Scanner;

public class Student {
	String name; // 이름
	int score;  // 첫번째 성적
	int score2;  
	// 두번째 입력
	// 펑균 출력
	
	public Student() {}
	
	public Student(String name, int score, int score2) {
		this.name = name;
		this.score = score;
		this.score2 = score2;
	}
	
	public double getAvg() {  // 평균
		double avg = (double)(this.score + this.score2) / 2;
		return avg;
	}
	
	// getter 메소드
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	public int getScore2() {
		return this.score2;
	}
	
	// setter메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	public void setScore2(int score2) {
		this.score2 = score2;
	}
}

