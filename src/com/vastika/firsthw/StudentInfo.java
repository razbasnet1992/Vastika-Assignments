package com.vastika.firsthw;

public class StudentInfo {
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
				"My name is " + name + "\nRoll number is " + rollno
				+ "\nI'm from " + nationality);
	}

	

	public static void main(String... args) {
		StudentInfo student = new StudentInfo(1,"Rajendra","Nepal");
		student.info();

	}

}
