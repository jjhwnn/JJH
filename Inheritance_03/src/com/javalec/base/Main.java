package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		
		// 본사(HQ), 샵1~3 객체 생성
//		StoreHQ hq = new StoreHQ();
//		
//		StoreShop1 shop1 = new StoreShop1();
//		
//		StoreShop2 shop2 = new StoreShop2();
//		
//		StoreShop3 shop3 = new StoreShop3();
//		
//		hq.orderKim();
//		hq.orderBu();
//		hq.orderBi();
//		hq.orderSoom();
//		hq.orderKong();
//		System.out.println("------------------");
//		shop1.orderKim();
//		shop1.orderBu();
//		shop1.orderBi();
//		shop1.orderSoom();
//		shop1.orderKong();
//		System.out.println("------------------");
//		shop2.orderKim();
//		shop2.orderBu();
//		shop2.orderBi();
//		shop2.orderSoom();
//		shop2.orderKong();
//		System.out.println("------------------");
//		shop3.orderKim();
//		shop3.orderBu();
//		shop3.orderBi();
//		shop3.orderSoom();
//		shop3.orderKong();
		
		StoreHQ[] store = {new StoreHQ(), new StoreShop1(), new StoreShop2(), new StoreShop3()};
		
		for(int i=0; i<store.length; i++) {
			
			store[i].orderKim();
			store[i].orderBu();
			store[i].orderBi();
			store[i].orderSoom();
			store[i].orderKong();
			System.out.println("-------------------");
		}
		
	}

}
