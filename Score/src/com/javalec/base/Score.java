package com.javalec.base;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// 시험 점수 평균 프로그램
		// 100점 만점 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("----------------------");
		System.out.println("국어 점수를 입력하세요!");
		int kor = scan.nextInt();
		
		System.out.println("수학 점수를 입력하세요!");
		int math = scan.nextInt();
		
		System.out.println("영어 점수를 입력하세요!");
		int eng = scan.nextInt();
		
		if(kor < 0 || math < 0 || eng < 0) { // 3과목 중 하나라도 0점 이하라면 실행
			
			System.out.println("점수를 잘못 입력 하셨습니다.");
			System.out.println("점수를 0점 이상 입력 해주세요.");
			
		} else if(kor > 100 || math > 100 || eng > 100) { // 3과목 중 하나라도 100점 이상 이하라면 실행
			
			System.out.println("점수는 100점을 넘길 수 없습니다.");
			System.out.println("다시 입력 해주세요.");
			
		} else { // 위의 두 조건이 아닌 경우 실행 !
			
			double avg = (double)(kor + math + eng) / 3;
				
			System.out.println("평균점수 : " + avg);
			
			if(kor > avg) {
				System.out.println("국어 점수는 평균보다 높습니다.");
			}else if(kor == avg) {
				System.out.println("국어 점수는 평균입니다.");
			}else if(kor < avg) {
				System.out.println("국어 점수는 평균보다 낮습니다.");
			}
			
			if(math > avg) {
				System.out.println("수학 점수는 평균보다 높습니다.");
			}else if(math == avg) {
				System.out.println("수학 점수는 평균입니다.");
			}else if(math < avg) {
				System.out.println("수학 점수는 평균보다 낮습니다.");
			}
			
			if(eng > avg) {
				System.out.println("영어 점수는 평균보다 높습니다.");
			}else if(eng == avg) {
				System.out.println("영어 점수는 평균입니다.");
			}else if(eng < avg) {
				System.out.println("영어 점수는 평균보다 낮습니다.");
			}

			
		}
		
		scan.close();
	}

}
