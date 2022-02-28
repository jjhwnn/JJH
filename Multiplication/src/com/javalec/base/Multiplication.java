package com.javalec.base;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// 구구단 프로그램 만들기
		
		// 구구단 한 단만 출력하기
//		Scanner scan = new Scanner(System.in); 
//		
//		int dan;
//		
//		System.out.print("단을 입력 해주세요 : ");
//		dan = scan.nextInt();
//
//		for(int i = 1; i <= 9; i++) {
//			System.out.printf("%d x %d = %2d\n", dan, i, dan*i);
//		}
		
		// 구구단 전체 콘솔창에 띄우기
		// 곱해지는 수가 짝수만 출력 되게 해보기 
		// 짝수단만 출력하기 
		
//		for(int i = 1; i <= 9; i++) {
//			if(i % 2 == 0) {
//				for(int j = 2; j <= 9; j++) {
//					if(j % 2 == 0) {
//						System.out.printf("%d x %d = %-2d\t", j, i, i*j);
//					}
//						
//				}
//				System.out.println();
//			}
//			
//		}
		
//		// 결과값이 짝수인 것만 출력해보기
//		// 홀수인 정답은 정답 밑에 언더바를 표시해주
//		for(int i = 1; i <= 9; i++) {
//			
//			for(int j = 2; j <=9; j++) {
//				if(j*i % 2 == 1) {
//					System.out.printf("%d x %d = _\t", j, i);
//				}else {
//					System.out.printf("%d x %d = %-2d\t", j, i, j*i);
//				}
//			}
//			System.out.println();
//		}
		
		// 곱해지는 수 중 홀수는 *로 표시하기
		for(int i = 1; i <= 9; i++) {
				for(int j = 2; j <= 9; j++) {
					if(i % 2 == 1) {
						System.out.printf("%d x * = %-2d\t", j, j*i);
					}else {
						System.out.printf("%d x %d = %-2d\t", j, i, j*i);
					}

				}
			System.out.println();
		}
		
	}

}
