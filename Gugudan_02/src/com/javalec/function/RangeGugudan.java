package com.javalec.function;

import java.util.Scanner;

public class RangeGugudan {

	// 범위의 구구단 구하기
	
	Scanner scan = new Scanner(System.in);
	// 변수 선언
	private int danNum1; // 입력받을 첫번째 구구단
	private int danNum2; // 입력받을 두번째 구구단

	
	// 생성자
	public RangeGugudan() {}
	
	// danNum1부터 danNum1까지 메소드
	public void viewGugudan() {
		System.out.print("- 첫번째 수를 입력 하세요 : ");
		danNum1 = scan.nextInt();
		
		System.out.print("- 두번째 수를 입력 하세요 : ");
		danNum2 = scan.nextInt();
		
		// 시작값이 종료값보다 클 경우 두수 바꿔주는 예외처리
		if(danNum1 > danNum2) {
			int tmp = danNum1;
			danNum1 = danNum2;
			danNum2 = tmp;
		}
		for (int i = 1; i <= 9; i++) {
			for(int j = danNum1; j <= danNum2; j++) {
				System.out.printf("%d x %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
	}
	

	
	
}
