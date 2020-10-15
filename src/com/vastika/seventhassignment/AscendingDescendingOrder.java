package com.vastika.seventhassignment;

import java.util.Scanner;

public class AscendingDescendingOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements? ");
		int n = sc.nextInt();
		int[] num = new int[n];

		for (int i = 0; i < num.length; i++) { // taking elements for the array
			System.out.println("Enter number :");
			num[i] = sc.nextInt();

		}

		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {// swapping elements
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}

			}

		}
		System.out.println("Ascending order");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " "); // prints elements
		}

		// Ascending Order
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {// swaps elements
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}

			}

		}
		System.out.println("Descending order");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " "); // prints elements
		}

	}

}
