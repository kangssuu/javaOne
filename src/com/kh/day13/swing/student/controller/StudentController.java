package com.kh.day13.swing.student.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day12.music.model.vo.Music;
import com.kh.day13.swing.student.model.vo.Student;
// 저장하는 부분
public class StudentController {
	List<Student> stdList;
	
	public StudentController() {
		stdList = new ArrayList<Student>();
	}
	
	public void addStudent(Student stdOne) {
		stdList.add(stdOne);  // 배열에 추가
	}
	
	public List<Student> printStudent() {
		return stdList;  // 리스트 값 전달
	}

	public List<Student> searchStudent() {
		return stdList;
	}

	public List<Student> checkStudent() {
		return stdList;
	}

	public void bubbleNameAsc() {
		for(int i= 0; i < stdList.size()-1; i++) {
			for(int j = 0; j < (stdList.size() - 1) - i; j++) {
				Student sOne = stdList.get(j);  // 배열 왼쪽자리 중 하나
				Student sTwo = stdList.get(j + 1);  // sOne 오른쪽 옆자리
				
				// 결과값이
				// 0이면 동일함
				// 양수값이면 왼쪽이 순서가 더 큼
				// 음수 값이면 왼쪽이 순서가 작음
				if(sOne.getName().compareTo(sTwo.getName()) > 0) {
					Student temp = sOne;
					stdList.set(j, sTwo);
					stdList.set(j+1, temp);
				}
			}
		}
		
	}
	
}
