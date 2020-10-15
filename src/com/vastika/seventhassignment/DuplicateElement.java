package com.vastika.seventhassignment;

import java.util.Scanner;

public class DuplicateElement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elements? ");
		int n = scanner.nextInt();
		char[] ch = new char[n];

		for (int i = 0; i < ch.length; i++) { // taking elements for the array
			System.out.println("Enter number :");
			ch[i] = scanner.next().charAt(0);

		}
		int count = 1;
		System.out.println("Duplicate element are :");
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					if(count>1) {
						System.out.println(ch[i]);
				}
					
           
			}
				
		}
		
		}
		if(count==1)
			System.out.println("no duplicates");
		
	}
}
