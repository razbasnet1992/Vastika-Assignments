package com.vastika.firsthw;

import java.util.Scanner;

public class SumAndProduct {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number a number :");
		int n = scanner.nextInt();
		
		int sum =0;
		int product =1;
		while(n!=0) {
			int r = n%10;
			sum = sum +r;
			product = product*r; 
			n=n/10;
			
		}
		System.out.println("The sum is "+sum);
		System.out.println("The product is "+product);

	}

}
