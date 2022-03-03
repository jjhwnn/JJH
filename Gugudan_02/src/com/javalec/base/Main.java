package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Addition;
import com.javalec.function.Calculation_U0_0303;
import com.javalec.function.Multiply;
import com.javalec.function.RangeGugudan;

public class Main {

	public static void main(String[] args) {
		// 변수 선언
		Scanner scan = new Scanner(System.in);
		int select; // 기능 선택
		
		// 기능별 객체 생성
		RangeGugudan gugudan2 = new RangeGugudan();
		Addition addition = new Addition();
		Multiply multiply = new Multiply();
		Calculation_U0_0303 calculation = new Calculation_U0_0303();
		
		System.out.println("** 원하는 기능을 선택하세요");
		System.out.println();
		System.out.println("1. 덧셈, 뺄셈");
		System.out.println("2. 곱셈, 나눗셈");
		System.out.println("3. 범위의 합계 구하기");
		System.out.println("4. 범위의 곱셈 구하기");
		System.out.println("5. 범위의 구구단 구하기");
		System.out.println("6. 종료");
		
		while(true) {
			
			System.out.print("==>선택 : ");
			select = scan.nextInt();
			
			switch(select) {
			case 1:
				// 덧셈, 뺄셈 구하기 메소드
				calculation.ment();
				calculation.addsub();
				break;
			case 2:
				// 곱셈, 나눗셈 구하기 메소드
				calculation.ment();
				calculation.multidiv();
				break;
				
			case 3:
				// 범위의 합계 구하기
				addition.addAction();
				break;
			case 4:
				// 범위의 곱셈 구하기
				multiply.multiply();
				break;
			case 5:
				// 범위의 구구단 구하기
				gugudan2.viewGugudan();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			
		}
		
		
		
	}
	
	
}
