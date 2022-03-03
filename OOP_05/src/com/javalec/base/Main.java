package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.MultiCalc;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int choiceNumber;
		int firstNum, secondNum;
		
		System.out.println("1. 덧셈");
		System.out.println("2. 뺄셈");
		System.out.println("3. 곱셈");
		System.out.print("\n 번호를 선택 하세요 :");
		choiceNumber = scan.nextInt();
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		firstNum = scan.nextInt();
		System.out.print("첫번째 숫자를 입력하세요 : ");
		secondNum = scan.nextInt();
		
		MultiCalc multi = new MultiCalc();
		multi.calc(choiceNumber, firstNum, secondNum);
		
		
		
		// 메소드 4개로 짜기
		
	}

}
