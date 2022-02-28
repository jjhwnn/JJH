package com.javalec.base;

public class Main {

	public static void main(String[] args) {

		int num1 = 123;
		String str1 = "12345";
		String str2 = "abcde";
		
		String str3 = Integer.toString(num1); // int를 String으로 바꿔줌
		System.out.println(str3 + str2);
		
		int num2 = Integer.parseInt(str1); // String을 int형으로 바꿔줌
		System.out.println(num2 + num1);
	}

}
