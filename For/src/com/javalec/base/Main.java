package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
		
		for(int i = 90; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println("------------------------------------");
		
		// 1부터 10까지의 수중 홀수만 출력하기
		for(int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
		
		// 1부터 10까지의 수들의 합계 구하기
		
		int sum = 0; // 누적 변수
		
		for(int i = 1; i <= 10; i++) {
			
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");
		
	}

}


