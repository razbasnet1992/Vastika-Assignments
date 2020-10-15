package com.vastika.sixthassignment;

import java.util.Scanner;

public class FunctionPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int start = sc.nextInt();
		
		System.out.println("Enter second number :");
		int end= sc.nextInt();
		
		boolean result = isPrimeNumber(end);
		if(result)
			System.out.println(end+" is prime");
        
		else
			System.out.println(end+" is not a prime number");
		
		firstNthPrime(end);
		
		
		allPrimeBetween(start,end);
	}

	static boolean isPrimeNumber(int x) {
		
		boolean flag = true;

		if (x == 1 || x == 2)
			return true;

		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0)
				flag = false;

		}
		return flag;
	}

	public static void firstNthPrime(int end) {
		System.out.println("The prime numbers are :");
		for (int i = 1; i <= end; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}

	}
public static void allPrimeBetween(int start,int end) {
		System.out.println("\nThe prime numbers between "+start+" and "+end +" are :");
		for (int i = start; i <= end; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}

	}
}
