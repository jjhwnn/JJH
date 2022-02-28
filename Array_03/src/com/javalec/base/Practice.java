package com.javalec.base;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		// 변수 선언
		Scanner scan = new Scanner(System.in); 
		
		String[] name = { "James", "Cathy", "Kenny", "Martin", "Crystal" };
		int[] height = new int[name.length];
		int total = 0;
		double avg;
		int maxHeight; 		// 초기화를 하지 않으면 null값이 들어감
		int minHeight;
		// int maxIndex = 0;
		// int minIndex = 0;
		String maxHeightName = null;
		String minHeightName = null;
		
		// 입력 받아오기
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "의 신장을 입력하세요 : ");
			height[i] = scan.nextInt();
			
			total += height[i];
		}
		// 평균값 구하기
		avg = (double)total / height.length;
		
		// 최대값과 최소값 구하기
		maxHeight = height[0];
		minHeight = height[0];
		
		for(int i = 0; i < height.length; i++) {
			if(maxHeight < height[i]) {
				maxHeight = height[i];
				//maxIndex = i;	// 가장 큰 인덱스 번지 수 저장
				maxHeightName = name[i];
			}
			if(minHeight > height[i]) {
				minHeight = height[i];
				//minIndex = i;	// 가장 작은 인덱스 번지 수 저장
				minHeightName = name[i];
			}
		}

		// 출력하기
		System.out.println("평균신장은 : " + avg);
		System.out.println("가장 큰 학생은 " + maxHeightName + "이고 그 학생의 키는 " + maxHeight);
		System.out.println("가장 작은 학생은 " + minHeightName + "이고 그 학생의 키는 " + minHeight);
		
	}

}
