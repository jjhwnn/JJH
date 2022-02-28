package com.javalec.base;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int intNum1 = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int intNum2 = scan.nextInt();
		
		int sum = intNum1 + intNum2;
		
		System.out.println("입력하신 " + intNum1 + "과 " + intNum2 + "의 합은 " + sum + "입니다.");
		
	}
	
}
