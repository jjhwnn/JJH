package com.javalec.function;

public class Addition {
	// Field
	public int num1;
	public int num2;
	
	// Constructor
	public Addition() {

	}
	
	// Method
	public void addAction() {
		System.out.println(num1+ "+" +num2 + " = " + (num1+num2));
	}
	
	public int addReturn() {
		return num1 + num2;
	}
	
}
