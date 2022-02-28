package com.javalec.base;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 5부터 1000까지의 범위중 10으로 나누었을 때 나머지가 5인 숫자의 갯수는 _개 이고 합은 _ 입니다.
		// 그리고 나머지가 5인 숫자의 평균은 _입니다.
		// 나머지가 5인 숫자중 최대숫자는 _이고 최소 숫자는 _입니다.
		
		Scanner scan = new Scanner(System.in);
		
		int startNum;	// 시작값
		int endNum;		// 종료값
		int remain;		// 나머지값
		int count = 0; 	// 숫자의 개수
		int sum = 0;	// 숫자의 합 
		double avg = 0;	// 평균값
		int maxNum = 0;	// 최대값
		int minNum = 0;	// 최소값
		
		// 데이터 받아오기
		System.out.print("1. 시작하는 숫자를 정하세요 : ");
		startNum = scan.nextInt();
		
		System.out.print("2. 범위의 끝 숫자를 정하세요 : ");
		endNum = scan.nextInt();
		
		System.out.print("원하는 나머지 값은? ");
		remain = scan.nextInt();
		
		// 예외 처리 - 시작값을 종료값보다 크게 입력한 경우
		if (startNum > endNum) {
			int tmp = startNum;
			startNum = endNum;
			endNum = tmp;			
		}
		if(remain > 9 || remain < 0) {
			System.out.println("잘못된 나머지 값을 입력하였습니다.");
		}else {
			// 최솟값 에러 해결
			if(startNum % 10 > remain && startNum - endNum < 10) {
				minNum = 0;
			} else {
				minNum = endNum;	// 최소값 변수에 종료값 데이터를 넣어준다.
			}
			
			// 분석하기
			for (int i = startNum; i <= endNum; i++) {
				if(i % 10 == remain) {
					// 최대 최소 정하기
				if(minNum >= i) {	// 나머지가 remain인 i값 최솟값보다 작다면
					minNum = i;		// 처음 i값을 최솟값 변수 minNum에 대입해주고
				}					// 이후의 i값은 기존에 대입한 i값보다 작기때문에
					maxNum = i;		// 처음에 대입한 값을 그대로 유지시켜 준다.
					sum += i;
					count++;
				}
			}
			
			if(count != 0) {
				avg = (double)sum / count;
			}
			
			System.out.print(startNum + "부터 " + endNum + "까지의 범위 중 나머지가 ");
			System.out.println(remain + "인 숫자의 갯수는 " + count + "개이고 합은 " + sum + "입니다.");
			System.out.println("그리고 나머지가 " + remain + "인 숫자의 평균은 " + avg + "이고, ");
			System.out.println("나머지가 " + remain + "인 숫자 중 최대숫자는 " + maxNum + "이고 최소숫자는 " + minNum + "입니다. ");
			
		}
		
	}

}









