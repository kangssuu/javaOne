package com.kh.day13.swing.student.run;

import java.util.List;

import com.kh.day13.swing.student.controller.StudentController;
import com.kh.day13.swing.student.model.vo.Student;
import com.kh.day13.swing.student.view.StudentView;

public class Run {
	public static void main(String[] args) {
		StudentView view = new StudentView();
		StudentController sController = new StudentController();
		end:
		while(true) {
			Student std = null;
			List<Student> allList = null;
			int choice = 0;
			choice = view.printMenu();
			
			switch (choice) {
			case 1 : 
				std = view.inputInfor();
				sController.addStudent(std);
				break;
			case 2 : 
				allList = sController.printStudent();
				view.printInfor(allList);
				break;
			case 3 : 
				List<Student> searchList = sController.searchStudent();
				view.searchInforByName(searchList);
				break;
			case 4 : 
				List<Student> checkList = sController.checkStudent();
				view.checkPass(checkList);
				break;
			case 5 : 
				
				sController.bubbleNameAsc();
				allList = sController.printStudent();
				view.printInfor(allList);
				break;
			case 6 : 
				System.out.println("프로그램이 종료됩니다.");
				break end;
			default : 
				System.out.println("메뉴에서 선택해 주세요");
				break;
			}
		}
	}
}
