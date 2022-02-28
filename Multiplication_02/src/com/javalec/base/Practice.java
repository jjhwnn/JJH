package com.javalec.base;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 입력한 숫자부터 4개를 증가하여 화면 가로로 구구단을 표시하기
		// 반복문 하나만 쓰기
		
		Scanner scan = new Scanner(System.in);
		
		int number;
		
		System.out.print("Input your number : ");
		number = scan.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %-2d\t", number, i, number*i);
			System.out.printf("%d x %d = %-2d\t", number+1, i, (number+1)*i);
			System.out.printf("%d x %d = %-2d\t", number+2, i, (number+2)*i);
			System.out.printf("%d x %d = %-2d\t", number+3, i, (number+3)*i);
			System.out.println();
		}

	}

}
