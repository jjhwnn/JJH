package com.javalec.base;

import java.util.Scanner;

public class Score_02 {

	public static void main(String[] args) {
		// 변수 선언
		Scanner scan = new Scanner(System.in);
		
		int[] histo = new int[10];
		
		// 데이터 받아오기
		System.out.println("Input Score : ");
		for(int i=0; i<histo.length; i++) {
			System.out.print(i+1 + "의 Score : ");
			histo[scan.nextInt() / 10]++; //
		}
		
		// 받아온 데이터 히스토그램 타입으로 출력하기
		System.out.println("---------- Histogram ----------");
		for(int i=(histo.length)-1; i>=0; i--) {
			System.out.print(String.format("%3d :", i*10));
			for(int j=1; j<=histo[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
