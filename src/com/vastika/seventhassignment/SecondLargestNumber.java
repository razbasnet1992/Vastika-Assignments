package com.vastika.seventhassignment;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers? ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number :");
			arr[i] = scanner.nextInt();

		}

		// sort in ascending order
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// after sorting,max number is at arr.length-1, second largest at -2
		System.out.println(arr[arr.length - 2]);

		int largestNumber = arr[0]; // 9
		int secondLargest = arr[1]; // 7,3

		if (arr[0] < arr[1]) {
			largestNumber = arr[1];
			secondLargest = arr[0];

		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] <= largestNumber && arr[i] > secondLargest) { // 7
				secondLargest = arr[i];
			}
			if (arr[i] > largestNumber) {// 7>9
				secondLargest = largestNumber;
				largestNumber = arr[i];

			}
		}
		System.out.println("The largest number is :" + largestNumber);
		System.out.println("The second largest number is :" + secondLargest);
		scanner.close();
	}

}
