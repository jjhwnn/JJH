package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 10개의 정수(0-99)를 받아 점수의 분포를 10점 간격의 등급으로 
		// 된 히스토그램을 표시하라
		
		Scanner scan = new Scanner(System.in);
		
		String[] histo = new String[10];
		int score;
		
		String count = "";
		
		System.out.println("Input score : ");
		for(int i =0; i < histo.length; i++) {
			System.out.print(i+1+"의 score :");
			score = scan.nextInt();
			
			

		}
		
		System.out.println("--------- Histogram ---------");
		for(int i=90; i>=0; i--) {
			System.out.println(i + " : " + count);
		}

		
		
	}

}
