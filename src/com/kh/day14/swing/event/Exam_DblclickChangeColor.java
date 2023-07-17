package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Exam_DblclickChangeColor extends JFrame {
	
	public Exam_DblclickChangeColor() {
		
		setTitle("Click and Dbl Click Change BackgroundColor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
//		c.addMouseListener(new MouseListener() {
//			
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mousePressed(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseExited(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				// TODO Auto-generated method stub
//				// 더블클릭 구현. 클릭 카운트 수가 2면 더블클릭이라고
//				if(e.getClickCount() == 2) {
//					c.setBackground(Color.black);
//				}
//			}
//		});
		c.addMouseListener(new MyMouseListener());
		
		
		setSize(300, 200);
		setVisible(true);
	}
	
	private class MyMouseListener extends MouseAdapter{
		// MouseAdapter 상속 받아서 쓰는 이유? ↓
		/*
		 * (MouseListener, MouseMotionListener 인터페이스를 구현했다면 
		 * 그 안에 있는 모든 메서드를 정의해야 합니다. 
		 * 이 추상 클래스는 모든 것에 대해 null 메서드를 정의하므로 
		 * 관심 있는 이벤트에 대한 메서드만 정의하면 됩니다.)
		 * => MouseAdapter 추상 클래스를 사용하면 사용할 이벤트만 오버라이딩 할 수 있음
		 */
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// 더블클릭 구현, 클릭 카운트 수가 2면 더블클릭함
			if(e.getClickCount() == 2) {
				// (int) Math.random() * (최댓값 - 최솟값 + 1) + 최소값
				// 0 ~ 255 범위의 랜덤한 수를 출력하는 방법
				// rgb의 범위가 0 ~ 255임.
				// rgb의 숫자를 랜덤하게 받아서 다양한 색상을 출력하는 방법
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				Component c = (Component)e.getSource();
				c.setBackground(new Color(red,green,blue));
			}
		}
	}
	public static void main(String[] args) {
		new Exam_DblclickChangeColor();
	}
	
}
