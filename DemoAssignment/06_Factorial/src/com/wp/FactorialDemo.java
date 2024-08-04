package com.wp;

import java.util.Scanner;

public class FactorialDemo {
	
	int factorial(int n)
	{
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter the number to calculate Factorial : ");
		n = sc.nextInt();
		
		System.out.println("Factorial of " + n + " is : ");
		
	}
}
