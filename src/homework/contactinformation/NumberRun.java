package homework.contactinformation;

public class NumberRun {
	public static void main(String[] args) {
		NumberFunction nFunc = new NumberFunction();
		finish :
			while(true) {
				int choice = nFunc.printMenu();  //printMenu가 int값을 반환하므로 choice에 반환 값 넣기
				switch (choice) {
				case 1 : nFunc.inputNumber(); break;
				case 2 : nFunc.modifyNumberInfor(); break;
				case 3 : nFunc.deleteNumber(); break;
				case 4 : nFunc.searchNumber(); break;
				case 5 : nFunc.totalNumberInfor(); break;
				case 0 : System.out.println("종료되었습니다."); break finish;
				default : System.out.println("메뉴에 있는 항목에서 선택해 주세요."); break;
				}
			}
	}
}
