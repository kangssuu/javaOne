package com.kh.day13.swing.basic;

import javax.swing.JFrame;

public class Exam_MyFrame extends JFrame{
	
	public Exam_MyFrame() {
		// Frame 제목
		setTitle("300x300 스윙 프레임 만들기");
		
		// Frame창 사이즈 조절
		setSize(300, 300);
		
		// Frame창 띄워주는 메소드
		setVisible(true);
	}
	
	// main을 Frame클래스 안에서 사용하는 것을 권장함
	public static void main(String[] args) {
//		Exam_MyFrame exFrame = new Exam_MyFrame();  
		new Exam_MyFrame();  // 이 명령어로 객체가 실행 됨
	}
}
