package com.vastika.secondassignment;

import java.util.Scanner;

public class MiniCalculator {
	public static void main(String[] args) {
		
	
	Integer a = Integer.valueOf(128);
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter first number :");
	double num1 = scanner.nextDouble();
	System.out.println("Enter second number :");
	double num2 = scanner.nextDouble();
	scanner.close();
	System.out.println("The difference of "+num1+" and "+num2+" is "+sum(num1,num2));
	System.out.println("The product of "+num1+" and "+num2+" is "+product(num1,num2));
	

	System.out.printf("When "+num1+" is divided by "+num2+", the result is "+"%.2f",divide(num1,num2));
	
	}
	static double sum(double a,double b) {
		return a-b;
	}
	static double product(double a,double b) {
			return a*b;
	}	
	static double divide(double a,double b) {
		return a/b;
	}
		
	}


