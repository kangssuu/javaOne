package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_InnerClassListener extends JFrame{
	
	public Exam_InnerClassListener() {
		setTitle ("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() {
			// ActionListener는 인터페이스로, 인터페이스는 new객체를 생성하지 못 하지만
			// 익명클래스를 이용해서 클래스를 따로 만들지 않고 오버라이딩으로 재정의
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				if(btn.getText().equals("Action")) {
					btn.setText("액션");
				}
				else {
					btn.setText("Action");
				}
			}
		});
		c.add(btn);
		
		
		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_InnerClassListener();
	}
}

