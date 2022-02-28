package com.javalec.base;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// 몇 개의 숫자를 입력 할지 결정한 후
		// 숫자를 입력하고 이중 검색을 원하는 숫자의 위치를 파악.
		
		Scanner scan = new Scanner(System.in);
		
		int numCount;
		int number[];
		int searchNum;
		
		System.out.print("입력할 숫자의 갯수? : ");
		numCount = scan.nextInt();
		
		number = new int[numCount];
		
		System.out.println(numCount + "개의 숫자를 입력하세요!:");
		for(int i =0; i < numCount; i++) {
			System.out.print(i+1+"의 숫자 :");
			number[i] = scan.nextInt();
		}
		
		System.out.print("검색할 숫자는? :");
		searchNum = scan.nextInt();
		for(int i=0; i<numCount; i++) {
		
			if(searchNum == number[i]) {
				System.out.println(searchNum + "의 위치는 " + (i+1) + "번째 입니다.");
			} else {
				System.out.println(searchNum + "은 존재하지 않습니다.");
			}
		}
		
		
		
		
	}

}
