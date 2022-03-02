package com.javalec.function;

public class ConstCalc {

	int num1;
	int num2;
	
	public ConstCalc() {
		
	}

	public ConstCalc(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// add
	public int addition() {
		return num1+num2;
	}
	
	// sub
	public int substraction() {
		return num1-num2;
	}
	
	// mul
	public int multiplycation() {
		return num1*num2;
	}
	
	// div
	public double division() {
		return (double)num1/num2;
	}
	
	
	
}
