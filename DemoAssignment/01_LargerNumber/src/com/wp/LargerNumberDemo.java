package com.wp;

public class LargerNumberDemo {

	public static void main(String[] args) {
		
		int a=40, b=70, c=80;
		
		if(a>b) {
			if(a>c)
			{
				System.out.println("a is greater number");
			}
			else {
				System.out.println("c is greater number");
			}
		}
		else if(b>c)
		{
			System.out.println("b is greater number");
		}
		else {
			System.out.println("c is greater number");
		}	
	}
}
