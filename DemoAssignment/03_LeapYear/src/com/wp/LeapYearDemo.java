package com.wp;

public class LeapYearDemo {
	
//Conditions for a leap year:
//	A year is a leap year if it is divisible by 4.
//	However, if the year is divisible by 100, it is not a leap year unless it is also divisible by 400.

	public static void main(String[] args) 
	{
		int year=2000;
		
		if((year%400==0) || (year%4==0 && year%100 != 0))
		{
			System.out.println("LEAP YEAR");
		}
		else {
			System.out.println("NOT LEAP YEAR");
		}
	}

}
