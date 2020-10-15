package com.vastika.interview;

public class Tricks {

	public static void main(String[] args) {
		//Tricks obj = null;
		Tricks obj = new Tricks();
		System.out.println(obj.getClass());  //class path and name
		obj.nonStatic();
		obj.method1();
		
		

	}
  //can be called even if object is null
	public static void method1() {
		System.out.println("Can be called by null references");
	}
   //cannot be called if the object is null
	public void nonStatic() {
		System.out.println("Non-static method");
	}

}
