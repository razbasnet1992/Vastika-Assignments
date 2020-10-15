package com.vastika.sixthassignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int i =100;
		int a =0;
		int b =1;
		int temp=0;
		//0,1,1,2,3,5,8,13,21
		System.out.println("Fibonacci series :");
		while(temp<i) {
			temp = a+b;
			a=b;
			b=temp;
			if(temp>i)
				break;
			System.out.print(temp+" ");
			
		}
		
	}

}
