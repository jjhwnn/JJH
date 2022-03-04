package com.javalec.base;

public class RomanToInt_02 {
	// 로마숫자를 입력시 10진 형태의 정수로 출력하기
	//('I', 'V', 'X', 'L', 'C', 'D', 'M').
	// 1, 5, 10, 50, 100, 500, 1000
	
	// 입력받을 String 변수 선언
	public static void main(String[] args) {
		
		String s = "MDC";
		s.length();
		
		int romaNum = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			switch(s.charAt(i)) {
			
			
			case 'M':
				romaNum += 1000;
				break;
			case 'D':
				romaNum += 500;
				break;
			case 'C':
				romaNum += 100;
				break;
			case 'L':
				romaNum += 50;
				break;
			case 'X':
				romaNum += 10;
				break;
			case 'V':
				romaNum += 5;
				break;
			case 'I':
				romaNum += 1;
				break;
			
			}
			
		}
		System.out.println(romaNum);
		
	}
	
}
