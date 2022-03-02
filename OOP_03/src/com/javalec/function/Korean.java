package com.javalec.function;

public class Korean {
	// Field
	String nation = "대한민국";
	String name;
	String phone;
	
	
	// Constructor
	public Korean() {
		
	}

	public Korean(String name, String phone) {
		super();
		this.name = name;	// this : 필드를 가리켜줌
		this.phone = phone;
	}



	// Method					
	public void printName() { // 메소드 괄호 안에는 파라미터값이라고 부른
		System.out.println("Nation : " + nation);
		System.out.println("Name : " + name);
		System.out.println("Phone : " + phone);
	}
	
}
