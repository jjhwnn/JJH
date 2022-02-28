package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 1~10 까지의 합을 구하여 출력하고
		// 그합이 짝수인지 홀수 인지 판별
//		int sum = 0;
//		
//		for(int i = 1; i <=10; i++) {
//			sum += i;
//		}
//		System.out.print(sum + " : ");
//		if(sum % 2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
		
		int i=1, j=500;
		
		SumEvenOdd sumEvenOdd = new SumEvenOdd(); // 객체(인스턴스) 생성
		
		int sum = sumEvenOdd.sumCalc(i, j);
		String result = sumEvenOdd.evenOdd(sum);
		
		System.out.println(i + "~" + j + "의 합은 " + sum + "입니다.");
		System.out.println(result + " 입니다.");
		
	}

}
