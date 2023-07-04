package com.kh.day07.oop.polymorphism.instnceof;

public class Exam_InstanceOf {
//	static void print(Person person) {  // main에서 바로 쓰려면 static 사용하기
		// person = new Person();
		// person = new Student();
		// person = new Researcher();
		// person = new StudentWoker();
		// person = new Professor(); 로 초기화 하는 역할
	static void print(Person person) {
		if(person instanceof Student) {
			System.out.println("Student입니다!");
		}
		if (person instanceof StudentWorker){  
			System.out.println("StudentWorker입니다");
		}
		if (person instanceof Researcher){
			System.out.println("Researcher입니다!");
		}
		if (person instanceof Professor){  // 클래스명을 적어주면 그 클래스가 맞는 지 확인
			System.out.println("Professor입니다");
		}
	}
//		System.out.println("Student입니다!");
//	}
//	static void print(Researcher researcher) {
//		System.out.println("Researcher입니다!");		
//	}
//	static void print(StudentWorker studentWorker) {
//		System.out.println("StudentWorker입니다!");		
//	}
//	static void print(Professor professor) {
//		System.out.println("professor입니다!");		
//	}
	
	public static void main(String[] args) {
		print(new Student());
		print(new Researcher());
		print(new StudentWorker());
		print(new Professor());
	}
}
