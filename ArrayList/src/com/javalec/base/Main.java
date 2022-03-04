package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(">>>> ArrayList <<<<");
		
		// 구성
		ArrayList<String> arrayList = new ArrayList<String>();
		
		
		// 추가
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");
		
		// CRUD : Create, Read, Update, Delete
		// 확인하기
		System.out.println(arrayList.toString()); // .toString()메소드가 디폴트로 설정되있다.
		
		// 불러오기
		String no1 = arrayList.get(0);
		System.out.println(no1);
		
		// 변경하기
		arrayList.set(2, "str222"); // 앞에 숫자는 인덱스**번호이다
		
		// 확인하기
		System.out.println(arrayList.toString());
		
		// 삭제하기
		arrayList.remove(2);
		System.out.println(arrayList.toString());
		
		// 크기 알기
		int size = arrayList.size();
		System.out.println("Size : " + size);
		
		
		
//		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
//		
//		// Quiz ArrayList intList에 1부터 100까지의 수를 넣으세요
//		for(int i=1; i<=100; i++) {
//			arrayList2.add(i);
//		}
//		System.out.println(arrayList2);
		
		
		
		
	}

}
