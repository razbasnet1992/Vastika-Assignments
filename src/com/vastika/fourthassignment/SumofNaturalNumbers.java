package com.vastika.fourthassignment;

import java.util.Scanner;

public class SumofNaturalNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number to calculate sum :");
		int num1 = scanner.nextInt();
		int sumOfNumbers =sum(num1);
		System.out.println("The sum of natural numbers until "+num1+" is :"+sumOfNumbers);
		

	}
    static int sum(int n) {
    	int sum =0;
    	for(int i=0;i<=n;i++) {
    		sum+= i;
    		
    	}
    	return sum;
    	
    }
}
