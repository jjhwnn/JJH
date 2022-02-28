package com.javalec.base;

public class Main {
	
	public static void main(String[] args) {
		
		int i1 = 10;
		double d1 = i1; // 묵시적 형변환(자동 형변환) : 작은 Data Type이 큰 Data Type에 흡수되 것 
		System.out.println("d1의 데이터는 " + d1 + "입니다.");
		
		double d2 = 10.234;
		int i2 = (int) d2; // 명시적 형변환 : Data 손실이 발생한다.
		System.out.println("i2의 데이터는 " + i2 + "입니다.");
		
	}
	
}
