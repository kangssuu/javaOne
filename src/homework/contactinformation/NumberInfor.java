package homework.contactinformation;

public class NumberInfor {
//	<연락처 프로그램>
//
//	연락처 입력 (중복x)
//	이름입력
//	번호입력
//	연락처 검색 (이름으로 검색)
//	연락처 수정
//	연락처 삭제
//	연락처 보기 (전체 연락처 출력)
//	종료
//	메뉴선택 : 

	private String name;
	private String phoneNumber;
	
	public NumberInfor() {
		name = " ";
		phoneNumber = " ";
	}
	
	public NumberInfor(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Number [name = " + name + ",phoneNumber = " + phoneNumber;
	}
	
}
