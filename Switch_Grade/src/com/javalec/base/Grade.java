package com.javalec.base;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double score;
		char grade;
		
		System.out.print("성적을 입력하세요 : ");
		score = scan.nextDouble();
		
		switch((int)score / 10) { // score 가 double 자료형이기 때문에 int 로 강제 형변환을 해준다.
		
	   // switch의 case문은 무조건 int 혹은 String, char 의 형태로 입력되어야 한다.
		
		case 10:  		// 100점의 경우도 A 이기 때문에 break;을 따로 넣지 않는다.
		case 9:				
			grade = 'A';	// score가 90점 이상일시 grade 변수에 A 값 반환 
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		System.out.println("귀하의 등급은 " + grade + " 입니다.");
		
	}

}
