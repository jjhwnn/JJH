package com.javalec.base;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// 입력한 수의 factorial 구하기 ( 예 4! = 4x3x2x1 )
		
		Scanner scan = new Scanner(System.in);
		
		int factorial;
		int factorialNumber = 1;
		
		System.out.print("Input your decimal no. ");
		factorial = scan.nextInt();
		
		for(int i=1; i<=factorial; i++) {
			
			factorialNumber *= i;
		}
		
		System.out.println("factorial value = " + factorialNumber);
		
	}

}
