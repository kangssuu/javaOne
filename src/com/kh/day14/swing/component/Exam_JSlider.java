package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JSlider;

public class Exam_JSlider extends JFrame {
	public Exam_JSlider() {
		setTitle("JSlider 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setPaintLabels(true);  // 밑에 숫자(게이지 숫자)
		slider.setPaintTicks(true);  //  눈금
		slider.setMajorTickSpacing(50); // 눈금 숫자 간격 몇으로 할건지
		slider.setMinorTickSpacing(10); // 눈금 최소값
		slider.setPaintTrack(true);  // track (??)
		c.add(slider);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JSlider();
	}
}
