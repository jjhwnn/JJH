package com.javalec.base;

import java.util.Scanner;

public class Insert_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = 0; // 숫자의 갯수
		int position = 0; // 삽입 숫자 위치
		int insNum = 0; // 삽입하는 숫자
		int number[] = new int[100];
		
		System.out.print("입력할 숫자의 갯수 ? : ");
		count = scan.nextInt();
		
		System.out.println(count + "개의 숫자를 입력하세요!");
		
		for(int i=0; i<count; i++) {
			System.out.print((i+1)+ "의 숫자 :");
			number[i] = scan.nextInt();
		}
		
		System.out.print("숫자를 삽입하고자 하는 위치는? : ");
		position = scan.nextInt();
		
		System.out.print("삽입하고자 하는 수는? : ");
		insNum = scan.nextInt();
		
		for(int i=count-1; i>=position-1; i--) {
			number[i+1] = number[i];
		}
		number[position-1] = insNum; 
		
		System.out.println("------ 결과 ------");
		for(int i=0; i<=count; i++) {
			System.out.println(String.format("%3d", number[i]));
		}
		

	}

}
