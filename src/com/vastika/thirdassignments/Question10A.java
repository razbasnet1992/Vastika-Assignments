package com.vastika.thirdassignments;

import java.util.Scanner;

public class Question10A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter velocity :");
		double u = scanner.nextDouble();
		System.out.println("Enter acceleration :");
		double a = scanner.nextDouble();
		System.out.println("Enter time :");
		double t = scanner.nextDouble();

		double distance = u * t + 0.5 * a * Math.pow(t, 2);
		System.out.println("Total distance is " + distance);

	}

}
