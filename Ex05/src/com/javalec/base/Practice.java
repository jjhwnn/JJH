package com.javalec.base;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 입력한 한 자릿수 정수의 합을 구하는 프로그램을 작성하라.
		// 길이제한x
		
		Scanner scan = new Scanner(System.in);
		
		int number;
		int sum = 0;
		
		System.out.println("Enter an integer(0 ~ 9)");
		number = scan.nextInt();
		
		while(true) {
			sum += number % 10;
			number /= 10;
			
			if(number == 0) {
				break;
			}

		}
		
		System.out.println("Sum of digits = " + sum);

	}

}
