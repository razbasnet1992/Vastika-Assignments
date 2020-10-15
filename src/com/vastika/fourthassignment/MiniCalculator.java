package com.vastika.fourthassignment;

import java.util.Scanner;

public class MiniCalculator {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter operator :");
		char c = scanner.next().charAt(0);
		double num1=0;
		double num2 = 0;

		if (c == '+' || c == '-' || c == '/' || c == '*') {
			System.out.print("Enter first integer :");
			num1 = scanner.nextDouble();
			System.out.print("Enter second integer :");
			num2 = scanner.nextDouble();
		}
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
