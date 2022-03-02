package com.javalec.function;

public class Gugudan {

	private int dan;
	
	public Gugudan () {}

	public Gugudan(int dan) {
		super();
		this.dan = dan;
	};
	
	public void gugudan() {
		for(int i = 1; i < 9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		}
		
	}
	
}
