package com.kh.day15.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class Exam_JTabbedPane extends JFrame{
	
	public Exam_JTabbedPane() {
		
		setTitle("탭팬 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JTabbedPane pane = createTabbedPane();
		c.add(pane, BorderLayout.CENTER);
		
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane();  // 한개 만들때
//		JTabbedPane pane;  // 여러개 만들거라 선언만.
		pane.addTab("super-man", new JLabel(new ImageIcon("images/img1.jpg")));
		pane.addTab("wonder-woman", new JLabel(new ImageIcon("images/img2.jpg")));
		pane.addTab("spider-man", new JLabel(new ImageIcon("images/img3.jpg")));
		return pane;
	}
	
	public static void main(String[] args) {
		new Exam_JTabbedPane();
	}
}
