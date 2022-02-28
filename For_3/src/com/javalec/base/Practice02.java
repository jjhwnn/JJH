package com.javalec.base;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// 10부터 2000까지의 수를 짝수, 홀수별로 합은 구한 후 전체 평균까지 구하기
		
		// 환경변수 정의
		Scanner scan = new Scanner(System.in);
		
		int startNumber;
		int endNumber;
		int sumEven = 0;
		int sumOdd = 0;
		int sum;
		int count = 0;
		double avg;
		int tmp;
		
		// 사용자로 부터 입력값 받기
		System.out.print("Start Number : ");
		startNumber = scan.nextInt();
		
		System.out.print("End Number : ");
		endNumber = scan.nextInt();
		
//		// 처리하기 1
//		if(startNumber > endNumber) { 		// 시작값이 종료값보다 크게 입력된다면,
//			tmp = startNumber;				// tmp 변수를 이용하여 시작값과 종료값을 바꿔준다.
//			startNumber = endNumber;
//			endNumber = tmp;
//		}
//		
//		for(int i = startNumber; i <= endNumber; i++) {
//			
//				if(i % 2 == 0) {
//					sumEven += i;
//				}else {
//					sumOdd += i;
//				}
//				count++;
//			}

		// 처리하기 2		
		if(startNumber < endNumber) { // 시작값이 마지막 값보다 작은 경우 
			for(int i = startNumber; i <= endNumber; i++) {
			
				if(i % 2 == 0) {
					sumEven += i;
				}else {
					sumOdd += i;
				}
				count++;
			}
		}else if(startNumber > endNumber) { // 시작값이 마지막 값보다 큰 경우
			for(int i = startNumber; i >= endNumber; i--) {
				
				if(i % 2 == 0) {
					sumEven += i;
				}else {
					sumOdd += i;
				}
				count++;
			}
		}
		
		sum = sumEven + sumOdd;		// 짝수합과 홀수합의 총
		avg = (double)sum / count;	// 평균값

		System.out.println(startNumber + "부터 " + endNumber + "까지의 수중 짝수의 합은 "
				+ sumEven + "이고 홀수의 합은 " + sumOdd + "이고 전체 평균은 " + avg + "입니다.");
		
	}

}
