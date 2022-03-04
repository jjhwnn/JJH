package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 변수 선언
		Scanner scan = new Scanner(System.in);
		
		String id;
		String pw;
		
		// id,pw 입력받기
		System.out.print("ID : ");
		id = scan.next();
		
		System.out.print("PW : ");
		pw = scan.next();
		
		InsertRegist insertRegist = new InsertRegist();
		
		insertRegist.printRegist(id, pw);
	

	}

}
