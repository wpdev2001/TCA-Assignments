package com.wp;

public class SwapNumbersDemo {
	
	public static void main(String[] args) {
		int a=10, b=20;
		
		System.out.println("VALUES BEFORE SWAPPING");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("VALUES AFTER SWAPPING");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

}
