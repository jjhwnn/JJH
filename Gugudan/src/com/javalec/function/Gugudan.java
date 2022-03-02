package com.javalec.function;

public class Gugudan {

	private String[] dan = new String[9];
	private int danNum = 1;
	
//	public Gugudan () {}

	public Gugudan(int danNum) {
		super();
		this.danNum = danNum;
	};
	
//	public void gugudan() {
//		for(int i = 1; i < 9; i++) {
//			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//		}
//		
//	}
	
	public String[] gugudan() {
		for(int i = 0; i < dan.length; i++) {
			
			// 곱해지는 i는 i+1이므로 i % 2 == 1인 조건식으로 구해야한다.
			if(i % 2 == 1) {
				dan[i] = (danNum + " x " + "*" + " = " + (danNum*(i+1)));
				
			}else {
				dan[i] = (danNum + " x " + (i+1) + " = " + (danNum*(i+1)));
			}
			
		}
		return dan;
	}
	
	
	
}
