package com.vastika.thirdassignments;

import java.util.Scanner;

public class Question10C {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a :");
		double a = scanner.nextDouble();
		System.out.println("Enter b :");
		double b = scanner.nextDouble();
		System.out.println("Enter c :");
		double c = scanner.nextDouble();
		double x1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		double x2 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		System.out.println(x1);
		System.out.println(x2);
	}

}
