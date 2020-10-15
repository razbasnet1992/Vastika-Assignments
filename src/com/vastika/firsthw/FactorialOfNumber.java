package com.vastika.firsthw;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[]args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter positive number :");
	int number = scanner.nextInt();
	
	
	System.out.println("Factorial of "+number+" is "+factorial(number));
	
	}
	public static double factorial(int n) {
		
		if(n==0) 
			return 1;
		
		else {
			return n*factorial(n-1);
			
		}
	}

}
