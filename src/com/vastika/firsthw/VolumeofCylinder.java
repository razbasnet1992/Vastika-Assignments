package com.vastika.firsthw;

import java.util.Scanner;

public class VolumeofCylinder {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter radius of cylinder :");
		double radius = scanner.nextDouble();

		System.out.print("Enter length of cylinder :");
		double length = scanner.nextDouble();
		
		 volume(radius,length);
	}
   static void volume(double r,double l) {
	   double pi = 3.14;
	   double volumeOfCylinder = pi*r*r*l;
	   System.out.println("Perimeter of circle is :" + volumeOfCylinder);
	   
	   
   }
}
