package com.javalec.base;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		// 고객의 입금, 출금 및 현황을 관리하는 Program을 작성하라
		// 단, 고객명은 1,2,3,4,5이다.
		
		// 변수 선언
		Scanner scan = new Scanner(System.in);
		int selNum; 	// 항목 선택 변수
		int[] clientNumList = {1, 2, 3, 4, 5}; // 고객 번호 리스트
		int[] money = new int[5];	// 고객별 잔액 리스트 
		int searchClientNum;	// 검색할 고객번호 변수
		int withdrawMoney;	// 출금할 금액 받아오는 변수
		
		// 값 받기
		while(true) {
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.현황");
			System.out.println("4.종료");
			
			System.out.print("번호를 입력하세요! : ");
			selNum = scan.nextInt();
			
			switch(selNum) {
			
			// 입금 받기 (기존의 잔액에 더해져 누적하기)
			case 1:
				System.out.print("고객번호 : ");
				searchClientNum = scan.nextInt();
				
				for(int i=0; i<clientNumList.length; i++) {
					
					// 입력받은 고객번호가 고객리스트 마지막까지 돌았는데 존재하지 않을때
					if(searchClientNum != clientNumList[i] && i == clientNumList.length-1) {
						System.out.println("해당 고객번호가 존재하지 않습니다.");
						break;
						
						// 입력한 고객번호가 고객리스트에 존재할때만 '한번' 실행하기
					} else if(searchClientNum == clientNumList[i]) { 
						
						System.out.print("입금 금액 : ");
						money[i] += scan.nextInt();
						
						System.out.println("입금 결과 : 고객번호 : " + clientNumList[i] + " 잔액 : "
								+ money[i]);
						break;
					} 
				}
				System.out.println("--------------------------------");
				
				break;
				
				// 출금 받기 (기존의 잔액에서 감액, 잔액 부족할 때 부족합니다 띄우기)
			case 2:
				System.out.print("고객번호 : ");
				searchClientNum = scan.nextInt();
				
				for(int i=0; i<clientNumList.length; i++) {
					
					// 입력받은 고객번호가 고객리스트 마지막까지 돌았는데 존재하지 않을때
					if(searchClientNum != clientNumList[i] && i == clientNumList.length-1) {
						System.out.println("해당 고객번호가 존재하지 않습니다.");
						break;
						
						// 입력한 고객번호가 고객리스트에 존재할때만 '한번' 실행하기
					} else if(searchClientNum == clientNumList[i]) { 
						
						System.out.print("출금 금액 : ");
						withdrawMoney = scan.nextInt();
						// 출금금액이 잔액보다 적을때 
						if(money[i] < withdrawMoney) {
							System.out.println("잔액이 부족합니다.");
							break;
						} else {
							money[i] -= withdrawMoney;
						}
						
						System.out.println("출금 결과 : 고객번호 : " + clientNumList[i] + " 잔액 : "
								+ money[i]);
						break;
						
					} 
				}
				System.out.println("--------------------------------");

				break;
				
				// 현황 리스트로 뽑기
			case 3:
				System.out.println("\t고객명\t잔액");
				System.out.println("\t----\t---");
				for(int i=0; i<clientNumList.length; i++) {
					System.out.println("\t" + clientNumList[i] + "\t" + money[i]);
				}
				System.out.println("--------------------------------");
				break;
				
				// 종료
			case 4:
				System.out.println(">>>>> Thank you <<<<<");
				return;
			}
			
			
		}

		
		
		
	}

}
