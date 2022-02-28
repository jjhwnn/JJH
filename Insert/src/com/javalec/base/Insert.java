package com.javalec.base;

import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		// 몇 개의 숫자를 입력할지 결정한 후
		// 숫자를 입력하고 입력된 위치에 새로운 숫자를 삽입.
		
		// 변수 입력
		Scanner scan = new Scanner(System.in);
		int numCount;
		int number[];
		int insertLocationNum;
		int insertNum;
		int tmp;
		
		// 입력 받기
		System.out.print("입력할 숫자의 갯수? :");
		numCount = scan.nextInt();
		number = new int[numCount+1];
		
		System.out.println(numCount + "의 숫자를 입력하세요!:");
		for(int i =0; i<numCount; i++) {
			System.out.print(i+1+"의 숫자 : ");
			number[i] = scan.nextInt();
		}
		
		
		System.out.print("숫자를 삽입하고자 하는 위치는? : ");
		insertLocationNum = scan.nextInt();
		
		System.out.print("삽입하고자 하는 수는? : ");
		insertNum = scan.nextInt();
		
		for(int i=0; i<numCount; i++ ) {
			if(i == insertLocationNum) {
				number[i] = number[i+1];
			}
		}
		number[insertLocationNum] = insertNum;
		
		// 결과 출력
		System.out.println("-------- 결과 --------");
		for(int i=0; i<numCount; i++) {
			System.out.println(number[i]);
		}
		
		
	}

}
