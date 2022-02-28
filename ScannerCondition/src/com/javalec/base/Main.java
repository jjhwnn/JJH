package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner를 이용한 입력 받기
		
		Scanner scanner = new Scanner(System.in);
		
		//Consol에서 Data 가져오기 
//		System.out.print("숫자를 입력하세요! : ");
//		int intNum1 = scanner.nextInt();
//		System.out.println("입력한 숫자는 " + intNum1 + "입니다.");
	
		// 입력하신 숫자는 짝수 입니다 or 홀수 입니다.
		
		System.out.print("숫자 입력: ");
		int intNum2 = scanner.nextInt();
		
		if(intNum2 % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}else {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
		
		System.out.println(intNum2 % 2 == 0 ? "짝수" : "홀수");
		
		// ------------------------------
		
	}

}
