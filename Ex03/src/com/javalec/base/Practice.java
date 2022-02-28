package com.javalec.base;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 더하기 할 숫자들의 개수를 정한 후 숫자를 입력 받아서
		// 입력한 숫자의 합을 구하는 프로그램 작성
		
		Scanner scan = new Scanner(System.in);
		
		int sumNum;
		int total = 0;
		
		System.out.print("몇개의 숫자를 더할까요 ? : ");
		sumNum = scan.nextInt();
		
		System.out.println(sumNum + "개의 숫자를 입력하세요");
		
		for(int i = 0; i < sumNum; i++) {
			total += scan.nextInt();
		}
		
		System.out.println("입력한 숫자의 합은 " + total + " 입니다.");
		
	}

}
