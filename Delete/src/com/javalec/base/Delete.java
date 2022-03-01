package com.javalec.base;

import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		// 몇 개의 숫자를 입력한지 결정한 후
		// 숫자를 입력하고 이중 필요없는 숫자의 위치를 정해 삭제
		
		Scanner scan = new Scanner(System.in);
		int count;
		int[] number = new int[100];
		int index;
		
		//숫자 갯수 입력, 갯수만큼의 숫자 입력
		System.out.print("입력할 숫자의 갯수? :");
		count = scan.nextInt();
		
		System.out.println(count + "개의 숫자를 입력하세요!: ");
		for(int i=0; i<count; i++) {
			System.out.print(i+1+"의 숫자 :");
			number[i] = scan.nextInt();
		}
		
		//삭제할 숫자 인덱스 입력 deletedelete
		System.out.print("몇번째의 숫자를 삭제 하시겠습니까? :");
		index = scan.nextInt();
		
		for(int i = index-1; i <= count-1; i++) {
			number[i] = number[i+1];
		}
		
		//결과 출력
		System.out.println("--------- 결과 ---------");
		for(int i=0; i < count-1; i++) {
			System.out.println(number[i]);
		}
		
		
	}

}
