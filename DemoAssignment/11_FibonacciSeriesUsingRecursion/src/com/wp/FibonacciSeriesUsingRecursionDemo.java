package com.wp;

public class FibonacciSeriesUsingRecursionDemo {
	
	static int a=0,c, b=1, n=10;
	
	static void calculateFibonacci(int n) {
		if(n>=1) {
			c = a+b;
			System.out.print(" " + c);
			a=b;
			b=c;
			calculateFibonacci(n-1);
		}
		
	}
	
	public static void main(String[] args) {
				
		System.out.print(a + " " + b);
		calculateFibonacci(n);
		
	}

}
