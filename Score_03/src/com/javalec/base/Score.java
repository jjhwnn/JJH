package com.javalec.base;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// 학생수가 4명이고 과목이 3과목일 경우의 점수 합계와 평균구하기 기능 추가

		// 변수 선언
		Scanner scan = new Scanner(System.in);
		
		String[] subject = {"Korean", "English", "Mathmatics"};
		String[] student = {"No1", "No2", "No3", "no4"};
		int score;
		int[] kor = new int[4];
		int[] eng = new int[4];
		int[] mat = new int[4];
		int[] total = new int[4];
		
		// 학생 성적 입력받기
		for(int i = 0; i < subject.length; i++) {
			System.out.println(subject[i] + "의 성적을 입력: ");
			
			for(int j=0; j<student.length; j++) {
				System.out.print("no" + (j+1) + "의 성적은 : ");
				score = scan.nextInt();
				kor[j] = score;
				eng[j] = score;
				mat[j] = score;
				total[j] += score;
			}
		}
		
		
		// 결과 출력
		
		for(int i = 0; i < student.length; i++) {
			System.out.print(student[i] + "\t");
			for(int j=0; j<subject.length; j++) {
				System.out.printf("%d\t", score[i]);
			}
			System.out.println(total[i] +"\t"+ (double)total[i]/subject.length);
		}
		
		
		// test
		
	}

}
