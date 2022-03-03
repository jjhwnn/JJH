package com.javalec.function;

public class MultiCalc {
	
	private int firstNum;
	private int secondNum;
	
	public MultiCalc() {}

	// 연산자 호출 메소
	public void calc(int choiceNumber, int firstNumber, int secondNum) {
		this.firstNum = firstNumber;
		this.secondNum = secondNum;
		
		switch(choiceNumber) {
		case 1:
			System.out.printf("%d + %d = %d", firstNumber, secondNum, addition());
			break;
		case 2:
			System.out.printf("%d - %d = %d", firstNumber, secondNum, substraction());
			break;
		case 3:
			System.out.printf("%d x %d = %d", firstNumber, secondNum, multiplication());
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}

	}
	
	// 덧셈 메소드
	private int addition() {
		return firstNum + secondNum;
	}
	
	// 뺄셈 메소드
	private int substraction() {
		return firstNum - secondNum;
	}
	
	// 곱셈 메소드
	private int multiplication() {
		return firstNum * secondNum;
	}

}
