package com.javalec.base;

public class InsertRegist {
	
	public void printRegist(String id, String pw) {
		
		Registration.id = id;
		Registration.pw = pw;
		
		System.out.println("귀하가 입력하신 ID는 " + Registration.id + " 이고 암호는 " + Registration.pw + "입니다.");
		
	}
	
	
	
}
