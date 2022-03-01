package com.javalec.base;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// 몇 개의 숫자를 입력 할지 결정한 후
		// 숫자를 입력하고 이중 검색을 원하는 숫자의 위치를 파악.
		
		Scanner scan = new Scanner(System.in);
		
		int count;
		int number[];
		int searchNum;
		
		System.out.print("입력할 숫자의 갯수? : ");
		count = scan.nextInt();
		
		number = new int[count];
		
		System.out.println(count + "개의 숫자를 입력하세요!:");
		for(int i =0; i < count; i++) {
			System.out.print(i+1+"의 숫자 :");
			number[i] = scan.nextInt();
		}
		
		System.out.print("검색할 숫자는? :");
		searchNum = scan.nextInt();
		
		// 입력한 수가 존재한다면
		for(int i=0; i<count; i++) {
				// number배열 변수의 인덱스를 모두 돌고난 후 마지막 인덱스에서도 검색한 숫자가
				// 발견되지 않을 때 한번만 출력
			if(number[i] != number[i] && number[i] == number[number.length-1]) {
				System.out.println(searchNum + "는 존재하지 않습니다.");
			}else {
				System.out.println(searchNum + "의 위치는 " + (i+1) + "번째 입니다.");
			}
			
//			if(searchNum == number[i]) {
//				System.out.println(searchNum + "의 위치는 " + (i+1) + "번째 입니다.");
//			}else {
//				if(number[i] == number[number.length-1]) {
//					System.out.println(searchNum + "는 존재하지 않습니다.");
//				}
//			}
			
		}
		

		
	}

}
