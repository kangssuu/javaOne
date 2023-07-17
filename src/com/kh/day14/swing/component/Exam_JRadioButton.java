package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Exam_JRadioButton extends JFrame {
	
	public Exam_JRadioButton() {
		
		setTitle("JRadioButton 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherry = new ImageIcon("images/selectedCherry.jpg");
		
		JRadioButton apple = new JRadioButton("사과", true);  // true 적어주면 실행할 때 기본값으로 체크 되어있음
		JRadioButton pear = new JRadioButton("배");
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);  // 이미지 객체 적어주면 사진 나옴
		cherry.setBorderPainted(true);  // 클릭 버튼처럼 만들어줌
		cherry.setSelectedIcon(selectedCherry);  // 선택 될 때 사진 정해 줄 수 있음
		
		// 라디오 버튼은 1가지만 선택되도록 해주는 버튼 그룹
		// input[type = radio] 태그의 name을 맞춰주는 것과 같음
		ButtonGroup g = new ButtonGroup();
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Exam_JRadioButton();
	}

}
