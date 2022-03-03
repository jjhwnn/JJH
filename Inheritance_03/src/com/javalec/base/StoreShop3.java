package com.javalec.base;

public class StoreShop3 extends StoreHQ {

	public StoreShop3() {
		
	}
	
	// 김치찌개 : 6000원
	@Override
	public void orderKim() {
		System.out.println("김치찌개(Shop3) : 6000원");
	}
	
	// 부대찌개 : 7000원
	@Override
	public void orderBu() {
		System.out.println("부대찌개(Shop3) : 7000원");
	}
	
	// 비빔밥 : 7000원
	@Override
	public void orderBi() {
		System.out.println("비빔밥(Shop3) : 7000원");
	}
	
	// 순대국 : 6000원
	@Override
	public void orderSoom() {
		System.out.println("비빔밥(Shop3) : 6000원");
	}
	
}
