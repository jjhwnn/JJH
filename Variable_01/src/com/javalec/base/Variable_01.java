package com.javalec.base;

public class Variable_01 {
	
	//Method
	public static void main(String[] args) {
		
		int intNum1 = 10; // 정수 테스트 
		char char01 = 'A'; // 문자 테스트 값
		
		System.out.println(intNum1); // 순서 : 해당 줄 코드를 수행 후 윗 줄 코드를 수행하는 게 기본 순
		System.out.println(char01);
		
		// intNum1 의 값을 100으로 변경하여 출력하기
		
		intNum1 = 100;
		
		System.out.println(intNum1);
		
		// 상수 변수 정의하기
		final int fixedNum = 100;
		System.out.println(fixedNum);
		
		// 실수 출력하기
		float fNum = 3.14f;
		double dNum1 = 3.14;
		final double pi =  3.14157;
		
		System.out.println(dNum1);
		System.out.println(pi);
		
		// 문자열 출력하기
		String str1 = "Good Morning!";
		System.out.println(str1);
		
		//Boolean 출력하기
		boolean bool1 = true;
		
		
		
		System.out.println(bool1);
		
	}
	
	
}










