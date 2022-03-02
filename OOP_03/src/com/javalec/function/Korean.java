package com.javalec.function;

public class Korean {
	// Field
	String nation = "대한민국";
	String name;
	String phone;
	
	
	// Constructor
	public Korean() {
		
	}
	
	
	// Method					Parameter
	public void printName(String name1, String phone1) {
		name = name1;
		phone = phone1;
		System.out.println("Nation : " + nation);
		System.out.println("Name : " + name);
		System.out.println("Phone : " + phone);
	}
	
}
