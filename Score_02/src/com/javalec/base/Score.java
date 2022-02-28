package com.javalec.base;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// 10개의 정수(0점부터 99점)을 입력받아 ㅈㅁ수의 분포를 10점 간격의 등급으로
		// 된 히스토그램을 표시하라.
		Scanner scan = new Scanner(System.in);
		
		int inputScore[] = new int[10];

		
		// 
		System.out.println("Input score : ");
		for(int i=0; i<10; i++) {
			System.out.print(i+1 + "의 score : ");
			inputScore[i] = scan.nextInt();
			
		}
		
		System.out.println("------- Histogram -------");
		for(int i=9; i>=0; i-=1) {
			System.out.print(i*10 + " : "  );

			for(int j=0; j<10; j++) {
				if(inputScore[j]/10 == i) {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		
		
		
	}

}
