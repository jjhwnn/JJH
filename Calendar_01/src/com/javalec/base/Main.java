package com.javalec.base;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		
		// 현재 시간(연도, 달, 날짜)
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1; // 1월을 0월부터 해놓음,,
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		System.out.println(year + "." + month + "." + day);
		System.out.println(hour + ":" + minute + ":" + second);
	}

}
