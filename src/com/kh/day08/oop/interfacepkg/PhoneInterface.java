package com.kh.day08.oop.interfacepkg;

public interface PhoneInterface {
	// 1. Illegal modifier for the interface field PhoneInterface.name;
	// only public, static & final are permitted
	// The blank final field NAME may not have been initialized
	public String NAME = "";
	public static final int TIME_OUT = 10000;
	
	public abstract void receiveCall();
	void sendCall();
	abstract void printLogo();
	// 3. Abstract method do not specify a body
	public default void showLogo() {
		// 디폴트 메소드
		// 하위 호환성을 위해서 작성함.
		// 하위 호환성을 유지하고, 인터페이스의 보완을 위해 작성
		System.out.println("** LG **");
	}
}
