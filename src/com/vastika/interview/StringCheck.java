package com.vastika.interview;

import java.util.Scanner;

public class StringCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String string = sc.nextLine();
		//String string =null;
		
		if((string==null) ||string.isEmpty())
			System.out.println("Null or empty");
		else
			System.out.println(string.length());
		
	}
 
}
