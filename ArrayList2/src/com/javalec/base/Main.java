package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// Customer객체를 여러개 배열로 저장
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		
		Customer customer = new Customer(1, "James", "010-1111-2222");
		Customer customer2 = new Customer();
		customer2.setNumber(2);
		customer2.setName("Cathy");
		customer2.setPhone("010-7777-8888");
		// 데이터 넣기
		customers.add(customer);
		customers.add(customer2);
		
		
		//-------------
		int[] number = {3, 4, 5};
		String[] name = {"유비", "관우", "장비"};
		String[] phone = {"3333", "4444", "5555"};
		
		for(int i=0; i < number.length; i++) {
			Customer customer3 = new Customer(number[i], name[i], phone[i]);
			customers.add(customer3);
		}
	
		// ArrayList 모두 출력하기
		for(int i=0; i<customers.size(); i++) {
			System.out.println(customers.get(i).getNumber() + "/" + customers.get(i).getName() + 
					"/" +customers.get(i).getPhone());
		}
	}

}
