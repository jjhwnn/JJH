package com.javalec.base;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// BMI 계산기
		// BMI 지수가 18.5 이하면 저체중
		// 18.5 <= bmi < 23 : 정상
		// 23 < bmi <= 25 : 과체중
		// 25 < bmi <= 30 : 비만
		// 30 < bmi <= 35 : 고도비만
		// 35 < bmi : 초고도비만
		
		
		double height;
		double weight;
		double bmi;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("신장(cm)을 입력하세요 : ");
		height = scan.nextDouble();
		System.out.print("몸무게(kg)를 입력하세요 : ");
		weight = scan.nextDouble();
		
		if(height <= 0 || weight <= 0) { // 키, 몸무게 0이하로 입력하였을 경우
			
			System.out.println("잘못 입력하셨습니다. 다시 입력 해주세요");
			
		}else {
			
			bmi = (weight / ((height*height)/10000)); // 괄호 닫기 신중하게  
			
			System.out.println("BMI지수 : " + bmi);
			
			if(bmi < 18.5) {
				System.out.println("귀하는 저체중 입니다.");
			}else if(bmi < 23) {
				System.out.println("귀하는 정상체중 입니다.");
			}else if(bmi < 25) {
				System.out.println("귀하는 과체중 입니다.");
			}else if(bmi < 30) {
				System.out.println("귀하는 비만 입니다.");
			}else if(bmi < 35) {
				System.out.println("귀하는 고도비만 입니다.");
			}else {
				System.out.println("귀하는 초고도비만 입니다.");
			}
			
		}
	
		System.out.println(2^2);
	}

	
}
