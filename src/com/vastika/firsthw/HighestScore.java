package com.vastika.firsthw;

import java.util.Scanner;

public class HighestScore {

	public static void main(String[] args) {
		
		double highest =0;
		String scorer=null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of students :");
		int numberOfStudents = scanner.nextInt();
		
		
		for(int i=1;i<=numberOfStudents;i++) {
			System.out.print("Enter name of a student :");
			String name = scanner.next();
			
			System.out.print("Enter score of a student :");
			double score = scanner.nextDouble();
			
			if(highest<score) {
				highest =score;
				scorer = name;
			}
				
			
		}
      System.out.println("The highest score is :"+highest+" by "+scorer);
	}

}
