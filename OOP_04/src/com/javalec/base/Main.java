package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Addition;

public class Main {

	public static void main(String[] args) {
		// 두개의 정수를 입력 받아 덧셈 기능 구현하기
		
		Scanner scan = new Scanner(System.in);
		int num1 = 0;	// 첫번째 수
		int num2 = 0;	// 두번째 수
	
		// 두 개의 수를 입력 받기
		System.out.print("첫번째 수를 입력하세요 :");
		num1 = scan.nextInt();
		
		System.out.print("두번째 수를 입력하세요 :");
		num2 = scan.nextInt();
		
		// 덧셈 기능 구현하기
		// Case 1: Field를 이용하여 계산하기
		Addition addition = new Addition(num1, num2);
		
		addition.addAction();
		
		
	}

}
