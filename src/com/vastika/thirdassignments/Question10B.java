package com.vastika.thirdassignments;

import java.util.Scanner;

public class Question10B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a :");
		double a = scanner.nextDouble();
		System.out.println("Enter b :");
		double b = scanner.nextDouble();
		System.out.println("Enter c :");
		double c = scanner.nextDouble();
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area is "+area);
		

	}

}
