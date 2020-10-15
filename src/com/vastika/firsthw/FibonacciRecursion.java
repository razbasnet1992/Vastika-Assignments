package com.vastika.firsthw;

public class FibonacciRecursion {
	
	static int recursion(int n) {
		if(n<=3)
			return 1;
		
		else {
			int s1 = recursion(n-1);
			int s2 =recursion(n-2);
			return s1+s2;
	}
	}
	public static void main(String[] args) {
		
      System.out.println(recursion(9));

	}

}
