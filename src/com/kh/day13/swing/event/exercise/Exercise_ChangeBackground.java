package com.kh.day13.swing.event.exercise;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_ChangeBackground extends JFrame{
	// <f1>키를 입력받으면 컨탠트 팬의 배경을 초록으로
	// % 키를 입력 받으면 노란색으로 변경
	// title : Key Code 예제, F1키 : 초록색, %키 : 노란색
	// size : 300, 150
	// 눌린키 출력하기는 JLabel을 이용해서 컨텐트팬에 출력하기
	// F1키가 입력되었습니다, 5키가 입력되었습니다.
	public Exercise_ChangeBackground() {
		setTitle("Key Code 예제, F1키 : 초록색, %키 : 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();  // div같은 애
		JLabel la = new JLabel();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				la.setText(e.getKeyText(e.getKeyCode())+ "키가 입력되었음.");
				char keyChar = e.getKeyChar();
				int keyCode = e.getKeyCode();
				if(keyChar == '%') {
					c.setBackground(Color.green);
				}
				else if (keyCode == KeyEvent.VK_F1) {
					c.setBackground(Color.yellow);
				}
				else {
					c.setBackground(Color.LIGHT_GRAY);
				}
			}
		});
		la.setSize(200, 20);
		la.setLocation(0, 50);
		c.add(la);
		
		setSize(300, 150);
		setVisible(true); // 보이게 하기
		
		// 키 입력받기 위해 포커스 줌
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		new Exercise_ChangeBackground();
	}
}
