package com.javalec.base;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 5부터 1000까지의 범위중 10으로 나누었을 때 나머지가 5인 숫자의 갯수는 _개 이고 합은 _입니다.
		// 그리고 나머지가 5인 숫자의 평균은 _입니다.
		// 나머지가 5인 숫자중 최대숫자는 _이고 최소 숫자는 _입니다.
		
		Scanner scan = new Scanner(System.in);
		
		int startNum;
		int endNum;
		int remain;
		int count = 0;
		int sum = 0;
		double avg = 0;
		int maxNum = 0;
		int minNum = 0;
		int tmp;
		String check = "start";
		
		
		System.out.print("1. 시작하는 숫자를 정하세요 : ");
		startNum = scan.nextInt();
		
		System.out.print("2. 범위의 끝 숫자를 정하세요 : ");
		endNum = scan.nextInt();
		
		System.out.print("원하는 나머지 값은? ");
		remain = scan.nextInt();
		
		// 예외처리 
		if(startNum > endNum) {
			tmp = startNum;
			startNum = endNum;
			endNum = tmp;
		}
		
		for(int i = startNum; i <= endNum; i++) {
			
			if(i % 10 == remain) {
				sum += i;
				count++;
				maxNum = i;
				
				// 최소값 예제 1
				if(check.equals("start")) {
					minNum = i;
					check = "end";
				}
				
//				// 최소값 예제 2				
//				if(minNum == 0) {	// minNum의 초기값이 0이기 때문
//					minNum = i;		// for문내 i의값을 minNum변수에 할당해주고 
//				}					// 이후 minNum의 값이 0이 아니기 때문에 조건문을 더이상
//									// 실행하지 않음
			}
			
		}

//		// 최소값 예제 3
//		if(maxNum != 0) {
//			if(startNum % 10 <= remain) {
//				minNum = (startNum / 10)*10 + remain;
//				
//			}else {
//				minNum = (startNum / 10)*10 + remain + 10;
//			}
//		}													// for문 내에서 if문을 사용하는 것보다 if문을
//															// 밖에서 사용하는 것이 컴퓨터 시스템에 효율적
		
		avg = (double)sum / count;
		
		System.out.print(startNum + "부터 " + endNum + "까지의 범위 중 나머지가 ");
		System.out.println(remain + "인 숫자의 갯수는 " + count + "개이고 합은 " + sum + "입니다.");
		System.out.println("그리고 나머지가 " + remain + "인 숫자의 평균은 " + avg + "이고, ");
		System.out.println("나머지가 " + remain + "인 숫자 중 최대숫자는 " + maxNum + "이고 최소숫자는 " + minNum + "입니다. ");
		
	}

}









