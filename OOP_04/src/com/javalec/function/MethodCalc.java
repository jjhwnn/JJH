package com.javalec.function;

public class MethodCalc {
	// field
	private int num1;
	private int num2;
	
	
	// constructor
	public MethodCalc() {}
	
	
	public MethodCalc(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}




	// method
	// add
	public int addition(int num1, int num2) {
		return num1 + num2;
	}
	
	// substraction
	public int substraction(int num1, int num2) {
		return num1 - num2;
	}
	
	// multiplication
	public int multiplicaiton(int num1, int num2) {
		return num1 * num2;
	}
	
	// division
	public double division() {
		return (double)num1 / num2;
	}
	
	
}
