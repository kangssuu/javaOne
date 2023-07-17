package com.kh.day14.swing.component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_JComponent extends JFrame{
	
	public Exam_JComponent() {
		
//		setTitle("JComponent의 공통 메소드 예제");
		super("JComponent의 공통 메소드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("Magenta/Yellow Button");
		JButton btn2 = new JButton("Disabled Button");
		JButton btn3 = new JButton("getX(), getY()");
		
		btn1.setBackground(Color.yellow);  // 배경 색 설정
		btn1.setForeground(Color.magenta);  // 글씨 색 설정
		btn1.setFont(new Font("Arial", Font.ITALIC, 20));  // 폰트 종류, 폰트 두께 또는 기울기 등, 폰트 크기
		btn2.setEnabled(false);  // 버튼 안눌리게
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton jb = (JButton)e.getSource();  // e.getSource(); => 이벤트가 발생한 요소를 나타냄
				Exam_JComponent frame = (Exam_JComponent)jb.getTopLevelAncestor();
				frame.setTitle(jb.getX() + ", " + jb.getY());
			}
		});
		
		c.add(btn1);  // 컨텐트 팬에 btn1 붙히기
		c.add(btn2);
		c.add(btn3);
		setSize(300, 200);
		setVisible(true);	
	}
	
	
	public static void main(String[] args) {
		new Exam_JComponent();
	}
}
