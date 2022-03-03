package com.javalec.base;

public class RomanToInt {

	public static void main(String[] args) {
		RomanToInt romanToInt = new RomanToInt();
		
		System.out.println(romanToInt.intToRoman(275));
	}
	
	public String intToRoman(int num) {
		
		int[] romanUnit = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] romanSymbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		String ret = "";
		
		int i = 0;
		
		while(num > 0){
			int unitNum = num / romanUnit[i];
			
		for(int k=0; k<unitNum; ++k) {
			ret += romanSymbol[i];
		}
			
		num -= unitNum*romanUnit[i]; ++i; 

		}
		return ret;

	}
	
}
