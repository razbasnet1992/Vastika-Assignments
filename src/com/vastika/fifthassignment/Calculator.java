package com.vastika.fifthassignment;

import java.util.Scanner;

public class Calculator {
	public static void main(String... args) {
		calc();  //calls method

	}

	public static void calc() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter operator :");
		char c = scanner.next().charAt(0);
		double num1 = 0;
		double num2 = 0;
		double result = 0;

		if (c == '+' || c == '-' || c == '/' || c == '*') {
			System.out.print("Enter first integer :");
			num1 = scanner.nextDouble();
			System.out.print("Enter second integer :");
			num2 = scanner.nextDouble();
		}
		switch (c) {
		case '+':
			result = num1 + num2;
			break;

		case '-':
			result = num1 - num2;
			break;

		case '*':
			result = num1 * num2;
			break;

		case '/':
			result = num1 / num2;
			break;

		default:
			System.out.println("Invalid operator");
			
			

		}System.out.println(result);

	}
}
