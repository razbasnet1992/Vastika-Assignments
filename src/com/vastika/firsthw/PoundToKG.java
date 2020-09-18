package com.vastika.firsthw;

import java.util.Scanner;

public class PoundToKG {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of pounds to convert to kg :");
		  double pounds = sc.nextDouble();
		  double factor = 2.2;
		  System.out.printf(pounds +" lbs is equal to "+pounds/factor+"kgs");
		  
		  
	}

}
