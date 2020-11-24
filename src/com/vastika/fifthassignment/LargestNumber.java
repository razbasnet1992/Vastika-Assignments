package com.vastika.fifthassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestNumber {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = scanner.nextInt();
        
		System.out.println("Enter second number :");
		int b = scanner.nextInt();
		
		System.out.println("Enter third number :");
		int c = scanner.nextInt();
		
		max(a,b,c);
		
	}

	public static void max(int x, int y, int z) {
		// if else
		if (x > y && x > z) {
			System.out.println(x + " is greater than " + y + " and " + z);
		} else if (y > z) {
			System.out.println(y + " is greater than " + x + " and " + z);
		} else
			System.out.println(z + " is the greatest number");

		// with Stream api
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(5);
		list.add(7);

		int maxNumber = list.stream().reduce(Integer.MIN_VALUE,(a,
				b)->Integer.max(a,b));
		 System.out.println("Using stream API :"+maxNumber);

		// Ternery Operator
		String r = (x > y && x > z) ? x + " is greater than " + y + " and " + z
				: (y > z) ? y + " is greater than " + x + " and " + z : z + " is the greatest number";
		System.out.println("Using ternery operator :" + r);
	}
}
