package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		
		Child child = new Child();
		System.out.print("아버님 성함 : ");
		child.getFather();
		
		System.out.print("아버님 성함 : ");
		child.getMother();
		
		System.out.print("내 이름 : ");
		child.getMe();
	}

}
