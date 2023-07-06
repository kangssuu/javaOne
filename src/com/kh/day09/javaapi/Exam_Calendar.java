package com.kh.day09.javaapi;

import java.time.DayOfWeek;
import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar openDate = Calendar.getInstance();
		Calendar closeDate = Calendar.getInstance();
		Exam_Calendar ex = new Exam_Calendar();
		// 개강일
		openDate.clear();
		openDate.set(2023, 4, 15, 9, 0);
		// 종강일
		closeDate.clear();
		closeDate.set(2023, 9, 26, 5, 50);
		closeDate.set(Calendar.HOUR_OF_DAY, 17);
		
		ex.printCalendar("현재", today);
		ex.printCalendar("개강일", openDate);
		ex.printCalendar("종강일", closeDate);
//		openDate.set(Calendar.HOUR_OF_DAY, 9);
//		openDate.set(Calendar.MINUTE, 0);
		// 현재 2022/12/7/수요일(11시) 오전 11시 42분 33초 234밀리초		
		
	}
	// 현재 2022/12/7/수요일(11시) 오전 11시 42분 33초 234밀리초
	public void printCalendar(String title, Calendar cal) {
		int year		= cal.get(Calendar.YEAR);
		int month		= cal.get(Calendar.MONTH)+1;
		int day			= cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek	= cal.get(Calendar.DAY_OF_WEEK); // 요일
		int hourOfDay	= cal.get(Calendar.HOUR_OF_DAY);
		int ampm		= cal.get(Calendar.AM_PM);
		int hour		= cal.get(Calendar.HOUR);
		int minute		= cal.get(Calendar.MINUTE);
		int second		= cal.get(Calendar.SECOND);
		int millisecond	= cal.get(Calendar.MILLISECOND);
		System.out.print(title + " ");
		System.out.print(year + "/" + month + "/" + day);
		
		System.out.print("/");
		switch(dayOfWeek) {
			case Calendar.SUNDAY	: System.out.print("일요일"); break;
			case Calendar.MONDAY	: System.out.print("월요일"); break;
			case Calendar.TUESDAY	: System.out.print("화요일"); break;
			case Calendar.WEDNESDAY	: System.out.print("수요일"); break;
			case Calendar.THURSDAY	: System.out.print("목요일"); break;
			case Calendar.FRIDAY	: System.out.print("금요일"); break;
			case Calendar.SATURDAY	: System.out.print("토요일"); break;
		}
		
		System.out.print("(" + hourOfDay + "시) "); //24시 표기인가
		
//		System.out.print(cal.get(Calendar.MONTH)+1);  // month는 0부터 시작해서 +1 해줘야 함 
//		System.out.print(cal.get(Calendar.DAY_OF_MONTH));  // 무슨요일인지 숫자로 표기? (일요일 : 0 ~)
		if (ampm == Calendar.AM) System.out.print("오전 ");
		else System.out.print("오후 ");
		System.out.print(hour + "시 " + minute + "분 " + second + "초" + millisecond + "밀리초"); 
		System.out.println();
	}
}
