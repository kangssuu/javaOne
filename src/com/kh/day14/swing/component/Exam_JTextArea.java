package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exam_JTextArea extends JFrame{
	private JLabel textLabel;
	private JTextField fieldLabel;
	private JTextArea areaLabel;
	private JScrollPane scrollPane;
	
	public Exam_JTextArea() {
		setTitle("텍스트 영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		textLabel = new JLabel("입력 후 <enter>키를 입력하세ㅐ요");
		fieldLabel = new JTextField(20);
		areaLabel = new JTextArea(7, 20);  // 7줄 20문자
		scrollPane = new JScrollPane(areaLabel);  // 텍스트 영역객체 전달하면서
												// 스크롤 팬 객체 생성
		
		c.add(textLabel);
		c.add(fieldLabel);
		c.add(scrollPane);  // 콘텐츠 팬에 스크롤 팬 추가`	
		fieldLabel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JTextField jt = (JTextField)e.getSource();
				areaLabel.append(jt.getText() + "\n");
				jt.setText("");
				
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JTextArea();
	}
}
