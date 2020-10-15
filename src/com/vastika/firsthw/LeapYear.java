package com.vastika.firsthw;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year :");
		int year = scanner.nextInt();

		boolean flag = true;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				flag = false;
			}
		} else
			flag = false;

		if (flag) {
			System.out.println("Leap year");
		} else
			System.out.println("It is not a leap year");
		scanner.close();
	}

}
