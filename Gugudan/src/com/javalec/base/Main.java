package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Gugudan;

public class Main {

	public static void main(String[] args) {
		// 입력 받은 구구단을 출력하는 프로그램을 Class를 분리해서 객체지향 형식으로 작성
		// Class 구성시에 몇단을 출력할 것인지 정할 것.
		
		// 변수 입력
		Scanner scan = new Scanner(System.in);
		
		int dan; // 구구단 단
		
		// 단 입력 받기
		System.out.print("구구단을 출력할 숫자를 입력하세요 : ");
		dan = scan.nextInt();

		// 결과 출력
		Gugudan gugudan = new Gugudan(dan);
		
		gugudan.gugudan();
		
	}

}
