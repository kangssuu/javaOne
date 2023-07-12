package com.kh.day13.swing.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_ContentPane extends JFrame{
	
	public Exam_ContentPane() {  // JFrame을 상속 받음, JFrame은 Container를 상속 받음
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 실제 종료하도록 함. 그전엔 그냥 안보이게만 했임
		
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.PINK);  // 프레임에 배경색 넣기
		contentPane.setLayout(new FlowLayout());  // 버튼을 순차적으로 만들어주는 레이아웃
		
		// 버튼 만들기
		contentPane.add(new JButton("OK")); 
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_ContentPane();  // 해당 클래스를 객체로 만들면 실행 됨
	}
}
