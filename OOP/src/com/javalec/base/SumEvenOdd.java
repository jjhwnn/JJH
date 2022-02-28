package com.javalec.base;

public class SumEvenOdd {

	// Field (Property)
	
	// Constructor
	public SumEvenOdd() {}
	
	// Method
	// 합계를 구하는 Method
	public int sumCalc(int startNUm, int endNum) {
		
		int sum = 0;
		for(int i=startNUm; i<=endNum; i++) {
			sum+=i;
		}
		return sum;
	}
	
	// 홀짝수 판단하는 Method
	public String evenOdd(int sum) {
		int checkNum = sum % 2;
		String str = "";
		
		if(checkNum == 0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		return str;
	}
	
	
}
