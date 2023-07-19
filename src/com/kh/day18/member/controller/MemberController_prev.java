package com.kh.day18.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day18.member.model.dao.MemberDAO;
import com.kh.day18.member.model.vo.Member;

public class MemberController_prev {
//	private List<Member> mList;
	private MemberDAO memberDao = new MemberDAO();

	public MemberController_prev() {
//		private MemberView view = new MemberView(); 
//		mList = new ArrayList<Member>();
		memberDao = new MemberDAO();
	}

	
	/**
	 * 이름으로 인덱스 찾기
	 * @param name String 으로 입력 받은 값
	 * @return int값 없으면 -1
	 */
	public int findIndexByName(String name) {
		int index  = memberDao.findIndexByName(name);
		return index;
	}

	/** 
	 * 이름으로 회원정보 찾기
	 * 
	 * @param name String 으로 입력 받은 값
	 * @return 
	 */
	public Member findOneByName(String name) {
		return memberDao.findOneByName(name);		
	}

	/**
	 * 회원 전체 정보 조회
	 * @return
	 */
	public List<Member> allMembermList() {
		return memberDao.allMembermList();
	}

	/**
	 * 회원 정보 등록
	 * @param member
	 */
	public void addMember(Member member) {
		memberDao.addMember(member);
	}

	/**
	 * 회원 정보 수정
	 * @param index 이름으로 찾은 index값
	 * @param mOne 수정된 정보(데이터)
	 */
	public void modifyMember(int index, Member mOne) {
		memberDao.modifyMember(index, mOne); 
	}

	/**
	 * 회원 정보 삭제
	 * @param index
	 */
	public void subMember(int index) {
		memberDao.subMember(index);
	}
}
