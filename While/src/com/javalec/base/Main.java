package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1부터 100까지의 합을 구하기
		
//		int i = 0;
//		int total = 0;
//		
//		while(true) {
//			total += i;
//			i++;
//			if(i > 100) {
//				break;
//			}
//		}
//		System.out.println("1부터 100까지의 합은 " + total + "입니다.");
		
		for(int i = 0; i <= 100000; i++) {
			if(i==10) {
				System.out.println("Find");
				break; // break를 걸지 않으면, 멈추지 않고도 종료값까지 수행한다.
			}
			
		}
		
		for(int i = 0; i <= 100; i++) {
			if(i==10) {
				continue;		// 해당 값을 건너뛰기
			}
			System.out.println(i);
		}
		
	}

}
