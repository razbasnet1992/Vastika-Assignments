package com.vastika.firsthw;

public class SwapNumbers {
	public static void main(String...args) {
		int a = 10;
		int b = 20;
		usingTemp(a,b);
		noTemp(a,b);
		
	}
	static void usingTemp(int a,int b) {
		int temp = a;
		a =b;
		b = temp;
		System.out.println("Numbers after swapping using temp are "+a +" and "+b);
		
	}
  static void noTemp(int a,int b) {
	  a = a + b;
	  b = a - b;
	  a = a - b;
	  System.out.println("Numbers after swapping without using temp are "+a +" and "+b);
	  
  }
}