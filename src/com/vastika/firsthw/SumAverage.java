package com.vastika.firsthw;

import java.util.Scanner;

public class SumAverage {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number");
		int num2 = sc.nextInt();
		
		int sumofIntegers = sum(num1,num2);
		double averageofNums = average(num1,num2);
		System.out.println("Sum of "+num1+" and "+num2+" is: "+sumofIntegers);
		System.out.println("Average of "+num1+" and "+num2+" is: "+averageofNums);

	}

	static int sum(int x, int y) {
		return x + y;
	}

	static double average(int x, int y) {
		return (x + y) / 2.0;
	}
}
