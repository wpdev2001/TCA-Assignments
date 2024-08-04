package com.wp;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, res;
		String ch, user;

		do {

			System.out.println("Enter a : ");
			a = sc.nextInt();

			System.out.println("Enter b : ");
			b = sc.nextInt();

			System.out.println("Enter your choice: ");
			ch = sc.next();

			switch (ch) {
			case "+":
				res = a + b;
				System.out.println("Addition : " + res);
				break;

			case "-":
				res = a - b;
				System.out.println("Subtraction : " + res);
				break;

			case "*":
				res = a * b;
				System.out.println("Multiplication : " + res);
				break;

			case "/":
				res = a / b;
				System.out.println("Division : " + res);
				break;

			default:
				System.out.println("Invalid Input!!!");
				break;
			}

			System.out.println("Do you want to continue : Y or y :");
			user = sc.next();

		} while (user.equals("y") || user.equals("Y"));
	}
}
