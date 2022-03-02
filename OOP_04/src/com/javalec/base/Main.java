package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Addition;
import com.javalec.function.Calc;
import com.javalec.function.ConstCalc;
import com.javalec.function.MethodCalc;

public class Main {

	public static void main(String[] args) {
		// 두개의 정수를 입력 받아 덧셈 기능 구현하기
		// Calc 클래스를 이용해 사칙연산 기능 구현하기
		
		Scanner scan = new Scanner(System.in);
		int num1 = 0;	// 첫번째 수
		int num2 = 0;	// 두번째 수
	
		// 두 개의 수를 입력 받기
		System.out.print("첫번째 수를 입력하세요 :");
		num1 = scan.nextInt();
		
		System.out.print("두번째 수를 입력하세요 :");
		num2 = scan.nextInt();
		
//		// 덧셈 기능 구현하기
//		// Case 1: Field를 이용하여 계산하기
//		Addition addition = new Addition();
//		
//		addition.num1 = num1;
//		addition.num2 = num2;
//		
//		//addition.addAction();
//		int addResult = addition.addReturn();
//		System.out.println(num1 + " + " + num2 + " = " + addResult);
//	
//		Calc calc = new Calc();
//		
//		calc.num1 = num1;
//  	calc.num2 = num2;
		
//		// 더하기 메소드
//		calc.add();
//		
//		// 빼기 메소드
//		calc.substraction(num1, num2);
//		
//		// 곱하기 메소드
//		int result1 = calc.multiply();
//		System.out.println(num1 + " X " + num2 + " = " + result1);
//		
//		// 나누기 메소드
//		double divisionResult = calc.division();
//		System.out.printf("%d / %d = %.2f", num1, num2, divisionResult);
		
//		calc.calcAll();
//		
//		System.out.println(calc.addition());
//		System.out.println(calc.substraction());
//		System.out.println(calc.multiply());
//		System.out.println(calc.division());
		
		
//		MethodCalc calc2 = new MethodCalc();
//		MethodCalc calc3 = new MethodCalc(num1, num2);
//		
//		
//		// addition
//		int resultAddition = calc2.addition(num1, num2);
//		System.out.printf("%d + %d = %d\n", num1, num2, resultAddition);
//		
//		// substraction
//		int resultSubstraction = calc2.substraction(num1, num2);
//		System.out.printf("%d - %d = %d\n", num1, num2, resultSubstraction);
//		
//		// multiplication
//		int resultMultiplication = calc2.multiplicaiton(num1, num2);
//		System.out.printf("%d X %d = %d\n", num1, num2, resultMultiplication);
//		
//		// division
//		double resultDivision = calc2.division();
//		System.out.printf("%d / %d = %.2f\n", num1, num2, resultDivision);
		
		ConstCalc calc = new ConstCalc(num1, num2);
		System.out.printf("%d + %d = %d\n", num1, num2, calc.addition());
		System.out.printf("%d - %d = %d\n", num1, num2, calc.substraction());
		System.out.printf("%d x %d = %d\n", num1, num2, calc.multiplycation());
		System.out.printf("%d / %d = %.2f\n", num1, num2, calc.division());
		
		
	}

}
