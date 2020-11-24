package com.vastika.seventhassignment;

public class Person {
	String name;
	int roll;
	String nationality;
	Person(String name,int roll,String nationality){
		this.name = name;
		this.roll = roll;
		this.nationality = nationality;
		
	}
	
	public String toString() {
		return "Name :"+name +"\nRoll no :"+roll+"\nNationality is :"+nationality;
	}

	public static void main(String[] args) {
		Person person = new Person("Rajendra Basnet",10,"Nepalese");
		System.out.println(person);

	}

}
