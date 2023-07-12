package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_MouseListener extends JFrame {
	public Exam_MouseListener() {
		// TODO Auto-generated constructor stub
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel la = new JLabel("Hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.add(la);
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			// 마우스의 좌표 구해서 la.setLocation(x, y);에 대입
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		setSize(250, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exam_MouseListener();
	}
}
