package com.vastika.firsthw;

import java.util.Scanner;

public class NegativeNumber {
	public static void main(String...args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number :");
		int num = scanner.nextInt();
		if(num<0) {
			System.out.println(num);
		}
	}

}
