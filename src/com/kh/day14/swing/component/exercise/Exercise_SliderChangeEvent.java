package com.kh.day14.swing.component.exercise;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Exercise_SliderChangeEvent extends JFrame{
	private JLabel colorLabel;
	private JSlider[] sliders;
	
	public Exercise_SliderChangeEvent() {
		setTitle("슬라이더와 ChangeEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		
		colorLabel = new JLabel("SLIDER EXAMPLE");  // 슬라이더 변화시켜 바뀐 색상을 나타냄
		sliders = new JSlider[3];					// 슬라이더는 3개니까 객체 배열로 받음
		
		for (int i = 0; i < sliders.length; i++) {
			// 수평모양으로 최소0, 최대 255, 시작값은 128 슬라이더를 만듦
			sliders[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sliders[i].setPaintLabels(true);			// 숫자
			sliders[i].setPaintTicks(true);				// 눈금
			sliders[i].setMajorTickSpacing(50);			// 중간 눈금
			sliders[i].setMinorTickSpacing(10);			// 최소 눈금
			sliders[i].addChangeListener(new ChangeListener() {
				// 슬라이더가 change할 때 발생하는 이벤트 감지
				@Override
				public void stateChanged(ChangeEvent e) {
					int r = sliders[0].getValue();	// 슬라이더의 해당 값(숫자)
					int g = sliders[1].getValue();
					int b = sliders[2].getValue();
					
					colorLabel.setOpaque(true);	// 불투명도 설정
					// 라벨의 배경색을 RGB값으로 바꿔서 컬러픽커처럼 보이게 함.
					colorLabel.setBackground(new Color(r, g, b));
				}
			});
			c.add(sliders[i]);
		}
		
		// 슬라이더 글씨 색 바꾸기
		sliders[0].setForeground(Color.red);  // 글씨 색 설정
		sliders[1].setForeground(Color.green);
		sliders[2].setForeground(Color.blue);
		c.add(colorLabel);
		
		setSize(300, 230);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Exercise_SliderChangeEvent();

	}

}
