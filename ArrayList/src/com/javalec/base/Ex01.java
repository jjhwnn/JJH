package com.javalec.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 몇 개의 숫자를 입력한지 결정한 후
		// 숫자를 입력하고 이중 필요없는 숫자의 위치를 정해 삭제
		
		// 변수(객체) 선언
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int addNum;
		int delNum;
		
		// ArrayList 데이터 입력받기
		System.out.println("5개의 숫자를 입력하세요!:");
		for(int i = 0; i < 5; i++) {
			System.out.print(i+1+"의 숫자:");
			addNum = scan.nextInt();
			arrayList.add(addNum);
		}
		
		// 삭제할 값 받기
		System.out.print("몇번째 숫자를 삭제 하시겠습니까? :");
		delNum = scan.nextInt();
		arrayList.remove(delNum-1);
		
		// 출력
		System.out.println("------- 결과 --------");
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i)); 
		}
		
	}

}
