package com.kh.day18.member.model.dao;

import java.util.List;

import com.kh.day18.member.model.vo.Member;

public class MemberDAO {
	
	private List<Member> mList;
	
	/**
	 * 이름으로 인덱스 찾기
	 * @param name String 으로 입력 받은 값
	 * @return int값 없으면 -1
	 */
	public int findIndexByName(String name) {
		for (int i = 0; i < mList.size(); i++) {
			if (mList.get(i).getMemberName().equals(name)) {  // mList.get(i) -> 하나의 객체 .getMemberName() -> 에서 이름을 가져옴
				return i;
			}
		}
		return -1;
	}

	/** 
	 * 이름으로 회원정보 찾기
	 * 
	 * @param name String 으로 입력 받은 값
	 * @return 
	 */
	public Member findOneByName(String name) {
		for (int i = 0; i < mList.size(); i++) {
			if (mList.get(i).getMemberName().equals(name)) {
				return mList.get(i);
			}
		}
		return null;		
	}

	/**
	 * 회원 전체 정보 조회
	 * @return
	 */
	public List<Member> allMembermList() {
		return mList;
	}

	/**
	 * 회원 정보 등록
	 * @param member
	 */
	public void addMember(Member member) {
		mList.add(member);
	}

	/**
	 * 회원 정보 수정
	 * @param index 이름으로 찾은 index값
	 * @param mOne 수정된 정보(데이터)
	 */
	public void modifyMember(int index, Member mOne) {
		mList.set(index, mOne); 
	}

	/**
	 * 회원 정보 삭제
	 * @param index
	 */
	public void subMember(int index) {
		mList.remove(index);
	}
}
