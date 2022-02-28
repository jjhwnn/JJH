package com.javalec.base;

public class Sum {

	// Field (Property)
	
	// Constructor
	public Sum() {}
	
	// Method
	// 합계를 구하는 Method
	public int sumCalc(int startNUm, int endNum) {
		
		int sum = 0;
		for(int i=startNUm; i<=endNum; i++) {
			sum+=i;
		}
		return sum;
	}
	
	
}
