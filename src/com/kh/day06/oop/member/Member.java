package com.kh.day06.oop.member;

public class Member {
	// 입력받을거 3개 정도 만들고
	// 캡슐화의 원칙 적용해서 구성
	String name;
	String id;
	int phone;
	
	public Member() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
}
