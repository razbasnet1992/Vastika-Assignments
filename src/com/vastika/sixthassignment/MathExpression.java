package com.vastika.sixthassignment;

public class MathExpression {

	public static void main(String[] args) {
		int num = 3;
		MathExpression mathExpression = new MathExpression();
		double sum = mathExpression.sumOfExpression(num);
		System.out.println("The sum of numbers is :"+sum);
		//System.out.println(mathExpression.factorial(3));
		

	}
	
	public  double sumOfExpression(int m) {
	double sum =0;
		for(int i=1;i<=m;i++) {
				sum= sum + (double)i/factorial(i);
			
		}
		return sum;
	}
	public static int factorial(int n) {
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}

}
