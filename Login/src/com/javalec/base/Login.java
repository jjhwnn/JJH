package com.javalec.base;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		String id;
		String password;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("** Log in Check **");
		
		System.out.print("User id : ");
		id  = scan.next();
		
		System.out.print("Password : ");
		password = scan.next();
		
		if (id.equals("root") && password.equals("1234")) {
			System.out.println("환영 합니다.");
		}else {
			System.out.println("등록된 사용자가 아닙니다.");
		}
		
		// String 자료형은 클래스이기 때문에 == 로 비교시 데이터값을 비교하는 것이 아닌
		// 데이터가 저장된 **주소값** 을 비교하기 때문이다.
	}

}
