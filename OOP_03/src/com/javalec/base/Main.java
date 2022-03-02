package com.javalec.base;

import com.javalec.function.Korean;

public class Main {

	public static void main(String[] args) {
		// kor라는 인스턴스를 만든다.
		
		// Field의 name에는 홍길동, phone에는 010-1234-5678을 추가하여 출력하기
		
		Korean kor = new Korean();
		
		kor.name = "홍길동";
		kor.phone = "010-1234-5678";
		
		System.out.println("Name : " + kor.name);
		System.out.println("Phone : " + kor.phone);

	}

}
