package com.kh.day18.member.run;

import com.kh.day18.member.controller.MemberController_prev;
import com.kh.day18.member.view.MemberView;

public class Run {	// 구조를 가지고, 실행하는 역할
	public static void main(String[] args) {
		MemberController_prev controller = new MemberController_prev();
		MemberView view = new MemberView();
		view.startMemberProgram();
	}
}
