package homework.contactinformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberFunction {
	List<NumberInfor> nList;  // 객체 저장 공간
	public NumberFunction() {
		nList = new ArrayList<NumberInfor>();  // Number에 대한 리스트?
	}
	
	// 메뉴 출력
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("📞 연락처 프로그램 📞\n");
		System.out.println("1. 연락처 추가");
		System.out.println("2. 연락처 수정");
		System.out.println("3. 연락처 삭제");
		System.out.println("4. 연락처 검색");
		System.out.println("5. 전체 연락처 보기");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 👉 ");
		int choice = sc.nextInt();
		return choice;
	}
	
	// 입력
	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n✿✿✿ 📞 연락처 추가 ✿✿✿\n");
		System.out.print("이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = sc.nextLine();
		NumberInfor number = new NumberInfor(name, phoneNumber);
		nList.add(number); // 번호저장
		System.out.println("\n⋰˚☆ 연락처에 저장되었습니다. ⋰˚☆");
		System.out.println("\n✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°\n");
	}
	
	// 수정
	public void modifyNumberInfor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n✿✿✿ 📞 연락처 수정 ✿✿✿\n");
		System.out.print("수정할 연락처 이름 : ");
		String name = sc.next();
		System.out.print("수정할 정보 입력(이름) : \n");
		String modName = sc.next();
		sc.nextLine();
		System.out.print("수정할 정보 입력(번호) : ");
		String modPhoneNumber = sc.nextLine();
		NumberInfor modNumberInfor = new NumberInfor(modName, modPhoneNumber);
		for(int i = 0; i < nList.size(); i++ ) {
			NumberInfor number = nList.get(i);
			if(number.getName().equals(name)) {
				nList.set(i, modNumberInfor);  //set(i => 리스트 자리, modNumberInfor => 넣을 값. modNumberInfor이므로 modName과 modPhoneNumber의 값을 넣는다. )
				System.out.println("\n⋰˚☆ 연락처가 수정되었습니다. ⋰˚☆");
			}
		}
		System.out.println("\n✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°\n");
	}
	
	// 삭제
	public void deleteNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n✿✿✿ 📞 연락처 삭제 ✿✿✿\n");
		System.out.print("삭제할 연락처 이름 : ");
		String name = sc.next();
		for (int i = 0; i < nList.size(); i++) {
			NumberInfor number = nList.get(i);  // number에 nList의 값 하나씩 가져와서 넣기
			if(number.getName().equals(name)) {  //nList에서 get으로 가져온 number에 있는 이름과 삭제할 이름이랑 같으면
				nList.remove(i); // 리스트에서 삭제
				System.out.println("\n⋰˚☆ 연락처가 삭제되었습니다. ⋰˚☆\n");
				break; // 반복문이므로 삭제했으면 나오기
			}
		}
		System.out.println("✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°\n");
	}
	
	// 검색
	public void searchNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n✿✿✿ 📞 연락처 검색 ✿✿✿\n");
		System.out.print("검색할 연락처 이름 : ");
		String name = sc.next();
		for (NumberInfor number : nList){  // nList의 값을 number에 대입하는 것을 반복. nList에는 name과 phoneNumber의 값이 들어있어 get으로 가져올 수 있음
			if(number.getName().equals(name)) {
				System.out.println("\n⋰˚☆ 검색 결과 ⋰˚☆\n");
				System.out.printf("👉 이름 : %s, 전화번호 : %s\n", number.getName(), number.getPhoneNumber());
			}
		}
		System.out.println("\n✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°\n");
	}
	
	// 전체 연락처 보기
	public void totalNumberInfor() {
		System.out.println("\n✿✿✿ 📞 전체 연락처 보기 ✿✿✿\n");
		for(int i = 0; i < nList.size(); i++) {
			NumberInfor number = nList.get(i);
			System.out.printf("%d. 이름 : %s, 전화번호 : %s\n",(i + 1), number.getName(),number.getPhoneNumber());
		}
		System.out.println("\n✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°✿∘˚˳°∘°\n");
	}
}
