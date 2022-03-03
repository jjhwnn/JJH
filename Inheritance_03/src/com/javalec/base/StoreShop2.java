package com.javalec.base;

public class StoreShop2 extends StoreHQ {

	// 부대찌개 : 5000원
	@Override
	public void orderBu() {
		System.out.println("부대찌개(Shop2) : 5000원");
	}
	
	// 비빔밥 : 5000원
	@Override
	public void orderBi() {
		System.out.println("비빔밥(Shop2) : 5000원");
	}
	
	// 순대국 : 4000원
	@Override
	public void orderSoom() {
		System.out.println("순대국(Shop2) : 4000원");
	}
	
	
	// 공기밥 : 무료 입니다.
	@Override
	public void orderKong() {
		System.out.println("공기밥(Shop2) : 무료입니다.");
	}
	
	
}
