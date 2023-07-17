package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_MouseAdapter extends JFrame{
	public Exam_MouseAdapter() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel la = new JLabel("Hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.add(la);
		c.addMouseListener(new MouseAdapter() {
		}); 
			

	}
	
	public static void main(String[] args) {
		new Exam_MouseAdapter();
	}
}
