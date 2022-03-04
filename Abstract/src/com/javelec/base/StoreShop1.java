package com.javelec.base;

public class StoreShop1 extends StoreHQ{

	public StoreShop1() {
		
	}
	
	@Override
	public void orderKim() {
		System.out.println("김치찌개 : 4500원");
	}
	
	@Override
	public void orderBu() {
		System.out.println("부대찌개 : 5000원");
	}
	
	@Override
	public void orderBi() {
		System.out.println("비빔밥 : 4500원");
	}
	
	@Override
	public void orderSoon() {
		System.out.println("순대국 : 1000원");
	}

	@Override
	public void orderKong() {
		// TODO Auto-generated method stub
		
	}
	
}
