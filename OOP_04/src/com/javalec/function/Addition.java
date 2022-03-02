package com.javalec.function;

public class Addition {
	// Field
	public int num1;
	public int num2;
	
	// Constructor
	public Addition(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// Method
	public void addAction() {
		System.out.println(num1+ "+" +num2 + " = " + (num1+num2));
	}
	
}
