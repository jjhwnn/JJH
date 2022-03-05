package com.javalec.base;

import java.util.Scanner;

public class Score_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int score;
		int kor[] = new int[4];
		int eng[] = new int[4];
		int mat[] = new int[4];
		int total[] = new int[3];
	
			
		System.out.println("Korean의 성적을 입력: ");	
		for(int j=0; j < kor.length; j++) {
			System.out.print(j+1+"'s score : ");
			score = scan.nextInt();
			kor[j] = score;
			total[0] += score;
		}
		
		System.out.println("English의 성적을 입력: ");	
		for(int j=0; j < eng.length; j++) {
			System.out.print(j+1+"'s score : ");
			score = scan.nextInt();
			eng[j] = score;
			total[1] += score;
		}
		
		System.out.println("Mathmatics의 성적을 입력: ");	
		for(int j=0; j < mat.length; j++) {
			System.out.print(j+1+"'s score : ");
			score = scan.nextInt();
			mat[j] = score;
			total[2] += score;
		}
		

		

	}

}
