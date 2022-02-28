package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder("abcdefg");
		StringBuffer stringBuffer = new StringBuffer("abcdefg");
		
		
		stringBuilder.append("hijklmn");

		stringBuilder.insert(3, "ZZZ");
		stringBuilder.delete(3, 5);
		System.out.println(stringBuilder);
		
	}

}
