package com.javalec.base;

public class Practice {

	public static void main(String[] args) {
		// Condition)
		// for문을 하나만 사용할 것
		// 1부터 100까지의 수 중 홀수의 합과 짝수의 합을 각각 구하기
		
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i <= 100; i++) {
			
			if(i % 2 == 0) {
				sum1 += i;
			}else {
				sum2 += i;
			}
			
		}
		System.out.println("짝수의 합 : " + sum1);
		System.out.println("홀수의 합 : " + sum2);
		
	}

}
