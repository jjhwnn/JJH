package com.javalec.base;

public class EvenOdd {

	
	public String evenOdd(int sum) {
		int checkSum = sum % 2;
		String result = "";
		
		if(checkSum % 2 == 0) {
			result="짝수";
		}else {
			result="홀수";
		}
	
		return result;
	}
	
}
