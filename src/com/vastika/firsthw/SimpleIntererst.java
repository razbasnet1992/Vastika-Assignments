package com.vastika.firsthw;

import java.util.Scanner;

public class SimpleIntererst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter principal amount : ");
		double principal = sc.nextDouble();
		
		System.out.print("Enter time : ");
		double time = sc.nextDouble();
		
		System.out.print("Enter interest rate : ");
		double rate = sc.nextDouble();
		
		System.out.print("Simple Interest is : "+simpleInterest(principal,time,rate));
		
		
		
	}
   static double simpleInterest(double p,double t,double r) {
	   
	   return (p*t*r)/100;
   }
}
