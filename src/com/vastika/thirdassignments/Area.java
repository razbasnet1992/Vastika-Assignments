package com.vastika.thirdassignments;

import java.util.Scanner;

public class Area {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base :");
		double b = sc.nextDouble();
		
		System.out.print("Enter height :");
		double h = sc.nextDouble();
		
		System.out.print("Enter radius :");
		double r = sc.nextDouble();
		
		double areaTriangle = triangle(b,h);
		System.out.println("Area of traingle is :"+areaTriangle);
		
		double areaCircle = circle(r);
		System.out.println("Area of circle is :"+areaCircle);
		
		double areaRectangle = rectangle(b,h);
		System.out.println("Area of rectangle is :"+areaRectangle);
		
	}
  static double triangle(double base,double height) {
	  double area = 0.5*base*height;
	  return area;
  }
  static double circle(double radius) {
	  double area = (Math.PI*radius*radius)/2;
	  return area;
	  
  }
  static double rectangle(double base,double height) {
	  return base*height;
  }
}
