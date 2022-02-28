package com.javalec.base;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 문자열 배열 7개를 생성
		String[] str = new String[7];
		
		str[0] = "일요일";
		str[1] = "월요일";
		str[2] = "화요일";
		str[3] = "수요일";
		str[4] = "목요일";
		str[5] = "금요일";
		str[6] = "토요일";
		
//		for(int i = 0; i < str.length; i++) {	// .length : 길이를 반환
//			System.out.println(str[i]);
//		}
//		
//		System.out.println(str[str.length-1]);
		
//		// 위의 데이터에서 월, 수, 금 만 출력하기 예제 1
//		for(int i = 0; i < str.length; i++) {
//			if(i % 2 == 1) {
//				System.out.println(str[i]);
//			}
//		}
		
		// 월, 수, 금 출력 예제 2
		for(int i = 1; i < str.length; i+=2) {
			System.out.println(str[i]);
		}
		System.out.println();
		
		// ---------------------------------
		
		// 배열 변수 선언 2
		String[] str1 = { "sun", "mon", "tue", "wed", "thu", "fri", "sat" };
		int[] intNum = { 1, 2, 3 };
		double[] doubleNum = { 1.1, 1.2 };
		boolean[] boolNum = { true, false, true };
		
		// 1, 5, 8, 12, 200, 1002 의 평균 구하기(배열과 for문을 사용)
		
		int[] intNum1 = {1, 5, 8, 12, 200, 1002};
		int sum = 0;
		double avg;
		
		for(int i = 0; i < intNum1.length; i++) {
			sum += intNum1[i];
		}
		avg = (double)sum / intNum1.length;
		
		System.out.println("평균 : " + avg);
		System.out.println();
		
		// 구구단 출력 : 5,3,9단
		// 배열과 for문을 이용하여 구구단 출력
		
		int[] gugudan = {5, 3, 9};
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 0; j < gugudan.length; j++) {
				System.out.printf("%d x %d = %-2d\t", gugudan[j], i, gugudan[j]*i);
			}
			System.out.println();
		}
		
	}

}
