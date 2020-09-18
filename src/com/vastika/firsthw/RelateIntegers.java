package com.vastika.firsthw;

import java.util.Scanner;

public class RelateIntegers {
	public static void main(String...args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number :");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter second number :");
		int num2 = scanner.nextInt();
		
		if(num1 == num2) {
			System.out.println("Two numbers are equal");
		}
			else if(num1>num2) {
				System.out.println("First number is greater than second");
				
			}
			else
				System.out.println("Second number is greater than first");
		}
	}
	


