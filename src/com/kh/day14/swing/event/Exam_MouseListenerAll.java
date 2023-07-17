package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_MouseListenerAll extends JFrame {
	private JLabel la;
	public Exam_MouseListenerAll() {
		
		
		setTitle("MouseListener와 MouseMotionListener 예제"); // 프레임 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 종료시 완전 종료
		
		la = new JLabel("No Mouse Event");  // 화면에 띄울 문장
		Container c = getContentPane();  // 프레임에 붙일 컨텐트 팬 (여기에 각종 컴포넌트를 붙힘)
		c.setLayout(new FlowLayout());  // 컨턴트 팬 레이아웃 종류 중 하나. 왼쪽부터 오른쪽으로 붙힘
		c.add(la);  // 컨턴트 팬에 라벨 la("No Mouse Event")를 붙힘
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);  // 마우스 움직일 때 이벤트 처리
		c.addMouseMotionListener(listener);  // 마우스 동작할 때 이벤트 처리 
		
		setSize(300, 200);  // 크기 300, 200픽셀
		setVisible(true);  // 보여주기
	}
	
	private class MyMouseListener implements MouseListener, MouseMotionListener{
		// 내부 클래스로 들어왔기 때문에 외부에서 사용하지 못 하게 private 설정
		
		@Override
		public void mouseDragged(MouseEvent e) {  // MouseMotionListener
			// TODO Auto-generated method stub
			la.setText("MouseDragged(" + e.getX() + ", " + e.getY() + ")");  // 라벨 객체 la에 마우스 드래그 포인트 좌표 출력
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {  // MouseMotionListener
			// TODO Auto-generated method stub
			la.setText("MouseMoved(" + e.getX() + ", " + e.getY() + ")");  // 라벨 객체 la에 마우스 포인트 위치 좌표 출력
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {  // MouseListener
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {  // MouseListener
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {  // MouseListener
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {  // MouseListener
			// TODO Auto-generated method stub
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);  // 마우스가 들어오면 바탕이 초록색으로 변함
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {  // MouseListener
			// TODO Auto-generated method stub
			Component c = (Component)e.getSource();
			c.setBackground(Color.red);  // 마우스가 나가면 바탕이 빨간색으로 변함
		}
		
	}
	public static void main(String[] args) {
		new Exam_MouseListenerAll();  // 컬렉션 실행
	}
}

