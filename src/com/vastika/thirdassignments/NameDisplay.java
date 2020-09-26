package com.vastika.thirdassignments;

import java.util.Scanner;

class StudentInfo {
	int rollno;
	String name;
	String nationality;

	StudentInfo(int rollno, String name, String nationality) {
		this.rollno = rollno;
		this.name = name;
		this.nationality = nationality;
	}

	public void info() {
		System.out.println(
				"My name is " + name + "\nMy Roll number is " + rollno
				+ "\nI'm from " + nationality);
	}
}

	
public class NameDisplay{
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter your country : ");
		String nationality = sc.nextLine();
		
		
		System.out.print("Enter your roll no : ");
		int roll = sc.nextInt();
		
		
		StudentInfo student = new StudentInfo(roll,name,nationality);
		student.info();
		sc.close();

	}

}
