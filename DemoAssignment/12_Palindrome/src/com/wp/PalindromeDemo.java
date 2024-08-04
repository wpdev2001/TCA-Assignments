package com.wp;

import java.util.Scanner;

public class PalindromeDemo {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,rem,rev=0;
		
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		
		int temp = n; 
		while(n>0) {
			
			rem=n%10;
			rev = rev*10 + rem;
			n=n/10;
			
		}
		
		//CHECKING THE REVERSE
		System.out.println(rev);
		
		if(temp==rev) {
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT PALINDROME");
		}
	}

}
