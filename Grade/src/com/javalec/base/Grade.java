package com.javalec.base;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// 학점 관리 프로그램
		
		int score;
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("** 학점 관리 **");
		System.out.print("점수를 입력하세요 : ");
		score = scan.nextInt();
		
		if(score > 100) { // 점수가 100점 이상 입력 된 경우 
			System.out.println("점수는 100점 만점 입니다.");
			System.out.println("다시 입력 해주세요.");
		}
		else if(score < 0) { // 점수가 마이너스 점수로 입력 된 경우
			System.out.println("점수는 0점 이상 입력 해주세요.");
			
		}else {
			if(score >= 90) {
				System.out.println("귀하는 A학점 입니다.");
				
			}else if(score >= 80) {
				System.out.println("귀하는 B학점 입니다.");
				
			}else if(score >= 70) {
				System.out.println("귀하는 C학점 입니다.");
				
			}else if(score >= 60) {
				System.out.println("귀하는 D학점 입니다.");
				
			}else {
				System.out.println("귀하는 F학점 입니다.");
			}
		}
		
		
		
	}

}
