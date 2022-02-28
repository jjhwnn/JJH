package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ** 사용자가 입력하는 숫자 5개를 받아서 합계를 구하기
		
		// 변수
		Scanner scan = new Scanner(System.in);
		int[] number = new int[5];
		int total = 0;
		
		// 입력 받아오기, 합 누적하기
		for(int i = 0; i < number.length; i++) {
			System.out.print((i+1) + "번의 숫자를 입력하세요 : ");
			number[i] = scan.nextInt();
			total += number[i];
		}
		
		// 출력하기
		System.out.println("귀하가 입력하신 수의 합계는 " + total + "입니다.");
		
	}

}
