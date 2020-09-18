package com.vastika.firsthw;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Perimeter perimeter = new Perimeter();
		perimeter.triangle();
		perimeter.circle();
		perimeter.rectangle();

	}

	  Scanner sc = new Scanner(System.in);

	void triangle() {

		System.out.print("Enter first side of triangle :");
		double a = sc.nextDouble();

		System.out.print("Enter second side of triangle :");
		double b = sc.nextDouble();

		System.out.print("Enter third side of triangle :");
		double c = sc.nextDouble();

		double perimeter = a + b + c;
		System.out.println("Perimeter of triangle is :" + perimeter);
	}

	void circle() {
		System.out.print("Enter radius of circle :");
		double r = sc.nextDouble();
		double perimeter = (Math.PI* r * 2);
		System.out.println("Perimeter of circle is :" + perimeter);

	}

	void rectangle() {
		System.out.print("Enter base of rectangle:");
		double b = sc.nextDouble();

		System.out.print("Enter height of rectangle :");
		double h = sc.nextDouble();
		double perimeter = 2 * (b + h);
		System.out.println("Perimeter of rectangle is :" + perimeter);
	}
}
