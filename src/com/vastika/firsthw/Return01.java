package com.vastika.firsthw;

public class Return01 {

	public static void main(String[] args) {
		int num =11;
		System.out.println(evenOdd(num));
		

	}
  public static int evenOdd(int n) {
	  if(n%2==0)
		  return 1;
	  else
		  return -1;
  }
}
