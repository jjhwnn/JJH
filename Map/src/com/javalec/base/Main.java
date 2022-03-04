package com.javalec.base;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// 해시맵 객체생
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		// 해시맵 키 값 넣기
		hashMap.put(0, "str0");
		hashMap.put(10, "str1");
		hashMap.put(20, "str2");
		hashMap.put(30, "str3");
		
		System.out.println(hashMap);
		
		String str = hashMap.get(20);
		System.out.println(str);
		
		System.out.println("-------------------------------------");
		
		HashMap<String, String> hashMap1 = new HashMap<String, String>();
		
		// 해시맵 키 값 넣기
		hashMap1.put("apple", "사과");
		hashMap1.put("banana", "바나나");
		hashMap1.put("melon", "멜론");
		hashMap1.put("strawberry", "딸기");
		
		System.out.println(hashMap1);
		
		String str1 = hashMap1.get("melon");
		System.out.println(str1);
	}

}
