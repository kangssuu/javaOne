package com.kh.day08.oop.homework.Q6;

public class Card {
	// Q6. 카드 회사에서 카드를 발급할 때마다 카드 고유 번호를 부여해 줍니다. 
	// 06-3의 <학번 생성하기> 예제를 참고하여 카드가 생성될 때마다 카드 번호가 
	// 자동으로 증가할 수 있도록 카드 클래스를 만들고 생성해보세요.
	
	
	// 소유자 이름
	// 카드번호
	int cardNumber;
	static int serialNum = 10000;  // static을 사용하면 메모리에 자동으로 고정? 선언 되기 때문에 값이 변하면 참조하고 있는 변수들의 값도 같이 바뀜
	// 유효기간
	// cvc
	// 비밀번호
	
	public Card() {
		cardNumber = serialNum;
		serialNum++;
	}
	
	public void printCardInfo() {
		System.out.println(this.cardNumber + "입니다.");
	}
}
