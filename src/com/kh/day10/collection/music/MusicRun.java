package com.kh.day10.collection.music;

import java.util.Scanner;

public class MusicRun {
	public static void main(String[] args) {
		MusicFunction mFunc = new MusicFunction();
		finish:
		while(true) {
			int value = mFunc.printMenu();
			switch (value) {
			case 1 : mFunc.titleAddLast(); break;
			case 2 : mFunc.titleAddfirst(); break;
			case 3 : mFunc.printTitleTotal(); break;
			case 4 : mFunc.searchTitle(); break;
			case 5 : mFunc.deleteTitle(); break;
			case 6 : mFunc.modifyTitle(); break;
			case 7 : mFunc.titleAsc(); break;
			case 8 : mFunc.titleDesc(); break;
			case 9 : mFunc.singerAsc(); break;
			case 10 : mFunc.singerDesc(); break;
			case 0 : System.out.println("종료되었습니다."); break finish;
			}
		}
	}
}
