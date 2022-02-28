package com.javalec.base;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		// 고객의 입금, 출금 및 현황을 관리하는 Program을 작성하라
		// 단, 고객명은 1,2,3,4,5이다.
		
		// 변수 선언
		Scanner scan = new Scanner(System.in);
		int selNum;
		int[] client = {1, 2, 3, 4, 5};
		int selClientNum;
		int[] money = new int[100];
		
		// 값 받기
		do {
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.현황");
			System.out.println("4.종료");
			
			System.out.print("번호를 입력하세요! : ");
			selNum = scan.nextInt();
			
			switch(selNum) {
			case 1:
				System.out.print("고객번호 : ");
				selClientNum = scan.nextInt();
				
				System.out.print("입금 금액 : ");
				money[selClientNum-1] = scan.nextInt();
				
				System.out.println("입금 결과 : 고객번호 : " + selClientNum + " 잔액 : "
				+ money[selClientNum-1]);
				break;
			case 2:
				break;
			case 3:
				System.out.println();
				break;
			case 4:
				System.out.println(">>>>> Thank you <<<<<");
				return;
			}
			
			// 결과값 출력
			
		} while(selNum == 4);

		
		
		
	}

}
