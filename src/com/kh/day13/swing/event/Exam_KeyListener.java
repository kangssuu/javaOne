package com.kh.day13.swing.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Exam_KeyListener extends JFrame{
	public Exam_KeyListener() {
		setTitle("KeyLsitener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel[] laArrs = new JLabel[3];
		
		laArrs[0] = new JLabel("getKeyCode()");
		laArrs[1] = new JLabel("getKeyChar()");
		laArrs[2] = new JLabel("getKeyText()");  // 컴포넌트 라벨 초기값 설정
//		JLabel1 la1 = new JLabel("getKeyCode()");
//		JLabel1 la2 = new JLabel("getKeyChar()");
//		JLabel1 la3 = new JLabel("getKeyText()");
		Container c= getContentPane();
			
		c.setLayout(new FlowLayout());
		c.addKeyListener(new KeyAdapter() {  //adapter클래스 사용
		
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();  //유니코드 키 값
				int keyCode = e.getKeyCode();  // 가상 키 값
				laArrs[0].setText(Integer.toString(keyCode));
				laArrs[1].setText(Character.toString(keyChar));  //f5, f10등 매핑이 안되어있는건 안나옴
				laArrs[2].setText(e.getKeyText(keyCode));
				
			}
		});
		for(JLabel la : laArrs) {
			la.setOpaque(true);
			la.setBackground(Color.YELLOW);
			c.add(la);  // 컴포넌트에 콘테이너 추가
		}
//		la1.setOpaque(true);  // 바탕색 보이게 하기 위해서 컴포넌트를 블투명하게 함
//		la2.setOpaque(true);  // 바탕색 보이게 하기 위해서 컴포넌트를 블투명하게 함
//		la3.setOpaque(true);  // 바탕색 보이게 하기 위해서 컴포넌트를 블투명하게 함
//		la1.setBackground(Color.yellow);
//		la2.setBackground(Color.orange);
//		la3.setBackground(Color.pink);
		 
		setSize(300, 150);
		setVisible(true);
		
		// 스윙 프레임이 ㅁ만들어질 포커스,를 주고자하는 경우 setVisible이후에 포커스를 주어야함
		// 입력받을 수 있도록 포커스를 주는 것임
		c.setFocusable(true);  // component가 포커스를 받을 수 있도록 설정
		c.requestFocus();   // component에 포커스 강제 지정
		
		laArrs[0].setSize(50,20);
		c.add(laArrs[0]);
		laArrs[1].setSize(50,20);
		c.add(laArrs[1]);
		laArrs[2].setSize(50,20);
		c.add(laArrs[2]);
		
	}
	
	public static void main(String[] args) {
		new Exam_KeyListener();
	}
}
