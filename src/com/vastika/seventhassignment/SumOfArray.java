package com.vastika.seventhassignment;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = scanner.nextInt();
		int[] array = new int[size];

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter number :");
			array[i] = scanner.nextInt();
			sum = sum + array[i];

		}
		System.out.println("The sum of array is " + sum);

		
		scanner.close();

	}

}
