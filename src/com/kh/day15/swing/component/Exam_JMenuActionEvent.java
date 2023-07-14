package com.kh.day15.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam_JMenuActionEvent extends JFrame {
	private JLabel imgLabel;
	public Exam_JMenuActionEvent() {
		setTitle("메뉴 리스너 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu(); 
		Container c = getContentPane();  //컨텐트 팬
		imgLabel = new JLabel();  // 이미지 들어갈 라벨
		c.setLayout(new BorderLayout());  // borderLayout사용, (Top, Bottom, Left, Right, Center)
		c.add(imgLabel, BorderLayout.CENTER);
		
		setSize(250, 200);
		setVisible(true);
		
	}
	
	private void createMenu() {
		JMenuBar bar = new JMenuBar();  // 메뉴바 (최상위)
		JMenu screenMenu = new JMenu("screen");  //메뉴(screen)
		String[] itemTitle = {"Load","Hide","ReShow","Exit"};
		for (int i = 0; i < 4; i++) {
			JMenuItem menuItem = new JMenuItem(itemTitle[i]);  // 아이템(메뉴 밑에 들어감)
			menuItem.addActionListener(new ActionListener() {  // 아이템이 선택되었을 때
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();
					switch (cmd) {  // else if 보다 빠른 Switch case
					case "Load" :
						if(imgLabel.getIcon() != null) return;  // 이미 로딩시 리턴
						imgLabel.setIcon(new ImageIcon("images/img.jpg"));
						break;
					case "Hide" :
//						if(imgLabel.getIcon() != null);
						imgLabel.setVisible(false);
						break;
					case "ReShow" :
						imgLabel.setVisible(false);
						break;
					case "Exit" :
						System.exit(0);
						break;

					default:
						break;
					}
					
				}
			});
		}
		bar.add(screenMenu);
		screenMenu.add(new JMenuItem("Load"));  // 메뉴 아이템
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.add(new JMenuItem("Exit"));
		
		bar.add(new JMenu("Edit"));
		bar.add(new JMenu("Source"));
		bar.add(new JMenu("Project"));
		bar.add(new JMenu("Run"));
		
		setJMenuBar(bar);  // 프레임에 추가
	}
	
	public static void main(String[] args) {
		new Exam_JMenuActionEvent();
	}
}
