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
//	// 더하기
//	public void add() {
//
//		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
//	}
//	
//	// 빼기 
//	public void substraction(int num1, int num2) {
//		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
//	}
//	
//
//	// 곱하기
//	public int multiply() {
//
//		return num1 * num2;
//	}
//	
//	// 나누기
//	public double division() {
//		
//		return (double)num1 / num2;
//	}
	
	// action메소드에서 연산된 값을 String 형태로 모두 받아 리턴
	public String addition() {
		return (num1 + " + " + num2 + " = " + addAction());
	}
	
	public String substraction() {
		return (num1 + " - " + num2 + " = " + subAction());
	}
	
	public String multiply() {
		return (num1 + " * " + num2 + " = " + multiplyAction());
	}
	
	public String division() {
		return (num1 + " / " + num2 + " = " + divisionAction());
	}
	
	public void calcAll() {
		addition();
		substraction();
		multiply();
		division();
	}
	
	private int addAction() {
		return num1 + num2;
	}
	private int subAction() {
		return num1 - num2;
	}
	private int multiplyAction() {
		return num1 * num2;
	}
	private double divisionAction() {
		return (double)num1 / num2;
	}
	
	
	
}
