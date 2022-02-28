package com.javalec.base;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 몇 개의 숫자를 입력한지 결정한 후
		// 숫자를 입력하고 이중 최대값의 위치와 최대값을 구하라
		
		Scanner scan = new Scanner(System.in);
		
		int insertNum = 0;
		int number[];
		int maxNum;
		int location = 0;
		
		if(insertNum >= 100) {
			System.out.println("100개 미만의 개수로 입력 해주세요");
		}else {
			System.out.print("입력할 숫자의 갯수 ? (100개 미만) : ");
			insertNum = scan.nextInt();
		}
		number = new int[insertNum];
		
		System.out.println(insertNum + "개의 숫자를 입력하세요!");
		for(int i = 0; i < insertNum; i++) {
			number[i] = scan.nextInt();
		}
		
		maxNum = number[0];
		for(int i = 0; i < insertNum; i++) {
			if(number[i] > maxNum) {
				maxNum = number[i];
				location = i+1;
			}
		}
		
		System.out.println("입력한 숫자중 최대값은 " + maxNum + "이고 " + location + "번째 값 입니다.");
		
	}

}
