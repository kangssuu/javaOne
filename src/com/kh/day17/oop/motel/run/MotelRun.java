package com.kh.day17.oop.motel.run;

import java.util.Scanner;

import com.kh.day17.oop.motel.controller.MotelController;
import com.kh.day17.oop.motel.view.MotelView;

public class MotelRun {

	public static void main(String[] args) {
		MotelView view = new MotelView();
		MotelController controller = new MotelController();
		Scanner sc = new Scanner(System.in);
		boolean[] rooms = new boolean[10];
		end :
			while(true) {
				int choice = view.printMenu();
				int chosenRoom = 0;
				switch(choice) {
				case 1 : 
					chosenRoom = view.inputRoomNumber("입실");
					controller.checkIn(chosenRoom);
//					Thread.sleep(500);
					break;
				case 2 : 
					chosenRoom = view.inputRoomNumber("퇴실");
					if (chosenRoom > 0 && chosenRoom <= 10) {
						if(rooms[chosenRoom - 1]) {
							rooms[chosenRoom - 1] = false;
							System.out.println(chosenRoom + "번 방에서 퇴실하셨습니다.");
						}
						else {
							System.out.println(chosenRoom + "번 방은 현재 빈 방입니다.");
						}
//						Thread.sleep(500);
					}
					else { 
						System.out.println("1번 방부터 10번 방까지 준비되어있습니다.");
					}
					break;
				case 3 : 
					controller.printAllRooms();
//					Thread.sleep(2000);
					break;
				case 4 : System.out.println("종료되었습니다.");
					break end;
				}
			}
	}

}
