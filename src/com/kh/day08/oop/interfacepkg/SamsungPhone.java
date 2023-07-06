package com.kh.day08.oop.interfacepkg;

// 1. The type PhoneInterface cannot be the superclass of SamsungPhone; a superclass must be a class
// => entends 안됨.
public class SamsungPhone implements PhoneInterface {
	// The type SamsungPhone must implement the inherited abstract method PhoneInterface.receiveCall()
	// => 오버라이딩 해야돼

	@Override
	public void receiveCall() {
		System.out.println("여보세요 나야");
		
	}

	@Override
	public void sendCall() {
		System.out.println("거기 잘 지내니");
		
	}

	@Override
	public void printLogo() {
		System.out.println("여보세요 왜 말 안하니?!?!?!?");
		
	}
}
