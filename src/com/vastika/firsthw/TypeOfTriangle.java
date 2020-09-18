package com.vastika.firsthw;

import java.util.Scanner;

public class TypeOfTriangle {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first side :");
		double a = scanner.nextDouble();
		System.out.print("Enter second side :");
		double b = scanner.nextDouble();
		System.out.print("Enter third side :");
		double c = scanner.nextDouble();
		
		if(a + b <=c||b+c <=a||a+c<=b) {
			System.out.println("No traingle can be created");
		}
		else if(a==b &&a==c&&b==c) {
				System.out.println("Equilateral traingle");
			}
		
		else if(a ==b ||b==c||a==c) {
			System.out.println("Isoceles traingle");	
		}
		else if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a) {
			System.out.println("Right angled traingle");
		}
		else {
			System.out.println("Scalene traingle");
			
		}
		
		
	}

}
