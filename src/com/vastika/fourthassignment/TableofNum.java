package com.vastika.fourthassignment;

import java.util.Scanner;

public class TableofNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number :");
		int num1 = scanner.nextInt();
		System.out.println("Multiplication table :");
		for(int i =1;i<=10;i++) {
			int result = num1*i;
			System.out.println(num1+" * "+i+" = "+result);
		}

	}

}
