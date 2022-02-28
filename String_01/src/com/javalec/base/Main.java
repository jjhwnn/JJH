package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// API(Application Programming Interface)
		// : 개발자들이 편리하게 사용할 수 있도록 정의한 클래스들의 집합
		
		String str1 = "abcdefg";
		String str2 = "HIJKLMN";
		String str3 = "opqrstu";
		String str4 = "    abc    def    ghi    ";
		String str5 = "   abcdefg   ";
		
		System.out.println(str1.concat(str2));
		System.out.println(str1.substring(3, 5));
		
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.equals(str4));
		System.out.println(str4.trim());
		
		System.out.println(str1.equals(str5.trim()));
		System.out.println(str1.replace('a', 'Z'));
		System.out.println(str1.replaceAll("abc", "zzzzzz"));
		System.out.println(str1.replaceAll("a", ""));
		
		
	}

}
