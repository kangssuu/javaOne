package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_IndepClassListener extends JFrame{
	public Exam_IndepClassListener() {
		setTitle ("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); // ()안에 동작할 코드가 있는 클래스를 입력해 줘야함
		c.add(btn);
		
		
		setSize(350, 150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Exam_IndepClassListener();
	}
}

// 외부클래스
class MyActionListener implements ActionListener {  // implements : 추상 메소드 => 상속받은 애는 오버라이딩 해줘야 함 
	// 인터페이스는 상수나 추상메소드로 되어있음
	
	@Override
	public void actionPerformed(ActionEvent e) {  // 메소드임
		JButton btn = (JButton)e.getSource();
		if(btn.getText().equals("Action")) {
			btn.setText("액션");
		}
		else {
			btn.setText("Action");
		} 
	}
	
}

