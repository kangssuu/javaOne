package com.kh.day07.oop.member;

public class Member {  // 변수 및 메소드 생성
	// 입력받을거 3개 정도 만들고
	// 캡슐화의 원칙 적용해서 구성
	private String memberId;
	private String memberPw;
	private String memberEmail;
	private String memberAddress;
	
	public Member() {}  // 생성자 => 객체 초기화 하는 역할
	
	public Member(String memberId, String memberPw, String memberEmail, String memberAddress) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
	}  // 오버로딩 (생성자와 매개변수 개수, 타입이 하나라도 다르면 오버로딩이라 함)
	
	
	// getter 메소드
	public String getMemberId() {
		return this.memberId;
	}
	
	public String getMemberPw() {
		return this.memberPw;
	}
	
	public String getMemberEmail() {
		return this.memberEmail;
	}
	
	public String getMemberAddress() {
		return this.memberAddress;
	}
	
	
	// setter 메소드
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
}
