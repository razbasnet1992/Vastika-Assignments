package com.vastika.fifthassignment;

import java.util.Scanner;

public class CheckOddEven {
	public static boolean oddEven(int n) {
		if(n%2==0)
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check :");
		int num =  sc.nextInt();
		
		boolean result = oddEven(num);
		if(result)
			System.out.println("The number is even.");
		else
			System.out.println("The number is odd.");
		
		

	}

}
