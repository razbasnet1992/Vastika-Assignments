package com.vastika.firsthw;

import java.util.Scanner;

public class MiniCalculator {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first integer :");
		double num1 = scanner.nextDouble();
		System.out.print("Enter second integer :");
		double num2 = scanner.nextDouble();

		System.out.print("Enter operator :");
		char c = scanner.next().charAt(0);

		switch (c) {
			case '+': 
			System.out.println(num1 + num2);
			break;
		
			case '-': 
			System.out.println(num1 - num2);
			break;
		
			case '*': 
			System.out.println(num1 * num2);
			break;
		
			case '/': 
			System.out.println(num1 / num2);
			break;

		
			default:
				System.out.println("Invalid operator");
		}
	}
}
