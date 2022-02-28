package com.javalec.base;

public class Calc {

	public static void main(String[] args) {
		// 변수를 이용한 사칙연산
		
		int intNum1 = 100;
		int intNum2 = 200; 
		
		intNum1 = 10;
		intNum2 = 20;
		// --> Data
		// Heap 영역에 변수명이 들어가고, data영역에 10이라는 값을 저장한다.
		
		// 덧셈
		System.out.println(intNum1 + intNum2);
		// 뺄셈
		System.out.println(intNum2 - intNum1);
		// 곱셈
		System.out.println(intNum2 * intNum1);
		// 나눗셈
		System.out.println(intNum2 / intNum1);
		// --> Logic

		// 문자와 계산값 출력하기
		System.out.println("덧셈 : " + (intNum1 + intNum2));
		
		System.out.println("덧셈 : " + intNum1 + " + " + intNum2 + " = " + (intNum1 + intNum2));
		System.out.println("뺄셈 : " + intNum2 + " - " + intNum1 + " = " + (intNum2 - intNum1));
		System.out.println("곱셈 : " + intNum1 + " x " + intNum2 + " = " + (intNum1 * intNum2));
		System.out.println("나눗셈 : " + intNum2 + " / " + intNum1 + " = " + (intNum2 / intNum1));
		
	}

}
