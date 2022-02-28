package com.javalec.base;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//환경 설정 
		Scanner scan = new Scanner(System.in);
		
		//금액 입력받기 
		System.out.print("금액을 입력하세요 : ");
		int price = scan.nextInt();
		
		// 금액은 마이너스 금액 존재하지 않기 때문에 먼저 if문으로 마이너스를 처리해줌 
		if(price < 1) {
			System.out.println("1원 이상 입력 해주세요.");
		}else {
			
			// 처리하기 
			if(price > 8000) {
				System.out.println("너무 비쌉니다.");
			} else if(price > 5000) {
				System.out.println("조금 비쌉니다.");
			} else if(price > 3000) {
				System.out.println("적당한 금액입니다.");
			} else {
				System.out.println("싼편 입니다.");
			}
			
		}
		
		scan.close();
	}

}
