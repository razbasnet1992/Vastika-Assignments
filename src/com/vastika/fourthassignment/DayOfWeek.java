package com.vastika.fourthassignment;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number between 1-7 :");
		int day = sc.nextInt();
		
		switch (day) {

		case 1:
			System.out.println("Its Monday");
			break;
		case 2:
			System.out.println("Its Tuesday");
			break;

		case 3:
			System.out.println("Its Wednesday");
			break;

		case 4:
			System.out.println("Its Thursday");
			break;

		case 5:
			System.out.println("Its Friday");
			break;

		case 6:
			System.out.println("Its Saturday");
			break;

		case 7:
			System.out.println("Its Sunday");
			break;

		default:
			System.out.println("Wrong input");
		}

	}

}
