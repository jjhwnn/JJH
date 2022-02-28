package com.javalec.base;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Random 클래스 : 분석 할때 많이 사용됨
		Random random = new Random();
		
		int temp = random.nextInt(3)+1;
		if(temp == 1) {
			System.out.println("가위");
		}else if(temp == 2) {
			System.out.println("바위");
		}else {
			System.out.println("보");
		}

	}

}
