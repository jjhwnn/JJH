package com.javalec.function;

public class Calc {
	// 사칙연산 클래
	
	// Field
	public int num1;
	public int num2;
	
	// Constructor
	public Calc() {};
	
	public Calc(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}


	//Method
	// 더하기
	public void add() {

		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
	
	// 빼기 
	public void minus(int num1, int num2) {
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
	}
	

	// 곱하기
	public int multiply() {

		return num1 * num2;
	}
	
	// 나누기
	public double division() {
		
		return (double)num1 / num2;
	}
	
	
}
